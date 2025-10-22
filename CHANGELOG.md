# Changelog

All notable changes to this project will be documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.1.0/),
and this project adheres to [Semantic Versioning](https://semver.org/spec/v2.0.0.html).

---

## [Unreleased]

### Added
- Corporate mode toggle for certificate pinning bypass
- Captive portal detection (HTTP 511) with user guidance
- OkHttp connection pool telemetry

### Changed
- HTTP/2 now default (HTTP/1.1 fallback automatic)
- ExoPlayer buffer: 50s → 30s (max), 15s (min)

### Fixed
- Audio focus delay on BT disconnect (debounce 250→500ms)
- Rare ANR on cold start with large cache

---

## [1.0.0] - 2025-10-22

**Repository Type:** Hybrid (Documentation + Sample App)

### 📚 Documentation
- **Comprehensive guides** (6,500+ lines):
  - README.md with installation, memory optimization patterns, OEM compatibility notes
  - Turkish debug report (DEBUG_RAPORU_8_30_54.md) with detailed production troubleshooting
  - SECURITY.md with responsible disclosure policy
  - CONTRIBUTING.md with development guidelines
- **Offline documentation bundle**: `android-media-resilience-docs-v1.0.0.zip`
  - All markdown files, license, notices
  - Downloadable from GitHub Releases

### 📱 Sample Application
- **Minimal demo app** (`sample-release.apk`):
  - **Memory Profiling**: Display system and app RAM usage
    - Shows total/used/available system memory
    - App heap usage tracking
    - Samsung Device Care optimization tips
  - **Cache Management**: Show cache size and clear functionality
    - Calculate current cache directory size
    - One-tap cache clearing
    - Best practices for media app cache limits (250-500 MB)
  - **Documentation Links**: Navigate to GitHub repository and guides
- **Technology stack**:
  - Material Design 3 components
  - ViewBinding for type-safe UI access
  - Kotlin 1.9.20
  - Min SDK: Android 8.0 (API 26)
  - Target SDK: Android 14 (API 34)
  - ProGuard enabled for release builds

### 🔧 Infrastructure
- **GitHub Actions CI/CD**:
  - Automated sample app builds on tag push
  - Documentation bundle creation (ZIP)
  - SHA-256 checksum generation (`CHECKSUMS.txt`)
- **Issue templates** (bug report, feature request)
- **Security policy** with GitHub Security Advisory integration
- **Apache-2.0 license** with full third-party attributions

### ⏳ Coming in v1.1.0
- **Core library (AAR)** for drop-in integration
- Network resilience module (VPN/proxy compatibility)
- Media playback module (foreground service, AudioFocus)
- OEM compatibility module (Samsung/MIUI battery optimizations)
- Memory optimization utilities

### 📝 Notes
- This release focuses on **documentation and demonstration**
- Sample app is **NOT a production library** - it demonstrates patterns only
- For full library implementation, see roadmap for v1.1.0+
- All code and documentation is trademark-free and legally safe

---

## Version Comparison Links

[Unreleased]: https://github.com/emircanoz2020-stack/android-media-resilience/compare/v1.0.0...HEAD
[1.0.0]: https://github.com/emircanoz2020-stack/android-media-resilience/releases/tag/v1.0.0

---

## Release Schedule

- **Major releases** (1.x.0): Quarterly (new modules, breaking changes)
- **Minor releases** (1.0.x): Monthly (features, non-breaking improvements)
- **Patch releases** (1.0.0-patch): As needed (critical bugs, security fixes)
- **Security patches**: Within 7-30 days (severity-based)

## Contributing

See [CONTRIBUTING.md](./CONTRIBUTING.md) for guidelines on proposing changes.

## License

Apache License 2.0 - see [LICENSE](./LICENSE)
