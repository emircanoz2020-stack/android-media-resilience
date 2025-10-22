# Security Policy

We appreciate the security research community's efforts in responsibly disclosing vulnerabilities.

---

## Supported Versions

Only the latest **minor** version line receives security updates. Security patches may be released outside the regular release cycle.

| Version | Supported          |
| ------- | ------------------ |
| 1.x.x   | ✅ Active support  |
| < 1.0   | ❌ No support      |

---

## Scope

**In scope:**
- Codebase and compiled application
- CI/CD workflows and release artifacts
- Third-party dependency usage within the project

**Out of scope:**
- Third-party service infrastructure
- Social engineering, DDoS, spam
- OEM-specific bugs from legacy/customized Android versions

---

## How to Report

**DO NOT** open a public issue for security vulnerabilities.

**IMPORTANT:** Do NOT use the regular bug report template for security issues.

**Reporting channels (in order of preference):**

### 1. GitHub Security Advisory (PRIMARY)
   - Navigate to [Security Advisories](https://github.com/emircanoz2020-stack/android-media-resilience/security/advisories)
   - Click **"Report a vulnerability"**
   - Private disclosure, CVE assignment support
   - Preferred for triage and coordinated disclosure

### 2. Email (SECONDARY)
   - **Address:** `security@yourdomain.com`
   - **Subject:** `[SECURITY] <Brief Description>`
   - **Auto-reply:** You'll receive acknowledgment within 7 days

   **Setup notes for maintainers:**
   - Use alias/distribution list, NOT personal email
   - Configure SPF/DKIM/DMARC (p=quarantine minimum)
   - Filter executable attachments to quarantine
   - Auto-response: "Report received. Initial response: 7 days. Fix timeline: 30-90 days. Do not disclose publicly until patch release."

### 3. Encrypted Communication (OPTIONAL)
   - **PGP Public Key:** https://yourdomain.com/.well-known/pgp-security.asc
   - Only if you need confidentiality beyond GitHub's private advisory
   - Not required, but available for sensitive reports

**Include in your report:**
- Affected version(s) and environment
- Steps to reproduce
- Impact (privilege escalation, data leakage, RCE, etc.)
- Proof of Concept (PoC) if available (code, video, screenshots)
- **Avoid:** Large attachments (>10MB), executables, live user data access

---

## SLA / Timeline (Target)

| Phase | Target Timeline |
|-------|-----------------|
| **Initial response** | 7 days |
| **Initial assessment & scope validation** | 14 days |
| **Fix/mitigation development** | 30-90 days (depending on complexity) |
| **Release & acknowledgment** | Upon patch release, researcher credited if desired |

**Severity-based prioritization:**

| Severity | Examples | Target Fix Timeline |
|----------|----------|---------------------|
| **Critical** | RCE, authentication bypass, SQLi | 30 days |
| **High** | Privilege escalation, data leakage | 60 days |
| **Medium** | XSS, CSRF, DoS | 90 days |
| **Low** | Information disclosure | Best effort |

---

## Responsible Disclosure

- **Do not** publicly disclose details until a fix is released
- **Do not** share the vulnerability with third parties
- **Avoid** accessing live user data unless absolutely necessary for PoC
- **Limit** the scope of testing to avoid service disruption

We commit to:
- Acknowledge receipt within 7 days
- Keep you informed of progress
- Credit you in release notes (if desired)
- Not pursue legal action for good-faith research

---

## Safe Harbor

Good-faith security research conducted under this policy, and in compliance with applicable laws, will **not** result in legal action from us.

**Guidelines:**
- Avoid destructive testing (data loss, service interruption)
- Use test accounts, not production user data
- Report findings promptly
- Respect user privacy

---

## Recognition

Security researchers who responsibly disclose vulnerabilities will be acknowledged in:
- Release notes (CHANGELOG.md)
- Security hall of fame (if established)
- Public thanks on social media (with permission)

**Past contributors:**
- [Name] - [Vulnerability type] - [Date]
- (List will be updated as reports are resolved)

---

## Security Best Practices (For Users)

### APK Verification
Always verify downloaded APKs using checksums:
```bash
sha256sum -c CHECKSUMS.txt
```

### Official Sources Only
Download from:
- ✅ GitHub Releases: https://github.com/emircanoz2020-stack/android-media-resilience/releases
- ❌ Third-party APK mirrors (untrusted)

### Keep Updated
- Enable notifications for new releases
- Update promptly when security patches are released

### Report Suspicious APKs
If you find a suspicious APK claiming to be from this project, report it to `security@<your-domain>`.

---

## Third-Party Dependencies

We monitor dependencies for known vulnerabilities using:
- **Dependabot** (GitHub automated alerts)
- **OWASP Dependency-Check** (CI/CD integration)
- **Snyk** (optional - commercial scanning)

See [THIRD_PARTY_LICENSES/](./THIRD_PARTY_LICENSES/) for full dependency list.

---

## Security Updates

Security patches are announced via:
- GitHub Releases (with `[SECURITY]` tag)
- CHANGELOG.md (with `### Security` section)
- GitHub Security Advisories

Subscribe to releases: **Watch → Custom → Releases**

---

## Contact

**Security Team:**
- **Primary:** GitHub Security Advisory (https://github.com/emircanoz2020-stack/android-media-resilience/security/advisories)
- **Email:** `security@yourdomain.com` (alias/distribution list)
- **PGP Key:** https://yourdomain.com/.well-known/pgp-security.asc (optional)
- **GitHub:** [@emircanoz2020-stack](https://github.com/emircanoz2020-stack)

**Response hours:** Mon-Fri 9:00-17:00 UTC (excluding holidays)

**Email setup (for maintainers):**
- Create `security@` alias forwarding to team members
- Enable SPF/DKIM/DMARC (p=quarantine → p=reject)
- Filter rules: quarantine .exe/.zip/.scr attachments
- Auto-reply with SLA timeline

---

## Maintenance Ritual (For Maintainers)

**Monthly security inbox audit:**
- Review `security@` inbox, measure false report ratio
- Analyze DMARC reports, fix unauthorized senders
- Document SLA violations in CHANGELOG (if any)

**Quarterly dependency review:**
- Run `./gradlew dependencyUpdates`
- Review Dependabot alerts, prioritize Critical/High
- Update THIRD_PARTY_LICENSES if dependencies changed

**After each release:**
- Upload ProGuard mapping.txt to Play Console (crash deobfuscation)
- Verify CHECKSUMS.txt published with release
- Monitor crash-free rate (target: ≥99.5%)

---

## Legal

This security policy is governed by the laws of [Your Jurisdiction]. By reporting a vulnerability, you agree to this policy.

**Last updated:** 2025-10-22

---

**Thank you for helping keep this project secure!**
