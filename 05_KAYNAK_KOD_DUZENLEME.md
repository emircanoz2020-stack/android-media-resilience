# ReVanced Patches - Kaynak Kod Düzenleme Rehberi
**YouTube Music için Özel Patch Geliştirme**

---

## Ne Zaman Kaynak Kod Düzenlemesi Gerekir?

### Senaryolar:
1. ✅ Mevcut yamalar çalışmıyor
2. ✅ Resmi yamalar güncellenmemiş
3. ✅ Kendine özel özellikler eklemek istiyorsun
4. ✅ Hata düzeltmesi yapmak istiyorsun
5. ✅ Topluluk patch'leri test etmek istiyorsun

---

## Gereksinimler

### Yazılımlar
- ✅ **Java JDK 17+** (Android derleme için)
- ✅ **Git** (Kod indirme için)
- ✅ **Android Studio** (İsteğe bağlı, kod düzenleme için)
- ✅ **Gradle** (Derleme için - JDK ile gelir)
- ✅ **Metin Editörü** (VS Code, Notepad++ vb.)

### Bilgi Gereksinimleri
- ⚠️ Java/Kotlin temel bilgisi (önerilir)
- ⚠️ Android APK yapısı bilgisi (önerilir)
- ⚠️ Git kullanımı (temel)

---

## Adım 1: Java JDK Kurulumu

### JDK 17 İndirme ve Kurma
```
1. https://adoptium.net/ adresine git
2. "Latest Release" altında JDK 17 veya 21 seç
3. Windows x64 → .msi installer indir
4. Kurulumu çalıştır
5. Varsayılan ayarlarla devam et ("Add to PATH" işaretli olsun)
```

### Kurulum Kontrolü
```cmd
# CMD aç
java -version
```

**Beklenen Çıktı:**
```
openjdk version "17.0.x" ...
```

---

## Adım 2: Git Kurulumu

### Git İndirme
```
1. https://git-scm.com/download/win
2. 64-bit Git for Windows Setup indir
3. Kur (varsayılan ayarlarla)
```

### Kurulum Kontrolü
```cmd
git --version
```

**Çıktı:**
```
git version 2.x.x
```

---

## Adım 3: ReVanced Patches Kaynak Kodunu İndir

### GitHub'dan Klonlama

```cmd
# REVANCED klasörüne git
cd C:\Users\ASUS\OneDrive\Belgeler\REVANCED

# ReVanced Patches deposunu klonla
git clone https://github.com/ReVanced/revanced-patches.git

# Klasöre gir
cd revanced-patches
```

**Klasör Yapısı:**
```
revanced-patches/
├── src/
│   └── main/
│       ├── kotlin/
│       │   └── app/revanced/patches/
│       │       ├── music/          ← YouTube Music yamalarının Java/Kotlin kodları
│       │       └── youtube/        ← YouTube yamalarının Java/Kotlin kodları
│       └── resources/
│           └── patch-options/
├── build.gradle.kts                ← Derleme ayarları
├── gradle.properties
└── README.md
```

---

## Adım 4: Mevcut Patch'leri İncele

### YouTube Music Patch'lerini Bul

```cmd
# music klasörüne git
cd src\main\kotlin\app\revanced\patches\music

# Klasör içeriğini listele
dir /s
```

**Önemli Patch Dosyaları:**
```
music/
├── ad/                     ← Reklam engelleme
├── audio/                  ← Ses ayarları
├── interaction/            ← Kullanıcı etkileşimi
├── layout/                 ← UI/UX değişiklikleri
├── misc/                   ← Diğer
└── premium/                ← Premium özellikler
```

---

## Adım 5: Patch Örneği - "Spoof Client" Düzeltmesi

### Sorunu Anlama
Error 400 hatası: YouTube Music serveri, ReVanced'dan gelen istekleri reddediyor.

**Çözüm:** Client bilgisini sahte yaparak (spoofing) resmi uygulamayı taklit et.

