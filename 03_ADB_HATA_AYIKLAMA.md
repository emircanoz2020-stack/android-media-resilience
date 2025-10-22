# ADB ile YouTube Music ReVanced Hata Ayıklama
**Samsung A34 için Detaylı Rehber**

---

## ADB Nedir?

**Android Debug Bridge (ADB)**, bilgisayardan Android cihazınızı kontrol etmenize ve log kayıtlarını almanıza yarayan bir araçtır.

---

## Adım 1: ADB Kurulumu (Windows)

### Platform Tools İndirme
```
1. https://developer.android.com/studio/releases/platform-tools adresine git
2. "Download SDK Platform-Tools for Windows" tıkla
3. ZIP dosyasını indir (yaklaşık 10MB)
4. ZIP'i çıkar: C:\platform-tools (önerilen konum)
```

### Sistem Path'e Ekleme (İsteğe Bağlı ama Önerilen)
```
1. Başlat → "ortam değişkenleri" ara
2. "Sistem ortam değişkenlerini düzenle" aç
3. "Ortam Değişkenleri" butonuna tıkla
4. Sistem değişkenlerinde "Path" seç → "Düzenle"
5. "Yeni" → "C:\platform-tools" ekle
6. Tamam → Tamam → Tamam
7. CMD'yi kapat ve yeniden aç
```

---

## Adım 2: Telefonunu Hazırla

### USB Hata Ayıklama Aç (A34)

#### Geliştirici Seçeneklerini Aktifleştir
```
1. Ayarlar → Telefon Hakkında
2. "Yazılım Bilgileri" tıkla
3. "Yapı Numarası" üzerine 7 kez dokunun
4. "Geliştirici oldunuz!" mesajı çıkacak
```

#### USB Hata Ayıklama Aç
```
1. Ayarlar → Geliştirici Seçenekleri
   (Bazen: Ayarlar → Ek Ayarlar → Geliştirici Seçenekleri)
2. "USB Hata Ayıklama" açık konuma getir
3. "USB Yükleme (ADB)" de açık olmalı
```

---

## Adım 3: Telefonu Bilgisayara Bağla

### Bağlantı Kurma
```
1. USB kablosunu bilgisayara ve telefona tak
2. Telefonda "USB Kullanımı" popup'ı gelecek
3. "Dosya Aktarımı" veya "MTP" seç
4. "USB Hata Ayıklamaya İzin Ver" popup'ı gelirse:
   → "İzin Ver" tıkla
   → "Bu bilgisayara her zaman izin ver" işaretle
```

### Bağlantıyı Test Et (CMD)
```cmd
# CMD veya PowerShell aç (Windows + R → cmd)
cd C:\platform-tools
adb devices
```

**Beklenen Çıktı:**
```
List of devices attached
RF8R10ABCDE     device
```

**Eğer "unauthorized" çıkarsa:**
- Telefonda izin popup'ını kontrol et
- "İzin Ver" bas

**Eğer boş liste gelirse:**
- USB kablosunu değiştir
- USB Debug'ı kapat/aç
- Telefonu yeniden başlat

---

## Adım 4: YouTube Music Loglarını Al

### Canlı Log İzleme (Realtime)

#### YouTube Music'i Temiz Başlat
```cmd
# Önce uygulamayı kapat (telefonda)
adb shell am force-stop com.google.android.apps.youtube.music

# Log izlemeyi başlat
adb logcat -c  # Eski logları temizle
adb logcat | findstr "youtube.music"
```

#### Uygulamayı Başlat ve İzle
```
1. Telefonda YouTube Music'i aç
2. CMD ekranında loglar akmaya başlayacak
3. Müzik çalmaya çalış
4. Çökme/hata olursa logları kaydet
```

### Log Dosyasına Kaydetme
```cmd
# Tüm logları dosyaya kaydet
adb logcat -d > C:\Users\ASUS\OneDrive\Belgeler\REVANCED\logcat_full.txt

# Sadece YouTube Music logları
adb logcat -d | findstr "youtube.music" > C:\Users\ASUS\OneDrive\Belgeler\REVANCED\yt_music_log.txt

# Sadece hatalar (Errors)
adb logcat -d *:E > C:\Users\ASUS\OneDrive\Belgeler\REVANCED\errors.txt
```

---

## Adım 5: Spesifik Hata Tipleri

### Error 400 / Server Hatası
```cmd
# API call hatalarını izle
adb logcat -d | findstr "400\|HTTP\|ERROR" > C:\Users\ASUS\OneDrive\Belgeler\REVANCED\error400.txt
```

### Çökme (Crash) Logları
```cmd
# Crash raporlarını al
adb logcat -d | findstr "FATAL\|AndroidRuntime" > C:\Users\ASUS\OneDrive\Belgeler\REVANCED\crash.txt
```

### Ağ İstekleri (Network)
```cmd
# Network sorunlarını tespit et
adb logcat -d | findstr "network\|connection\|timeout" > C:\Users\ASUS\OneDrive\Belgeler\REVANCED\network.txt
```

---

## Adım 6: Uygulama Bilgilerini Al

### YouTube Music Detayları
```cmd
# Paket bilgisi
adb shell dumpsys package com.google.android.apps.youtube.music

# Kurulu versiyon
adb shell dumpsys package com.google.android.apps.youtube.music | findstr "versionName"

# İzinler
adb shell dumpsys package com.google.android.apps.youtube.music | findstr "permission"
```

