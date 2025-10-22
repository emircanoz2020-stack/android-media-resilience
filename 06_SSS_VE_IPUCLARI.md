# Sık Sorulan Sorular (SSS) ve İpuçları
**YouTube Music ReVanced için Kapsamlı SSS**

---

## 🔍 Genel Sorular

### S1: ReVanced nedir? Güvenli mi?
**C:** ReVanced, YouTube ve YouTube Music gibi uygulamalara reklam engelleme, arka plan oynatma gibi özellikler ekleyen açık kaynak bir projedir.

**Güvenlik:**
- ✅ Açık kaynak (GitHub'da kod görülebilir)
- ✅ Kendi cihazında kendın yamalarsın
- ✅ Binlerce kullanıcı tarafından test edilmiş
- ⚠️ Resmi Google ürünü değil
- ⚠️ Hazır yamalanmış APK'lar tehlikeli olabilir

**Sonuç:** Kendın yamalarsan güvenli.

---

### S2: Neden ücretli YouTube Music Premium almıyorum?
**C:** Geçerli soru! Eğer bütçen varsa ve resmi desteği istiyorsan Premium almanı öneririz.

**ReVanced Alternatifleri:**
- Bütçe kısıtlı
- Özelleştirme istiyorsun (UI değişiklikleri vb.)
- Öğrenme/deneme amaçlı
- Bazı bölgelerde Premium yok

---

### S3: ReVanced yasadışı mı?
**C:** Karmaşık bir konu:

**Hukuki Durum:**
- ❌ Yamalanmış APK dağıtmak: Yasadışı
- ⚠️ Kendi kullanımın için yamalamak: Gri alan
- ✅ Açık kaynak araçlar: Yasal

**ReVanced Politikası:**
- Sadece araçlar sağlanır
- APK dağıtımı yapılmaz
- Kullanıcı kendi sorumluluğundadır

**Önerimiz:** Eğitim/test amaçlı kullan, uzun vadede Premium'a geç.

---

### S4: Telefonum rootlu değil, ReVanced kullanabilir miyim?
**C:** **EVET!** Root gerekmez.

**Root Gerekmeyen Yöntem:**
1. APK indir
2. ReVanced Manager ile yamala
3. Kur ve kullan

**Root Avantajları (Opsiyonel):**
- Sistem uygulaması olarak kurma
- Daha az pil tüketimi (bazı durumlarda)

**Sonuç:** Root olmadan da tam özellikli kullanılır.

---

## 🛠️ Kurulum Soruları

### S5: "App not installed" hatası alıyorum
**C:** Birkaç sebep olabilir:

**Çözüm 1: Stok uygulamayı kaldır**
```
Ayarlar → Uygulamalar → YouTube Music (stok)
→ Devre Dışı Bırak veya Kaldır
```

**Çözüm 2: Eski ReVanced versiyonunu tamamen sil**
```
Ayarlar → Uygulamalar → YouTube Music ReVanced
→ Kaldır → Tüm verileri sil ✓
```

**Çözüm 3: APK mimarisi yanlış**
```
arm64-v8a seçtiğinden emin ol (A34 için)
armeabi-v7a veya x86 SEÇMEYİN
```

**Çözüm 4: Telefonu yeniden başlat**
```
Güç tuşu → Yeniden Başlat
Sonra tekrar dene
```

---

### S6: microG nedir? Neden gerekli?
**C:** microG, Google Play Services'in açık kaynak alternatifidir.

**Neden Gerekli:**
- ReVanced resmi Google uygulaması değil
- Normal GMS (Google Mobile Services) çalışmaz
- microG, GMS'i taklit eder

**Ne İşe Yarar:**
- Google hesabı girişi
- Bildirimler (yeni müzik, playlist vb.)
- Senkronizasyon (favoriler, geçmiş vb.)

**microG Olmadan:**
- ❌ Hesaba giriş yapamassın
- ❌ Senkronizasyon çalışmaz
- ❌ Bazı özellikler devre dışı

**Sonuç:** microG ŞARTtır!

---

### S7: "Installation blocked" (Kurulum engellendi)
**C:** Play Protect veya güvenlik ayarları engelliyor.

**Çözüm 1: Play Protect kapat**
```
Play Store → Profil → Play Protect
→ Ayarlar (⚙️)
→ "Scan apps with Play Protect" KAPAT
```

**Çözüm 2: Bilinmeyen kaynaklara izin ver**
```
Ayarlar → Güvenlik ve Gizlilik
→ Bilinmeyen Kaynaklardan Yükleme
→ "My Files" veya "Files" → İzin Ver ✓
```

**Çözüm 3: Samsung'un özel ayarları**
```
Ayarlar → Uygulamalar
→ Sağ üst ⋮ → Özel Erişim
→ Bilinmeyen Uygulamaları Yükle
→ "Files" veya kullandığın uygulama → İzin Ver
```

---

## 🎵 Kullanım Soruları

### S8: Müzikler bir süre sonra duruyor
**C:** Pil optimizasyonu veya Android'in RAM yönetimi.

**Çözüm 1: Pil optimizasyonunu kapat**
```
Ayarlar → Pil → Pil Kullanımı
→ microG Services → Sınırsız
→ YouTube Music → Sınırsız
```

**Çözüm 2: Arka plan kısıtlamasını kaldır**
```
Ayarlar → Uygulamalar → YouTube Music
→ Pil → Arka Plan Kullanımı
→ "Sınırsız" seç
```

**Çözüm 3: Uyku modundan çıkar**
```
Cihaz Bakımı → Pil → Arka Plan Kullanım Sınırları
→ Uyku moduna alınmayan uygulamalar
→ YouTube Music ve microG ekle
```

---

### S9: Offline (çevrimdışı) müzik indirebilir miyim?
**C:** **EVET**, ama sınırlı.

**Çalışan Özellikler:**
- ✅ Müzik indirme (cache)
- ✅ Offline dinleme
- ✅ Playlist indirme

**Çalışmayan:**
- ❌ Resmi "Download" butonu (bazen)
- ⚠️ Bazı lisanslı içerikler

**İpucu:**
```
YouTube Music → Ayarlar
→ Download quality → High
→ Only download over Wi-Fi → AÇ
```

---

### S10: Reklam hala çıkıyor!
**C:** Yamada reklam engelleme seçilmemiş olabilir.

**Çözüm 1: Patch'leri kontrol et**
```
ReVanced Manager → Patcher
→ YouTube Music APK seç
→ "Music video ads" yamasını SEÇ ✓
→ Yeniden yamala ve kur
```

**Çözüm 2: Uygulama güncellemesi almış**
```
Play Store → Ayarlar
→ Otomatik güncelleme → KAPAT
Eski yamalanmış versiyon kaybolmuş, yeniden yükle
```

**Çözüm 3: Video reklamları farklı**
```
Bazı içerikler müzik değil "music video"
Video reklamları farklı patch gerektirir:
→ "Music video ads" yaması gerekli
```

---

### S11: Android Auto'da çalışmıyor
**C:** Bilinen sorun, henüz tam düzeltme yok.

**Geçici Çözümler:**

**Çözüm 1: Eski versiyon kullan**
```
YouTube Music 7.16.53 veya daha eski
Android Auto uyumluluğu daha iyi
```

**Çözüm 2: microG izinlerini artır**
```
Ayarlar → Uygulamalar → microG
→ İzinler → Konum, Telefon, SMS → VER
```

**Çözüm 3: GitHub issue takip et**
```
https://github.com/ReVanced/revanced-patches/issues/4339
Topluluk çözüm üzerinde çalışıyor
```

**Alternatif:**
- Bluetooth ile müzik yayını (Android Auto olmadan)
- Spotify ReVanced dene (daha stabil)

---

## 🔧 Hata Mesajları

### S12: "Error 400 - There was a problem with the server"
**C:** En yaygın hata, Spoof Client yaması eksik.

**Kesin Çözüm:**
```
1. YouTube Music'i kaldır
2. YouTube Music 7.29.52 APK indir
3. ReVanced Manager'da yamala
4. Patches seçiminde "Spoof client" ŞARTtır ✓
5. Yükle ve test et
```

**Neden Oluyor:**
- YouTube sunucuları, ReVanced'ı algılıyor
- Spoof client, resmi uygulamayı taklit eder
- Sunucu, farkı anlamaz

---

### S13: "Couldn't load this video" (Video yüklenemedi)
**C:** Genelde YouTube Music değil, YouTube ReVanced sorunu ama müzik videolarında da olabilir.

**Çözüm:**
```
YouTube Music → Ayarlar
→ "Video mode" seçeneklerini kontrol et
→ "Audio only" moda geç (müzikler için yeterli)
```

**Eğer video izlemek istiyorsan:**
```
ReVanced Manager'da:
→ "Spoof app version" yamasını ekle
→ "Client spoof" yamasını ekle
```

---

### S14: "No internet connection" (ama internet var)
**C:** microG'nin ağ izni yok veya DNS sorunu.

**Çözüm 1: microG izinlerini kontrol et**
```
Ayarlar → Uygulamalar → microG Services
→ İzinler → Ağ erişimi → İZİN VER
```

**Çözüm 2: VPN/DNS değiştir**
```
Eğer VPN kullanıyorsan geçici kapat
Cloudflare DNS (1.1.1.1) kullanmayı dene
```

**Çözüm 3: Cache temizle**
```
Ayarlar → Uygulamalar → YouTube Music
→ Depolama → Cache Temizle
microG için de aynısını yap
```

---

## 🔄 Güncelleme Soruları

### S15: ReVanced Manager güncellenecek mi güncellemeli miyim?
**C:** **EVET, güncelle.**

**ReVanced Manager:**
- ✅ Her zaman en son versiyonu kullan
- ✅ Güvenlik güncellemeleri var
- ✅ Yeni yamalar ekleniyor

**Nasıl Güncellenir:**
```
ReVanced Manager → Settings
→ About → Check for updates
→ Download → Install
```

**Otomatik Güncelleme:**
```
revanced.app adresinden yeni APK indir
Eski üzerine yükle (veri kaybolmaz)
```

---

### S16: YouTube Music'i güncelleyebilir miyim?
**C:** **HAYIR, GÜNCELLEMEYİN!**

**Neden:**
- ❌ Play Store güncellemesi yamaları siler
- ❌ Yeni versiyon uyumsuz olabilir
- ❌ Tekrar yamalaman gerekir

**Güvenli Güncelleme Yöntemi:**
```
1. Yeni YouTube Music APK indir (manuel)
2. Uyumluluk kontrolü yap (04_UYUMLU_APK_LISTESI.md)
3. ReVanced Manager'da yeniden yamala
4. Test et
5. Çalışıyorsa kur
```

**Play Store Otomatik Güncelleme KAPAT:**
```
Play Store → Profil → Ayarlar
→ Uygulama İndirme Tercihi
→ Otomatik güncellemeleri kapat
```

---

### S17: Patch'ler güncellenecek mi nasıl öğrenirim?
**C:** GitHub ve ReVanced Manager takip et.

**Takip Yöntemleri:**

**1. ReVanced Manager'da:**
```
Patcher → Settings
→ Sources → Update patches
Yeni patch varsa bildirim gelir
```

**2. GitHub'da:**
```
https://github.com/ReVanced/revanced-patches/releases
→ "Watch" → "Releases only"
E-posta bildirimleri alırsın
```

**3. Reddit/Discord:**
```
r/revancedapp → Join
Topluluk yeni sürümleri paylaşır
```

---

## 🚀 Performans ve Optimizasyon

### S18: YouTube Music ReVanced pil çok yiyor
**C:** Normal uygulamadan biraz daha fazla tüketebilir.

**Optimizasyon İpuçları:**

**1. Audio Quality ayarla:**
```
YouTube Music → Settings
→ Playback → Audio quality
→ Wi-Fi: Normal (High değil)
→ Mobile: Low veya Normal
```

**2. Video özelliklerini kapat:**
```
Settings → Watch & Listen
→ "Don't play music videos" AÇ
Sadece audio stream, daha az pil
```

**3. Arka plan yenileme azalt:**
```
Ayarlar → Uygulamalar → YouTube Music
→ Mobil veri → Arka plan veri → KAPAT
Sadece Wi-Fi'de senkronize et
```

**4. microG optimize et:**
```
microG Settings (uygulamayı aç)
→ Google Services → Cloud Messaging
→ Sadece gerekli uygulamalar için aç
```

---

### S19: Müzikler yavaş yükleniyor / buffering
**C:** İnternet hızı veya cache sorunu.

**Çözümler:**

**1. Cache ayarlarını düzenle:**
```
YouTube Music → Settings
→ Storage → Cache size → 500MB veya 1GB
```

**2. Streaming kalitesi düşür:**
```
Settings → Playback
→ Audio quality on mobile → Low
İnternet hızı yavaşsa yeterli
```

**3. Proxy/VPN kapat:**
```
Eğer kullanıyorsan geçici kapat
Bazen yavaşlatır
```

**4. DNS değiştir:**
```
Wi-Fi ayarları → Advanced
→ DNS: 8.8.8.8 (Google DNS)
Veya 1.1.1.1 (Cloudflare)
```

---

### S20: Uygulama çok yer kaplıyor (depolama)
**C:** Cache ve indirilen müzikler.

**Temizleme:**

**1. Cache temizle:**
```
Ayarlar → Uygulamalar → YouTube Music
→ Storage → Clear cache
(Clear data DEĞİL, sadece cache!)
```

**2. İndirilen müzikleri sil:**
```
YouTube Music → Library
→ Downloads → ⋮ → Remove downloads
```

**3. Otomatik cache limiti koy:**
```
YouTube Music → Settings
→ Storage → Cache size → 200MB (minimum)
Otomatik eski cache'leri siler
```

---

## 🌐 Hesap ve Senkronizasyon

### S21: Birden fazla Google hesabı kullanabilir miyim?
**C:** **EVET**, microG destekliyor.

**Nasıl Eklenir:**
```
YouTube Music → Profil
→ Switch account → Add account
→ microG üzerinden yeni hesap ekle
```

**Sınırlamalar:**
- Bazı hesaplarda Error 400 olabilir
- Her hesap için Spoof client gerekli
- Senkronizasyon bazen yavaş

---

### S22: Favorilerim ve playlistlerim senkronize oluyor mu?
**C:** **EVET**, microG sayesinde.

**Kontrol Et:**
```
microG Settings (uygulamayı aç)
→ Google Services
→ Google Account → Hesabını seç
→ Sync: YouTube Music ✓ işaretli olmalı
```

**Sorun Varsa:**
```
1. microG → Account → Remove account
2. YouTube Music'i aç
3. Hesabı yeniden ekle
4. Sync'i manuel tetikle: Account → ⋮ → Sync now
```

---

### S23: YouTube Music web'deki değişiklikler telefonda görünmüyor
**C:** Senkronizasyon gecikmesi veya kapalı.

**Çözüm:**

**1. Manuel sync:**
```
Ayarlar → Hesaplar
→ Google (microG) → Hesabını seç
→ YouTube Music → Sync now
```

**2. Otomatik sync aç:**
```
Ayarlar → Hesaplar
→ Otomatik veri senkronizasyonu → AÇ
```

**3. microG'de kontrol et:**
```
microG Settings
→ Cloud Messaging → AÇ
Bildirim ve senkronizasyon için gerekli
```

---

## 🎨 Özelleştirme

### S24: Uygulama temasını değiştirebilir miyim?
**C:** **EVET**, yamalarla.

**Mevcut Temalar:**

**AMOLED Siyah:**
```
ReVanced Manager → Patcher
→ Patches → "Amoled" yamasını seç ✓
Tam siyah arka plan (OLED ekranlar için ideal)
```

**Material You (Dynamic Color):**
```
Android 12+ için
Sistem duvar kağıdına göre renk
Bazı patch versiyonlarında var
```

**Özel Temalar:**
- İleri seviye: 05_KAYNAK_KOD_DUZENLEME.md
- Kendin patch yazabilirsin

---

### S25: Cast butonunu kaldırabilir miyim?
**C:** **EVET**, patch var.

**Nasıl:**
```
ReVanced Manager → Patcher
→ Patches → "Hide cast button" ✓
Yeniden yamala ve kur
```

**Diğer Gizlenebilecek UI Elemanları:**
- Shorts tab (kısa videolar)
- Samples tab
- Upgrade button (Premium reklamı)

---

## 🔐 Güvenlik ve Gizlilik

### S26: ReVanced kişisel bilgilerimi çalar mı?
**C:** **HAYIR**, açık kaynak ve güvenli.

**Kanıtlar:**
- ✅ Kaynak kodu GitHub'da açık
- ✅ Topluluk tarafından denetleniyor
- ✅ İzinler sınırlı (sadece gerekli olanlar)
- ✅ Hiçbir sunucuya veri göndermiyor

**Ancak:**
- ⚠️ microG'ye Google hesabı veriyorsun
- ⚠️ YouTube'a normal gibi bağlanıyor
- ⚠️ Google yine de izleme yapabilir

**Önerimiz:**
- Test hesabı kullan (ana hesap değil)
- İzinleri minimumda tut

---

### S27: Google hesabım banlanır mı?
**C:** **Risk düşük, ama mümkün.**

**Gerçekler:**
- ⚠️ Google ToS'a (Kullanım Şartları) aykırı
- ⚠️ Teorik olarak ban riski var
- ✅ Pratikte çok nadir (binlerce kullanıcı sorunsuz)

**Google Önlemleri:**
- Error 400 gösterme (ban değil, engelleme)
- Bazı özellikleri devre dışı bırakma
- Doğrudan hesap kapatma: Çok nadir

**Risk Azaltma:**
- Alternatif hesap kullan
- Ana Gmail/Drive hesabınla girme
- Sadece müzik dinle (spam/bot davranışı yapma)

**Sonuç:** Kendi sorumluluğunda, risk düşük.

---

## 📱 Cihaz Uyumluluğu

### S28: Samsung dışında hangi cihazlarda çalışır?
**C:** **Tüm Android cihazlarda.**

**Uyumlu Markalar:**
- ✅ Samsung (A34, S23, vb.)
- ✅ Xiaomi / Redmi
- ✅ OnePlus
- ✅ Oppo / Realme
- ✅ Google Pixel
- ✅ Huawei (GMS varsa)
- ✅ Diğer tüm Android cihazlar

**Minimum Gereksinim:**
- Android 8.0+ (Oreo veya üstü)
- 2GB RAM (önerilir)
- 500MB boş alan

---

### S29: Tablet / Android TV'de çalışır mı?
**C:** **EVET**, ama bazı uyarlamalar gerekebilir.

**Tablet:**
- ✅ Tam uyumlu
- "Enable tablet mode" yamasını seç
- UI daha geniş olur

**Android TV:**
- ⚠️ Kısmen uyumlu
- YouTube TV için ayrı patch gerekir
- Sadece remote kontrolle kullanım zor olabilir

**Fire TV / Mi Box:**
- ⚠️ Sideload gerekebilir
- microG izinleri manuel verilmeli
- ADB ile kurulum önerilir

---

### S30: Emülatörde (BlueStacks, NoxPlayer) çalışır mı?
**C:** **EVET**, ancak önerilmez.

**Neden Çalışır:**
- Android emülatörleri gerçek cihaz gibi
- APK kurulumu destekleniyor

**Sorunlar:**
- ⚠️ microG GPS/konum bulamayabilir
- ⚠️ Performans düşük
- ⚠️ Google ban riski daha yüksek (emülatör tespiti)

**Kullanım Senaryoları:**
- ✅ Test amaçlı (canlı cihaza kurmadan önce)
- ✅ Öğrenme/deneme
- ❌ Günlük kullanım için uygun değil

---

## 🆘 Acil Durum Çözümleri

### S31: Her şeyi denedim, hiçbir şey çalışmıyor!
**C:** **Temiz kurulum yap (factory reset değil, app reset).**

**Tam Temizleme Prosedürü:**

```
1. YouTube Music ReVanced'ı kaldır
   → Ayarlar → Uygulamalar → Kaldır
   → "Tüm verileri sil" ✓

2. microG'yi kaldır
   → Ayarlar → Uygulamalar → microG → Kaldır

3. ReVanced Manager'ı kaldır

4. Telefonu yeniden başlat

5. Stok YouTube Music'i kaldır veya devre dışı bırak

6. Yeniden başlat

7. Tüm dosyaları sil:
   → Files → Download → Eski APK'ları sil

8. Sıfırdan başla:
   → microG kur
   → ReVanced Manager kur
   → YouTube Music 7.29.52 indir
   → Patches 5.4.0 ile yamala
   → Kur

9. Pil optimizasyonlarını ayarla

10. Test et
```

---

### S32: Telefonu fabrika ayarlarına döndürmeli miyim?
**C:** **HAYIR, gerek yok!**

**S31'deki adımlar yeterli.**

**Factory reset sadece şu durumlarda:**
- Telefon başka sebeplerden dolayı sorunlu
- Malware/virüs şüphesi var
- Başka uygulamalar da çöküyor

---

## 💡 Pro İpuçları

### S33: İpucu 1 - Çalışan APK'yı yedekle
```
Dosya Yöneticisi → Android → data
→ com.google.android.apps.youtube.music
→ files → base.apk (bunu kopyala)

VEYA daha kolay:

ReVanced Manager → Installed
→ YouTube Music → ⋮ → Export APK
→ Güvenli yere kaydet
```

**Neden:**
- Tekrar yamalamanıza gerek yok
- Hızlı kurulum (telefon değişiminde)

---

### S34: İpucu 2 - Birden fazla versiyon kur (Advanced)
```
APK Editor ile package name değiştir:
com.google.android.apps.youtube.music
→ com.google.android.apps.youtube.music.old

Böylece:
- Stok YouTube Music
- ReVanced versiyon 1
- ReVanced versiyon 2
Üçü birden kurulu olabilir
```

**Kullanım:**
- Test amaçlı
- Farklı patch setleri denemek

---

### S35: İpucu 3 - Playlist yedekleme
```
1. Google Takeout kullan:
   https://takeout.google.com
   → YouTube ve YouTube Music seç
   → Export data

2. Veya:
   YouTube Music web → Playlistler
   → Manuel kopyala (güvenli yol)
```

**Neden:**
- ReVanced değişimi veri kaybettirmez
- Ama hesap problemlerinde yedek iyi

---

### S36: İpucu 4 - Hızlı geçiş (quick switch)
```
Ekran kenarından kaydır (Android gestures)
→ Son kullanılan uygulamalar
→ YouTube Music'e hızlı dön

VEYA:

Bildirim panelinden oynatma kontrolü
Uygulama açmadan müzik değiştir
```

---

### S37: İpucu 5 - Özel DNS (daha hızlı)
```
Wi-Fi ayarları → Advanced Settings
→ IP Settings: Static
→ DNS 1: 1.1.1.1 (Cloudflare)
→ DNS 2: 8.8.8.8 (Google)

Sonuç:
- Daha hızlı yüklenme
- Bazı ISP kısıtlamalarını aşabilir
```

---

## 🌍 Bölgesel Sorunlar

### S38: Türkiye'de çalışır mı?
**C:** **EVET, tam uyumlu.**

**Özel notlar:**
- YouTube Music Türkiye'de resmi olarak var
- ReVanced hiçbir bölge kısıtlaması yok
- VPN gerekmez

---

### S39: VPN kullanmalı mıyım?
**C:** **Gerekmez, ama kullanabilirsin.**

**VPN Artıları:**
- Başka bölgelerin içeriklerine erişim
- ISP kısıtlamalarını aşma

**VPN Eksileri:**
- ⚠️ Yavaşlatabilir
- ⚠️ Google hesabında şüphe uyandırabilir (konum değişimi)
- ⚠️ microG senkronizasyon sorunları

**Öneri:** Gerekmedikçe kullanma.

---

## 📊 Karşılaştırmalar

### S40: ReVanced vs ReVanced Extended, hangisi daha iyi?
**C:** İkisi de iyi, tercih meselesi.

| Özellik | ReVanced | ReVanced Extended |
|---------|----------|-------------------|
| Geliştirici | Resmi ReVanced Team | inotia00 (fork) |
| Güncelleme | Daha az sık | Daha sık |
| Patch sayısı | Orta | Fazla |
| Kararlılık | Daha stabil | Bazen deneysel |
| Topluluk | Büyük | Orta |
| Destek | Resmi GitHub | Fork |

**Hangisini Seçmeli:**
- 🎯 **ReVanced (resmi):** Kararlılık istiyorsan
- 🎯 **ReVanced Extended:** Daha fazla özellik istiyorsan

---

## 📚 Daha Fazla Yardım

### S41: Başka nereden yardım alabilirim?
**C:** Topluluk çok aktif:

**Resmi Kaynaklar:**
- Reddit: r/revancedapp
- Discord: https://discord.gg/revanced
- GitHub: https://github.com/ReVanced
- Telegram: ReVanced grupları

**Türkçe Kaynaklar:**
- Türk teknoloji forumları
- Android Türkiye Discord
- Reddit r/Turkey (teknik konular)

---

### S42: İlk Kontrol Listesi - SORUN GİDERMEDEN ÖNCE KONTROL ET!
**C:** Bu 3 şeyi kontrol etmeden hata ayıklama YAPMA!

**1. SAAT/TLS KONTROLÜ (ÇOK ÖNEMLİ!)**

**Sorun:**
- Sistem saati otomatik değilse TLS el sıkışması bozulur
- YouTube sunucularıyla güvenli bağlantı kurulamaz
- Sonuç: HTTP 400, 403, 4xx hataları

**Çözüm:**
```
Ayarlar → Genel Yönetim → Tarih ve Saat
→ Otomatik tarih ve saat: AÇ ✓
→ Otomatik saat dilimi: AÇ ✓
```

**Test Et:**
```
Ayarlar → Hakkında → Yazılım Bilgileri
→ Derleme numarası altında tarih/saat doğru mu kontrol et

VEYA web tarayıcıda: https://time.is
→ "Your time is exact!" yazıyorsa OK
```

**UYARI:**
- Manuel saat ayarladıysan mutlaka otomatiğe al
- VPN kullanıyorsan saat dilimi uyumsuz olabilir
- Bu basit ayar, çoğu "server error" sorununu çözer!

---

**2. GÜÇ YÖNETİMİ (PİL OPTİMİZASYONU)**

**A) Pil Optimizasyonunu Kapat:**
```
Ayarlar → Pil ve Cihaz Bakımı → Pil
→ Pil Kullanımı → Daha Fazla (⋮)
→ Optimize edilmeyen uygulamalar

EKLE:
✓ microG Services
✓ YouTube Music
```