### Patch Dosyasını Bul ve Aç

```cmd
# Spoof client patch'ini ara
cd C:\Users\ASUS\OneDrive\Belgeler\REVANCED\revanced-patches
dir /s /b *spoof*
```

**Muhtemel Dosya:**
```
src\main\kotlin\app\revanced\patches\music\misc\spoofclient\SpoofClientPatch.kt
```

### Kodu İncele (Örnek Pseudo-code)

```kotlin
package app.revanced.patches.music.misc.spoofclient

import app.revanced.patcher.patch.BytecodePatch
import app.revanced.patcher.patch.annotation.Patch

@Patch(
    name = "Spoof client",
    description = "Spoofs the YouTube Music client to prevent playback issues.",
)
@Suppress("unused")
object SpoofClientPatch : BytecodePatch(/* ... */) {

    override fun execute(context: BytecodeContext) {
        // Client versiyonunu değiştir
        // User-Agent'ı değiştir
        // API çağrılarını modifiye et
    }
}
```

---

## Adım 6: Basit Düzenleme Örneği

### Senaryo: Error 400 için farklı client version dene

#### Orijinal Kod (Örnek):
```kotlin
const val MUSIC_CLIENT_VERSION = "7.29.52"
const val USER_AGENT = "com.google.android.apps.youtube.music/7.29.52"
```

#### Düzeltilmiş Kod:
```kotlin
// Daha eski bir versiyon kullanarak deneme
const val MUSIC_CLIENT_VERSION = "7.16.53"
const val USER_AGENT = "com.google.android.apps.youtube.music/7.16.53"
```

#### Dosyayı Kaydet
- Metin editöründe düzenle (Notepad++, VS Code)
- `Ctrl+S` ile kaydet

---

## Adım 7: Patch'i Derle (Build)

### Gradle ile Derleme

```cmd
# Ana klasöre dön
cd C:\Users\ASUS\OneDrive\Belgeler\REVANCED\revanced-patches

# Derleme başlat (Windows)
gradlew.bat build

# VEYA (PowerShell)
.\gradlew.bat build
```

**İşlem Süresi:** 2-10 dakika (ilk sefer daha uzun)

**Beklenen Çıktı:**
```
BUILD SUCCESSFUL in 3m 45s
```

### Derlenen Patch Dosyasını Bul

```cmd
# Build klasörü
cd build\libs

# JAR dosyası
dir *.jar
```

**Dosya:**
```
revanced-patches-x.x.x.jar
```

Bu dosya senin özel patch'lerini içeriyor!

---

## Adım 8: Özel Patch'i ReVanced Manager'da Kullan

### Manager'da Custom Patches Yükleme

#### Yöntem 1: Lokal Dosya (Önerilir)
```
1. Derlenen JAR dosyasını telefona kopyala:
   - USB ile → /sdcard/Download/

2. ReVanced Manager'ı aç

3. Settings → Sources → "+" (Add source)

4. "Local" seç → JAR dosyasını seç

5. Patcher'a dön, normal şekilde yamala
```

#### Yöntem 2: Custom Repository (İleri Seviye)
```
1. GitHub'da kendi fork'unu oluştur
2. Değişikliklerini push et
3. GitHub Releases'te JAR'ı yayınla
4. ReVanced Manager → Settings → Sources → GitHub repo ekle
```

---

## Adım 9: Test Etme ve Debug

### Test Döngüsü

```
1. Patch'i düzenle (kodu değiştir)
   ↓
2. Derle (gradlew build)
   ↓
3. JAR'ı telefona kopyala
   ↓
4. ReVanced Manager'da yamala
   ↓
5. YouTube Music'i kur ve test et
   ↓
6. Hata varsa → ADB log al → Tekrar 1. adıma dön
```

### Debug İpuçları

```kotlin
// Log ekleme (Kotlin kodu içinde)
android.util.Log.d("REVANCED_DEBUG", "Spoof client aktif!")

// APK'da çıktı:
adb logcat | findstr "REVANCED_DEBUG"
```