### microG Durumu
```cmd
# microG kurulu mu?
adb shell pm list packages | findstr "gmscore"

# microG versiyonu
adb shell dumpsys package com.mgoogle.android.gms | findstr "version"
```

---

## Adım 7: İleri Seviye Hata Ayıklama

### Cache ve Data Temizleme (ADB ile)
```cmd
# Cache temizle
adb shell pm clear com.google.android.apps.youtube.music

# UYARI: Tüm verileri siler (giriş bilgileri, ayarlar)
```

### APK Bilgilerini Çıkar
```cmd
# Kurulu APK'nın yolunu bul
adb shell pm path com.google.android.apps.youtube.music

# APK'yı bilgisayara kopyala (analiz için)
adb pull /data/app/~~xxxxx/com.google.android.apps.youtube.music-yyyyy/base.apk C:\Users\ASUS\OneDrive\Belgeler\REVANCED\current_apk.apk
```

### ReVanced Yamalarını Kontrol Et
```cmd
# Uygulama hakkında detaylı bilgi
adb shell dumpsys package com.google.android.apps.youtube.music > C:\Users\ASUS\OneDrive\Belgeler\REVANCED\app_info.txt

# Dosyada şunları ara:
# - versionName (YouTube Music versiyonu)
# - installer (kim kurdu - ReVanced olmalı)
# - signatures (imza bilgisi)
```

---

## Yaygın Hata Mesajları ve Anlamları

### 1. "java.lang.RuntimeException: Unable to start activity"
**Anlam:** Uygulama başlatılamıyor, yama hatası olabilir
**Çözüm:** Uygulamayı kaldır, tekrar yamala

### 2. "com.google.android.gms not found"
**Anlam:** microG kurulu değil veya tanınmıyor
**Çözüm:** microG'yi kur/yeniden yükle

### 3. "HTTP 400 Bad Request"
**Anlam:** Server isteği reddediyor
**Çözüm:** "Spoof client" yamasını kullan

### 4. "FATAL EXCEPTION: main"
**Anlam:** Uygulama çöktü (crash)
**Çözüm:** Sonraki satırları oku, hangi fonksiyon çöküyor?

### 5. "Permission denied"
**Anlam:** Gerekli izinler verilmemiş
**Çözüm:** Ayarlar → Uygulamalar → İzinler kontrol et

---

## Adım 8: Logları Paylaş/Analiz Et

### Log Dosyalarını GitHub'a Raporla
Eğer sorunu kendin çözemediysen:

```
1. C:\Users\ASUS\OneDrive\Belgeler\REVANCED\ klasöründeki log dosyalarını aç
2. Kişisel bilgileri sil (hesap isimleri, cihaz ID'leri)
3. https://github.com/ReVanced/revanced-patches/issues adresine git
4. "New Issue" tıkla
5. Log'u yapıştır
6. Hangi versiyonları kullandığını belirt:
   - YouTube Music versiyonu
   - ReVanced Manager versiyonu
   - Patches versiyonu
   - Android versiyonu
```

---

## Faydalı ADB Komutları (Referans)

### Genel
```cmd
adb devices                    # Bağlı cihazları listele
adb shell                      # Telefon shell'ine gir
adb reboot                     # Telefonu yeniden başlat
```

### Uygulama Yönetimi
```cmd
adb install app.apk            # APK kur
adb uninstall <package>        # Uygulamayı kaldır
adb shell pm list packages     # Tüm paketleri listele
```

### Log ve Debug
```cmd
adb logcat                     # Tüm logları izle
adb logcat -c                  # Logları temizle
adb logcat -d                  # Mevcut logları göster
adb logcat -v time             # Zaman damgalı loglar
```

### Dosya İşlemleri
```cmd
adb push local.txt /sdcard/    # Bilgisayardan telefona dosya gönder
adb pull /sdcard/file.txt .    # Telefondan bilgisayara dosya al
```

---

## Sorun Giderme

### "adb devices" boş liste gösteriyor
```
1. USB kablosunu değiştir (veri destekli kablo kullan)
2. Başka USB portunu dene
3. Samsung USB Driver kur:
   https://developer.samsung.com/android-usb-driver
4. Telefonu yeniden başlat
5. USB Debug'ı kapat/aç
```

### "device unauthorized"
```
1. Telefonda popup'ı kontrol et
2. USB Debug'ı kapat
3. Bilgisayardan USB'yi çıkar
4. USB Debug'ı aç
5. USB'yi tak
6. "İzin Ver" + "Her zaman izin ver" seç
```

### "more than one device/emulator"
```
# Birden fazla cihaz bağlıysa, belirli cihazı seç:
adb -s RF8R10ABCDE logcat
```

---

## 📝 Log Analiz İpuçları

### Hangi Satırlara Bakmak Lazım?

**Error/Fatal içerenler:**
```cmd
adb logcat -d | findstr "E/\|F/"
```

**Timestamp ile sıralı:**
```cmd
adb logcat -v time
```

**Sadece YouTube Music'ten:**
```cmd
adb logcat -d | findstr "com.google.android.apps.youtube.music"
```

**Crash'ten önceki 100 satır + sonraki 20 satır:**
```cmd
adb logcat -v time | findstr /C:"FATAL" /C:"AndroidRuntime"
```

---

**SON GÜNCELLENMİŞ:** 21 Ekim 2025
**PLATFORM:** Windows 10/11 + Samsung A34