**B) Samsung Cihaz Bakımı (ÇOK ÖNEMLİ!):**
```
Ayarlar → Pil ve Cihaz Bakımı
→ Otomatik optimizasyon: KAPALI olmalı

VEYA:

Ayarlar → Pil ve Cihaz Bakımı → Bellek
→ Kullanılmayan uygulamaları temizle: KAPALI

VEYA beyaz listeye ekle:
→ Ayarlar → Uygulamalar → YouTube Music
→ Pil → Arka Plan Kullanım Sınırı → Sınırsız
```

**C) Uyku Modundan Çıkar:**
```
Ayarlar → Pil ve Cihaz Bakımı → Pil
→ Arka Plan Kullanım Sınırları
→ Uyku moduna alınmayan uygulamalar → EKLE:
   - YouTube Music
   - microG Services
```

**Samsung'un "Gizli" Temizleyicisi:**
```
Cihaz Bakımı uygulaması sık sık uygulamaları kapatır!

Çözüm:
Ayarlar → Pil ve Cihaz Bakımı
→ Sağ üst (⋮) → Otomasyon
→ "Otomatik yeniden başlat": KAPALI
→ "Otomatik optimize et": KAPALI
```

---

**3. DEPOLAMA VE İZİNLER**

**A) Depolama İzni:**
```
Ayarlar → Uygulamalar → YouTube Music
→ İzinler → Depolama: İZİN VERİLDİ ✓

microG için de kontrol et:
Ayarlar → Uygulamalar → microG Services
→ İzinler → Depolama: İZİN VERİLDİ ✓
```