---

## Adım 10: Yaygın Patch Türleri

### 1. UI Element Gizleme

**Amaç:** Cast button, shorts tab vb. gizle

```kotlin
@Patch(name = "Hide cast button")
object HideCastButtonPatch : BytecodePatch() {
    override fun execute(context: BytecodeContext) {
        // findViewById kullanarak UI elemanı bul
        // visibility = View.GONE yap
    }
}
```

### 2. API Call Değiştirme

**Amaç:** Sunucu isteklerini modifiye et

```kotlin
@Patch(name = "Spoof app version")
object SpoofVersionPatch : BytecodePatch() {
    override fun execute(context: BytecodeContext) {
        // HTTP header'larını değiştir
        // User-Agent güncelle
    }
}
```

### 3. Premium Özellik Aktifleştirme

**Amaç:** Background play, download vb. özellikleri aç

```kotlin
@Patch(name = "Enable background play")
object BackgroundPlayPatch : BytecodePatch() {
    override fun execute(context: BytecodeContext) {
        // isPremium = true dön
        // Background playback kontrolünü bypass et
    }
}
```

---

## Topluluk Patch'leri Kullanma

### ReVanced Extended (Alternatif Fork)

**GitHub:** https://github.com/inotia00/ReVanced_Extended

**Fark:** Daha fazla patch, daha sık güncelleme

#### Kurulum:
```cmd
cd C:\Users\ASUS\OneDrive\Belgeler\REVANCED

# Extended klonla
git clone https://github.com/inotia00/ReVanced_Extended.git

cd ReVanced_Extended

# Derle
gradlew.bat build
```

---

## Sorun Giderme

### Hata: "JAVA_HOME not found"
**Çözüm:**
```cmd
# JAVA_HOME ayarla (CMD)
setx JAVA_HOME "C:\Program Files\Eclipse Adoptium\jdk-17.x.x-hotspot"

# CMD'yi kapat ve yeniden aç
java -version
```

### Hata: "gradlew: command not found"
**Çözüm:**
```cmd
# Windows'ta:
gradlew.bat build

# VEYA tam path:
.\gradlew.bat build
```

### Hata: "Build failed - dependency error"
**Çözüm:**
```cmd
# Gradle cache temizle
gradlew.bat clean

# Tekrar derle
gradlew.bat build
```

### Hata: "Unsupported class file major version"
**Çözüm:** Java versiyonu çok eski veya yeni
```cmd
java -version  # 17 veya 21 olmalı
```

---

## İleri Seviye: Kendi Patch'ini Yaz

### Basit "Hello World" Patch

#### 1. Yeni Dosya Oluştur
```
Konum: src/main/kotlin/app/revanced/patches/music/misc/hello/
Dosya: HelloWorldPatch.kt
```

#### 2. Kod Yaz
```kotlin
package app.revanced.patches.music.misc.hello

import app.revanced.patcher.patch.BytecodePatch
import app.revanced.patcher.patch.annotation.Patch

@Patch(
    name = "Hello World Test",
    description = "Logs 'Hello World' when YouTube Music starts",
)
object HelloWorldPatch : BytecodePatch() {

    override fun execute(context: BytecodeContext) {
        // Ana Activity'yi bul
        val mainActivityClass = context.classes.find {
            it.type.endsWith("MainActivity;")
        } ?: throw Exception("MainActivity not found")

        // onCreate metodunu bul
        val onCreateMethod = mainActivityClass.methods.find {
            it.name == "onCreate"
        } ?: throw Exception("onCreate not found")

        // Kodun başına log ekle
        onCreateMethod.implementation!!.addInstructions(
            0, // Index 0 (başlangıç)
            """
                const-string v0, "REVANCED"
                const-string v1, "Hello World from Patch!"
                invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
            """
        )
    }
}
```

