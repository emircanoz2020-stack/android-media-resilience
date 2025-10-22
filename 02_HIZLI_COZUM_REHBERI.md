# YouTube Music ReVanced Hızlı Çözüm Rehberi
**Samsung A34 için Adım Adım**

---

## ⚡ EN HIZLI ÇÖZÜM (5 Dakika)

### ÇALIŞAN KOMBİNASYON ✅
- **YouTube Music APK:** 7.29.52
- **ReVanced Patches:** 5.4.0
- **Bu kombinasyon test edildi ve çalışıyor!**

---

## Adım 1: Hazırlık

### A. Mevcut Uygulamayı Kaldır
```
1. Ayarlar → Uygulamalar
2. "YouTube Music" ara (ReVanced versiyonu)
3. Uygulamayı aç
4. "Kaldır" butonuna bas
5. Verileri silmeyi onayla
```

### B. Stok YouTube Music'i Devre Dışı Bırak (Önemli!)
```
1. Ayarlar → Uygulamalar
2. Normal "YouTube Music" bul (Samsung ile gelen)
3. "Devre Dışı Bırak" seçeneğini tıkla
   (Kaldırma seçeneği yoksa, devre dışı bırak yeterli)
```

---

## Adım 2: Gerekli Dosyaları İndir

### 1. ReVanced Manager (En Son Versiyon)
**İndirme Linki:** https://revanced.app/download
- "ReVanced Manager" butonuna tıkla
- APK'yı indir
- Dosya: `revanced-manager-x.x.x.apk`

### 2. YouTube Music APK 7.29.52 (Önerilen Versiyon)
**İndirme Linki:** https://www.apkmirror.com

APKMirror'da Arama Adımları:
```
1. APKMirror sitesine git
2. Arama kutusuna "YouTube Music 7.29.52" yaz
3. Sonuçlardan "YouTube Music by Google LLC" seç
4. Version "7.29.52" bul
5. "APK" sekmesinde:
   - Variant: arm64-v8a (A34 için)
   - Android: 8.0+
6. İNDİR (KURMA! Sadece indir)
```

### 3. microG (GmsCore) - YouTube giriş için gerekli
**İndirme Linki:** https://github.com/ReVanced/GmsCore/releases
- En son release'i bul
- `app-release.apk` dosyasını indir
- Dosya adı: `ReVanced_GmsCore_x.x.x.apk` gibi olacak

---

## Adım 3: Kurulum Sırası

### 1. microG Kur (İLK ÖNCE BU!)
```
1. İndirilen GmsCore APK'sını aç
2. "Yükle" butonuna bas
3. "Bilinmeyen kaynaklardan kuruluma izin ver" sorarsa:
   → Ayarlar'a git
   → "Bu kaynağa izin ver" işaretle
   → Geri dön ve tekrar yükle
4. Kurulum tamamlandı ✓
```

### 2. ReVanced Manager Kur
```
1. İndirilen ReVanced Manager APK'sını aç
2. "Yükle" bas
3. Uygulamayı aç
```

---

## Adım 4: YouTube Music'i Yamala

### ReVanced Manager'da Yamalama
```
1. ReVanced Manager'ı aç
2. "Patcher" (Yamalayıcı) sekmesine git
3. "Select an application" (Uygulama seç) bas
4. "Storage" (Depolama) seç
5. İndirdiğin YouTube Music APK'sını seç (7.29.52)
6. "Select patches" (Yamalar seç) ekranı açılır
```

### Önerilen Yamalar (Patches)
**ÖNEMLİ:** Sadece bunları seç!

✅ **Mutlaka Seçilmesi Gerekenler:**
- `Background play` - Arka planda oynatma
- `Amoled` - Siyah tema (AMOLED ekranlar için)
- `Music video ads` - Video reklamları engelle
- `Hide cast button` - Cast butonunu gizle
- `Minimized playback` - Küçültülmüş oynatma
- `Spoof client` - **ÇOK ÖNEMLİ - Error 400 düzeltmesi**
- `Enable tablet mode` - Tablet modu (isteğe bağlı)