**B) Boş Alan Kontrolü:**
```
Ayarlar → Pil ve Cihaz Bakımı → Depolama

Gerekli minimum:
- Sistem: 2GB boş
- YouTube Music cache: 500MB-1GB
- microG: 100MB

TOPLAM: En az 3GB boş alan olmalı
```

**C) Önbellek Temizleme (DİKKAT!):**
```
Cache temizlediysen:
→ İlk açılışta yavaş olabilir
→ Şarkılar yeniden yüklenecek
→ Giriş bilgileri kaybolmaz (microG'de)

Cache temizleme SADECE:
Ayarlar → Uygulamalar → YouTube Music
→ Depolama → Önbelleği Temizle
(VERİLERİ TEMİZLE YAPMA!)
```

---

**ÖZET KONTROL LİSTESİ:**
```
[ ] ✓ Saat otomatik (TLS için kritik!)
[ ] ✓ microG pil optimizasyonu KAPALI
[ ] ✓ YouTube Music pil optimizasyonu KAPALI
[ ] ✓ Samsung Cihaz Bakımı otomasyon KAPALI
[ ] ✓ Uyku modundan çıkarıldı
[ ] ✓ Depolama izni VERİLDİ
[ ] ✓ 3GB+ boş alan var
[ ] ✓ Cache temizlendiyse not edildi
```

