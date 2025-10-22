@echo off
REM Android Media Resilience - Sample App Installer
REM Place this file in the same directory as sample-release.apk

set APK=sample-release.apk
set PACKAGE=dev.yourname.mediaresilience.sample

echo ========================================
echo Android Media Resilience - Sample App Installer
echo ========================================
echo.

echo [1/4] Checking ADB connection...
adb devices
if %ERRORLEVEL% NEQ 0 (
    echo ERROR: ADB not found. Install Android Platform Tools.
    goto :error
)

echo.
echo [2/4] Installing %APK%...
if not exist "%APK%" (
    echo ERROR: %APK% not found in current directory.
    echo Please place install.bat in the same folder as %APK%
    goto :error
)

adb install -r %APK%
if %ERRORLEVEL% NEQ 0 (
    echo.
    echo Installation failed. See error message above.
    goto :error
)

echo.
echo [3/4] Verifying installation...
adb shell dumpsys package %PACKAGE% | findstr /I versionCode
adb shell dumpsys package %PACKAGE% | findstr /I versionName

echo.
echo [4/4] Post-install recommendations...
echo TIP: For optimal performance on Samsung/MIUI devices:
echo   1. Disable battery optimization for this app
echo   2. Lock app in Recents to prevent RAM cleanup
echo   3. Grant necessary permissions when prompted

echo.
echo ========================================
echo Installation successful!
echo ========================================
echo.
echo Sample app features:
echo - Network resilience demonstration
echo - OEM compatibility testing
echo - Cache management UI
echo - Memory profiling tools
echo.
pause
exit /b 0

:error
echo.
echo ========================================
echo Installation FAILED!
echo ========================================
echo.
echo Common causes:
echo - ADB not installed or not in PATH
echo - Device not connected or unauthorized
echo - Signature mismatch (uninstall old version: adb uninstall %PACKAGE%)
echo - Lower versionCode (use: adb install -r -d %APK% for downgrade)
echo - APK file not found in current directory
echo.
echo Troubleshooting:
echo 1. Run 'adb devices' and check device appears
echo 2. Check phone screen for "Allow USB debugging" prompt
echo 3. Verify APK filename is exactly: %APK%
echo 4. Try manual install: adb install -r %APK%
echo.
pause
exit /b 1