❌ **Seçme (Sorun çıkarabilir):**
- Deneysel (Experimental) işaretli yamalar
- Beta yamalar

### Yamalama İşlemi
```
7. Yamaları seçtikten sonra "Done" (Tamam) bas
8. "Patch" (Yamala) butonuna bas
9. İşlem 2-5 dakika sürer
10. "Yamalama tamamlandı" mesajını bekle
11. "Install" (Yükle) butonuna bas
```

---

## Adım 5: İlk Çalıştırma ve Ayarlar

### Uygulamayı Başlat
```
1. YouTube Music ReVanced'ı aç
2. "Google ile Giriş Yap" seçeneğini seç
3. microG üzerinden hesabını ekle
4. İzinleri ver (Depolama, bildirimler vs.)
```

### Önemli İlk Ayarlar
```
1. Sağ üst köşe → Profil resmi → Ayarlar
2. "Arka Plan ve İndirmeler" → "Kesintisiz Oynatma" AÇ
3. "Görünüm ve Ses" → "AMOLED Karanlık Tema" seç
4. "Bildirimler" → İstediğin bildirimleri aç
```

### microG Pil Optimizasyonunu Kapat
```
1. Ayarlar → Pil ve Cihaz Bakımı → Pil
2. Arka Plan Kullanımı Sınırları
3. "Uyku moduna alınmayan uygulamalar"
4. microG Services'i ekle
5. YouTube Music ReVanced'ı ekle
```

---

## Adım 6: Test Et

### Kontrol Listesi
- [ ] Uygulama açılıyor
- [ ] Hesaba giriş yapılabiliyor
- [ ] Müzik çalıyor
- [ ] Ekran kapalıyken devam ediyor
- [ ] Reklam çıkmıyor
- [ ] Arka planda çalışıyor

---

## ⚠️ Sorun Yaşarsan

### Hata: "An error occurred - Error 400"
**Çözüm:**
```
1. Yamalamada "Spoof client" yamasını seçtiğinden emin ol
2. Seçmediysen, uygulamayı kaldır
3. Tekrar yamala (Spoof client ile)
4. Yeniden yükle
```

### Hata: "Uygulama yüklenemiyor"
**Çözüm:**
```
1. Stok YouTube Music'in devre dışı olduğundan emin ol
2. Eski ReVanced YouTube Music varsa tamamen kaldır
3. Dosya Yöneticisi → İndirilenler → Eski APK'ları sil
4. Telefonu yeniden başlat
5. Tekrar dene
```

### Hata: Google hesabı açılmıyor
**Çözüm:**
```
1. microG'nin kurulu olduğundan emin ol
2. Ayarlar → Uygulamalar → microG Services
3. İzinler → TÜM İZİNLERİ VER
4. Depolama → Cache'i Temizle
5. YouTube Music'i yeniden başlat
```

### Müzik çalışıyor ama atlıyor/takılıyor
**Çözüm:**
```
1. YouTube Music → Ayarlar
2. Ses Kalitesi → "Her Zaman Yüksek" seç
3. Arka Plan İndirmeleri → AÇ
4. Cache boyutunu artır (Ayarlar → Depolama → Cache)
5. Telefonun Depolama'da en az 2GB boş yer olsun
```

---

## 🎯 Notlar

- **Güncelleme:** Otomatik güncellemeleri KAPAT (Play Store'da)
- **Yedekleme:** Çalışan APK'yı sakla (tekrar yamala gerekmez)
- **Güvenlik:** Sadece resmi kaynaklardan indir

---

## 📱 Samsung A34 Özel Notlar

- **Mimari:** arm64-v8a (APK indirirken seç)
- **Android Sürümü:** One UI 5.x / Android 13+
- **Depolama:** En az 500MB boş alan gerekli

---

**SON GÜNCELLENMİŞ:** 21 Ekim 2025
**TEST EDİLDİ:** YouTube Music 7.29.52 + Patches 5.4.0 ✅
