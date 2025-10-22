# Visual Documentation Assets

This directory contains screenshots and GIFs used in the main README.md for installation instructions.

## 📸 Required Images

### 1. Developer Options (GIF)
**Filename:** `enable-developer-options.gif`
**Content:** Screen recording showing:
- Opening Settings app
- Navigating to "About phone"
- Tapping "Build number" 7 times
- Success toast: "You are now a developer!"

**Recording Tips:**
- Use Android Studio's built-in screen recorder or `adb shell screenrecord`
- Keep recording under 10 seconds
- Use portrait orientation (9:16 aspect ratio)
- File size: <2MB (optimize with tools like ezgif.com or gifsicle)

**Command to record:**
```bash
adb shell screenrecord --size 720x1280 --bit-rate 2000000 /sdcard/dev-options.mp4
# Pull file and convert to GIF with FFmpeg or online tool
```

---

### 2. USB Debugging Toggle (GIF)
**Filename:** `enable-usb-debugging.gif`
**Content:** Screen recording showing:
- Opening Settings → Developer options
- Toggling "USB debugging" switch to ON
- Confirmation dialog: "Allow USB debugging?"

**Recording Tips:**
- Same as above
- Focus on the USB debugging toggle and confirmation dialog

---

### 3. USB Debugging Prompt (Screenshot)
**Filename:** `allow-usb-debugging.png`
**Content:** Screenshot of the prompt that appears when connecting device:
- Dialog title: "Allow USB debugging?"
- Checkbox: "Always allow from this computer"
- Buttons: "Cancel" and "OK"

**How to capture:**
```bash
# When prompt appears on device, run:
adb shell screencap -p /sdcard/usb-prompt.png
adb pull /sdcard/usb-prompt.png allow-usb-debugging.png
```

---

## 🎬 Creating GIFs

### Option 1: FFmpeg (High Quality)
```bash
# Convert MP4 to GIF
ffmpeg -i input.mp4 -vf "fps=10,scale=360:-1:flags=lanczos,palettegen" palette.png
ffmpeg -i input.mp4 -i palette.png -filter_complex "fps=10,scale=360:-1:flags=lanczos[x];[x][1:v]paletteuse" output.gif

# Optimize size
gifsicle -O3 --colors 128 output.gif -o enable-developer-options.gif
```

### Option 2: Online Tools
- **ezgif.com**: Upload MP4 → Convert to GIF → Optimize
- **cloudconvert.com**: MP4 to GIF conversion
- **gifski** (GUI tool): High-quality GIF encoder

### Option 3: Android Studio
1. Record screen: View → Tool Windows → Logcat → Screen Record (icon)
2. Stop recording after 10 seconds
3. Export as MP4, convert to GIF

---

## 📏 Specifications

| Asset Type | Format | Max Size | Dimensions | FPS |
|------------|--------|----------|------------|-----|
| GIF (animations) | .gif | 2 MB | 360px width | 10 fps |
| Screenshots | .png | 500 KB | 720px width | N/A |

**Why small sizes?**
- Faster README loading on GitHub
- Mobile-friendly (many users browse on phones)
- Accessibility (lower bandwidth usage)

---

## 🚫 Placeholder Notice

**Currently, these images are placeholders.** README.md references them but they don't exist yet.

**To contribute visual documentation:**
1. Record/capture images following specs above
2. Name files exactly as specified (case-sensitive)
3. Place in this directory (`docs/images/`)
4. Verify in README.md by previewing on GitHub
5. Submit PR with images

**Alternative:** Create an issue requesting visual documentation, and maintainers will add them.

---

## 📝 License

All screenshots and GIFs in this directory are:
- Licensed under Apache-2.0 (same as project)
- Captured from open-source Android system UI (no proprietary content)
- Safe for redistribution

If you contribute images, you agree to license them under Apache-2.0.