#### 3. Derle ve Test Et
```cmd
gradlew.bat build

# Derlendi mi kontrol et
dir build\libs\*.jar

# Telefona yükle, yamala, test et
```

#### 4. Log Kontrol
```cmd
adb logcat | findstr "REVANCED"
```

**Beklenen Çıktı:**
```
D/REVANCED: Hello World from Patch!
```

---

## Faydalı Kaynaklar

### Resmi Dokümantasyon
- ReVanced Patcher API: https://github.com/ReVanced/revanced-patcher
- ReVanced Docs: https://github.com/ReVanced/revanced-documentation

### Öğrenme Kaynakları
- Kotlin Basics: https://kotlinlang.org/docs/basic-syntax.html
- Android Smali: https://github.com/JesusFreke/smali
- Dalvik Bytecode: https://source.android.com/docs/core/runtime/dalvik-bytecode

### Topluluk
- Reddit: r/revancedapp
- Discord: https://discord.gg/revanced
- Telegram: ReVanced community groups

---

## Patch Geliştirme Best Practices

### ✅ Yapılması Gerekenler:
1. Her değişikliği test et
2. Log ekle (debug için)
3. Patch açıklamasını net yaz
4. Toplulukla paylaş (GitHub issues)
5. Geriye dönük yedek al (git commit)

### ❌ Yapılmaması Gerekenler:
1. Test etmeden deploy etme
2. Birden fazla patch'i aynı anda değiştirme
3. Kaynak kodu silme
4. Güvenlik açıkları oluşturma
5. Lisans kurallarını ihlal etme

---

## Git Workflow (Versiyon Kontrolü)

### Branch Oluşturma
```bash
# Ana branch'ten yeni branch oluştur
git checkout -b fix-error-400

# Değişiklikleri yap
# Dosyaları düzenle...

# Commit et
git add .
git commit -m "Fix: Error 400 düzeltmesi - client version güncellendi"

# GitHub'a push et (kendi fork'unda)
git push origin fix-error-400
```

### Pull Request Oluşturma
```
1. GitHub'da kendi fork'una git
2. "Pull Request" oluştur
3. Ana ReVanced repo'suna teklif et
4. Topluluk review edecek
5. Merge edilirse herkesin kullanımına açılır
```

---

## Örnek Patch Senaryoları

### Senaryo 1: Error 400 Düzeltmesi
**Dosya:** `SpoofClientPatch.kt`
**Değişiklik:** Client version'ı 7.16.53'e çek
**Test:** APK yamala, müzik çal, hata mesajı görmemeli

### Senaryo 2: Cast Butonunu Gizle
**Dosya:** `HideCastButtonPatch.kt`
**Değişiklik:** UI element visibility = GONE
**Test:** YouTube Music aç, cast butonu görünmemeli

### Senaryo 3: Background Play Her Zaman Aktif
**Dosya:** `BackgroundPlaybackPatch.kt`
**Değişiklik:** isPremium kontrolünü bypass et
**Test:** Ekran kapalı, müzik çalmaya devam etmeli

---

## Sık Karşılaşılan Hatalar ve Çözümler

| Hata | Sebep | Çözüm |
|------|-------|-------|
| `ClassNotFoundException` | Patch yanlış sınıfı arıyor | Sınıf adını kontrol et, APK versiyonunu değiştir |
| `MethodNotFoundException` | Metod bulunamadı | YouTube Music versiyonu uyumsuz, downgrade yap |
| `Build failed` | Syntax hatası | Kotlin kodunu kontrol et, `;` eksik olabilir |
| `Patch not applied` | Uyumsuzluk | APK versiyonunu 7.29.52 yap |
| `Crash on startup` | Hatalı bytecode injection | Log'ları oku, hangi patch'te hata var bul |

---

**SON GÜNCELLENMİŞ:** 21 Ekim 2025
**PLATFORM:** Windows + Java JDK 17 + Kotlin
**ZORLUK SEVİYESİ:** ⚠️ İleri Seviye (Java/Kotlin bilgisi gerekli)