**Bu 3 şeyi kontrol etmeden Error 400, buffering, arka planda durma gibi sorunları çözemezsin!**

---

## ✅ Kontrol Listesi

### Kurulum Öncesi:
- [ ] Stok YouTube Music kaldırıldı/devre dışı bırakıldı
- [ ] Yeterli depolama var (500MB+)
- [ ] APK mimarisi doğru seçildi (arm64-v8a)

### Kurulum Sırası:
- [ ] microG kuruldu
- [ ] ReVanced Manager kuruldu
- [ ] YouTube Music APK indirildi (7.29.52)
- [ ] Patches seçildi (Spoof client dahil)
- [ ] APK yamalandı
- [ ] Uygulama kuruldu

### Kurulum Sonrası:
- [ ] Hesap girişi yapıldı
- [ ] Pil optimizasyonu kapatıldı (microG + YT Music)
- [ ] Play Store otomatik güncelleme kapatıldı
- [ ] Test edildi (müzik çalıyor)
- [ ] Çalışan APK yedeklendi

---

**SON GÜNCELLENMİŞ:** 22 Ekim 2025
**TOPLAM SORU:** 42 SSS
**KATEGORİLER:** Genel, Kurulum, Kullanım, Hata, Güncelleme, Performans, Hesap, Özelleştirme, Güvenlik, Uyumluluk, Acil Durum, İpuçları, Bölgesel, Karşılaştırma, İlk Kontroller
