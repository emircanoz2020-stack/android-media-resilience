# Contributing Guide

Thank you for contributing! The following guidelines help PRs merge quickly and smoothly.

---

## Code of Conduct

This repository follows the [Contributor Covenant](https://www.contributor-covenant.org/) principles. Be respectful and inclusive.

---

## How to Get Started

1. **Open an issue** or jump into an existing one. Look for `good first issue` and `help wanted` labels.

2. **Fork the repository** and branch from `main`:
   ```bash
   git checkout -b feat/<short-description>
   # Or: fix/<issue-number> / docs/<topic>
   ```

3. **Development environment:**
   - Android Studio Hedgehog (2023.1.1) or later
   - JDK 17
   - Android Gradle Plugin compatible version
   - minSdk/targetSdk: As specified in README.md

---

## Build and Test

### Debug Build
```bash
./gradlew clean assembleDebug
```

### Run Tests
```bash
# Unit tests
./gradlew testDebugUnitTest

# Static analysis
./gradlew detekt ktlintCheck lintVitalRelease
```

### Instrumented Tests (if applicable)
```bash
./gradlew connectedDebugAndroidTest
```

---

## Code Style

### Kotlin
- Follow [Kotlin Coding Conventions](https://kotlinlang.org/docs/coding-conventions.html)
- Use **4 spaces** for indentation (no tabs)
- Max line length: **120 characters**

### Formatting
```bash
# Auto-format code
./gradlew ktlintFormat

# Check formatting
./gradlew ktlintCheck
```

### Static Analysis
```bash
# Detekt (code quality)
./gradlew detekt

# Android Lint
./gradlew lintVitalRelease
```

### File Headers
All Kotlin/Java files must include SPDX license header:
```kotlin
/*
 * SPDX-License-Identifier: Apache-2.0
 * Copyright (c) 2025 <YourName or Org>
 */
```

---

## Commit Message Format

Follow [Conventional Commits](https://www.conventionalcommits.org/):

```
<type>(<scope>): <subject>

<body>

<footer>
```

**Types:**
- `feat`: New feature
- `fix`: Bug fix
- `docs`: Documentation only
- `style`: Code formatting (no logic change)
- `refactor`: Code refactoring (no feature/fix)
- `test`: Adding/updating tests
- `chore`: Build, CI, dependencies

**Examples:**
```
feat(media): Add BT headset debounce (250-500ms)

Prevents audio glitches on BT reconnect by delaying audio focus
recovery by 250-500ms.

Closes #42
```

```
fix(network): Resolve certificate pinning crash on corporate proxies

Added corporate mode toggle to bypass cert pinning when MITM
proxy is detected.

Fixes #58
```

**Turkish Examples:**
```
feat(player): audio focus için debounce eklendi
fix(app): Application.getProcessName fallback düzeltildi
chore(ci): release workflow cache ayarları
```

---

## PR Scope Guidelines

**Keep PRs small and focused:**
- Single feature or bug fix per PR
- Avoid mixing refactoring with feature work
- Split large features into multiple PRs

**Requirements:**
- [ ] Tests added (unit/instrumented)
- [ ] Documentation updated (README/CHANGELOG if applicable)
- [ ] CI passes (all checks green)
- [ ] Code review comments addressed

---

## License and DCO

By contributing, you agree that your contributions will be licensed under **Apache License 2.0**.

Opening a PR constitutes acceptance of the Developer Certificate of Origin (DCO):
- You certify the work is original or properly attributed
- You have the right to submit it under the Apache-2.0 license
- You understand the contribution becomes part of the public record

---

## Pull Request Process

### Before Submitting

**Checklist:**
- [ ] All tests pass (`./gradlew testDebugUnitTest`)
- [ ] Lint checks pass (`./gradlew lintVitalRelease`)
- [ ] Code formatted (`./gradlew ktlintFormat`)
- [ ] Static analysis clean (`./gradlew detekt`)
- [ ] CHANGELOG.md updated (if user-facing change)
- [ ] Screenshots attached (if UI change)
- [ ] Branch is up-to-date with `main`

### PR Template

```markdown
## Description
Brief description of changes.

## Type of Change
- [ ] Bug fix (non-breaking change)
- [ ] New feature (non-breaking change)
- [ ] Breaking change (fix/feature that breaks existing functionality)
- [ ] Documentation update

## Testing
- [ ] Unit tests added/updated
- [ ] Instrumented tests added/updated (if applicable)
- [ ] Manual testing performed on:
  - [ ] Android 8 (API 26)
  - [ ] Android 13+ (API 33+)
  - [ ] Samsung OneUI
  - [ ] MIUI (if applicable)

## Checklist
- [ ] Code follows project style guidelines
- [ ] Self-review completed
- [ ] Comments added for complex logic
- [ ] CHANGELOG.md updated
- [ ] No new warnings introduced

## Screenshots (if UI change)
Before / After screenshots or video.

## Related Issues
Closes #<issue_number>
```

### Review Process

1. **Automated checks** (CI):
   - Unit tests
   - Lint
   - Detekt
   - ktlint

2. **Code review** (1-3 business days):
   - At least 1 approval required
   - Maintainers may request changes

3. **Merge**:
   - Squash and merge (default)
   - Rebase and merge (for multi-commit features)

---

## Branching Strategy

```
main (protected)
  └─ feat/vpn-compatibility
  └─ fix/bt-audio-focus
  └─ docs/update-readme
```

**Branch naming:**
- `feat/<feature-name>`: New features
- `fix/<issue-number>`: Bug fixes
- `docs/<topic>`: Documentation
- `refactor/<component>`: Refactoring
- `test/<component>`: Test improvements

**Protected branches:**
- `main`: Requires PR + review
- Direct commits not allowed

---

## Development Workflow

### 1. Create Feature Branch
```bash
git checkout main
git pull origin main
git checkout -b feat/my-feature
```

### 2. Develop
```bash
# Make changes
# Run tests frequently
./gradlew testDebugUnitTest

# Format code
./gradlew ktlintFormat
```

### 3. Commit
```bash
git add .
git commit -m "feat(scope): Short description

Detailed explanation of changes.

Closes #42"
```

### 4. Push and Create PR
```bash
git push origin feat/my-feature
# Create PR on GitHub
```

### 5. Address Review Feedback
```bash
# Make requested changes
git add .
git commit -m "refactor: Address review feedback"
git push origin feat/my-feature
```

### 6. Squash Commits (before merge)
```bash
# Interactive rebase
git rebase -i main

# Squash all commits into one
# Force push (only on your branch!)
git push --force origin feat/my-feature
```

---

## Testing Guidelines

### Unit Tests
- **Location:** `app/src/test/`
- **Framework:** JUnit 5, MockK
- **Coverage:** Aim for >80% on new code

**Example:**
```kotlin
@Test
fun `audio focus debounce delays recovery by 250ms`() {
    val audioFocusManager = AudioFocusManager(context)

    // Simulate BT disconnect
    audioFocusManager.onAudioFocusLoss()

    // Immediate check (should not recover yet)
    assertThat(audioFocusManager.hasFocus()).isFalse()

    // After 300ms (should recover)
    delay(300)
    assertThat(audioFocusManager.hasFocus()).isTrue()
}
```

### Instrumented Tests (if needed)
- **Location:** `app/src/androidTest/`
- **Framework:** Espresso, AndroidJUnit4
- **Use cases:** UI tests, database tests, integration tests

---

## Documentation

### Code Comments
- Use KDoc for public APIs:
  ```kotlin
  /**
   * Manages audio focus with BT headset debounce.
   *
   * @param debounceMs Delay in milliseconds (default 250ms)
   * @return True if focus acquired
   */
  fun requestAudioFocus(debounceMs: Int = 250): Boolean
  ```

### README Updates
Update README.md when:
- New features are added
- Requirements change (minSdk, dependencies)
- Build instructions change

### CHANGELOG Updates
Add entry to CHANGELOG.md under `[Unreleased]`:
```markdown
## [Unreleased]

### Added
- BT headset audio focus debounce (250-500ms)

### Fixed
- Certificate pinning crash on corporate proxies
```

---

## Dependency Updates

### Adding Dependencies
1. Check license compatibility (Apache-2.0, MIT, BSD)
2. Update `libs.versions.toml`:
   ```toml
   [versions]
   okhttp = "4.12.0"

   [libraries]
   okhttp = { module = "com.squareup.okhttp3:okhttp", version.ref = "okhttp" }
   ```

3. Run license report:
   ```bash
   ./gradlew generateLicenseReport
   ```

4. Update THIRD_PARTY_LICENSES/:
   - Add LICENSE file for new dependency
   - Update THIRD_PARTY_LICENSES/README.md

### Updating Dependencies
1. Update version in `libs.versions.toml`
2. Test thoroughly
3. Update CHANGELOG.md:
   ```markdown
   ### Changed
   - Updated OkHttp 4.11.0 → 4.12.0
   ```

---

## Security

### Reporting Vulnerabilities
See [SECURITY.md](./SECURITY.md) for responsible disclosure process.

### Security Checklist
- [ ] No secrets committed (keystore, API keys, tokens)
- [ ] Input validation for user data
- [ ] Secure network communication (TLS 1.2+)
- [ ] ProGuard/R8 rules for sensitive code

---

## Release Process (Maintainers Only)

### 1. Version Bump
```bash
# Update build.gradle.kts
versionCode = 10301
versionName = "1.3.1"

# Update CHANGELOG.md
## [1.3.1] - 2025-11-15
### Fixed
- ...
```

### 2. Build and Test
```bash
./gradlew clean testDebugUnitTest lintVitalRelease
./gradlew assembleRelease
./gradlew cyclonedxBom
```

### 3. Generate Checksums
```bash
cd app/build/outputs/apk/release
sha256sum app-release.apk > CHECKSUMS.txt
```

### 4. Create Signed Tag
```bash
git tag -s v1.3.1 -m "Release v1.3.1 - Bug fixes"
git push origin v1.3.1
```

### 5. GitHub Release
- GitHub Actions automatically builds and publishes
- Attach: APK, mapping.txt, CHECKSUMS.txt, bom.json

---

## Communication

### Where to Ask Questions
- **GitHub Discussions**: General questions, feature ideas
- **GitHub Issues**: Bug reports, feature requests
- **Pull Requests**: Code-specific questions

### Response Time
- **Issues**: 1-3 business days
- **Pull Requests**: 1-3 business days for initial review
- **Security**: 7 days (see SECURITY.md)

---

## Recognition

Contributors are recognized in:
- CHANGELOG.md (release notes)
- GitHub contributor list
- Special thanks in major releases

---

## License

By contributing, you agree that your contributions will be licensed under the Apache License 2.0.

See [LICENSE](./LICENSE) for details.

---

## Additional Resources

- [Kotlin Style Guide](https://kotlinlang.org/docs/coding-conventions.html)
- [Conventional Commits](https://www.conventionalcommits.org/)
- [Keep a Changelog](https://keepachangelog.com/)
- [Semantic Versioning](https://semver.org/)
- [Android Best Practices](https://developer.android.com/topic/architecture/recommendations)

---

**Thank you for contributing!** 🎉
