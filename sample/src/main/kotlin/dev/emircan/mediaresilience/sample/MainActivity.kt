/*
 * SPDX-License-Identifier: Apache-2.0
 * Copyright (c) 2025 Android Media Resilience
 */
package dev.emircan.mediaresilience.sample

import android.app.ActivityManager
import android.content.Context
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import dev.emircan.mediaresilience.sample.databinding.ActivityMainBinding
import java.io.File

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupClickListeners()
        displayWelcomeInfo()
    }

    private fun setupClickListeners() {
        binding.btnMemoryInfo.setOnClickListener {
            showMemoryInfo()
        }

        binding.btnCacheInfo.setOnClickListener {
            showCacheInfo()
        }

        binding.btnViewDocs.setOnClickListener {
            showDocsInfo()
        }
    }

    private fun displayWelcomeInfo() {
        binding.tvWelcome.text = """
            Android Media Resilience
            Sample Demo App v${BuildConfig.VERSION_NAME}

            This is a minimal demonstration app.
            For full library (AAR), see v1.1.0+

            Tap buttons below to explore resilience patterns.
        """.trimIndent()
    }

    private fun showMemoryInfo() {
        val activityManager = getSystemService(Context.ACTIVITY_SERVICE) as ActivityManager
        val memoryInfo = ActivityManager.MemoryInfo()
        activityManager.getMemoryInfo(memoryInfo)

        val totalMB = memoryInfo.totalMem / 1024 / 1024
        val availMB = memoryInfo.availMem / 1024 / 1024
        val usedMB = totalMB - availMB
        val usedPercent = (usedMB * 100 / totalMB)

        val runtime = Runtime.getRuntime()
        val appMaxMB = runtime.maxMemory() / 1024 / 1024
        val appUsedMB = (runtime.totalMemory() - runtime.freeMemory()) / 1024 / 1024

        MaterialAlertDialogBuilder(this)
            .setTitle("Memory Profiling")
            .setMessage("""
                System Memory:
                - Total: $totalMB MB
                - Used: $usedMB MB ($usedPercent%)
                - Available: $availMB MB

                App Memory:
                - Max Heap: $appMaxMB MB
                - Used: $appUsedMB MB

                Tip: On Samsung devices, keep app memory <150 MB to avoid Device Care kills.
            """.trimIndent())
            .setPositiveButton("OK", null)
            .show()
    }

    private fun showCacheInfo() {
        val cacheDir = cacheDir
        val cacheSize = calculateDirectorySize(cacheDir)
        val cacheSizeMB = cacheSize / 1024 / 1024

        MaterialAlertDialogBuilder(this)
            .setTitle("Cache Management")
            .setMessage("""
                Cache Directory: ${cacheDir.path}
                Current Size: $cacheSizeMB MB

                Tip: For media apps, limit cache to 250-500 MB to avoid storage bloat.

                Clear cache?
            """.trimIndent())
            .setPositiveButton("Clear Cache") { _, _ ->
                clearCache()
            }
            .setNegativeButton("Cancel", null)
            .show()
    }

    private fun clearCache() {
        try {
            val cacheDir = cacheDir
            deleteRecursive(cacheDir)
            Toast.makeText(this, "Cache cleared successfully", Toast.LENGTH_SHORT).show()
        } catch (e: Exception) {
            Toast.makeText(this, "Failed to clear cache: ${e.message}", Toast.LENGTH_SHORT).show()
        }
    }

    private fun showDocsInfo() {
        MaterialAlertDialogBuilder(this)
            .setTitle("Documentation")
            .setMessage("""
                Full documentation available at:
                https://github.com/emircanoz2020-stack/android-media-resilience

                Includes:
                - README.md (6,500+ lines)
                - Turkish debug report (DEBUG_RAPORU_8_30_54.md)
                - Memory optimization patterns
                - OEM compatibility notes (Samsung, MIUI)
                - ExoPlayer/OkHttp best practices

                Download offline docs bundle from GitHub Releases.
            """.trimIndent())
            .setPositiveButton("OK", null)
            .show()
    }

    private fun calculateDirectorySize(directory: File): Long {
        var size: Long = 0
        if (directory.isDirectory) {
            val files = directory.listFiles()
            if (files != null) {
                for (file in files) {
                    size += if (file.isDirectory) {
                        calculateDirectorySize(file)
                    } else {
                        file.length()
                    }
                }
            }
        } else {
            size = directory.length()
        }
        return size
    }

    private fun deleteRecursive(fileOrDirectory: File) {
        if (fileOrDirectory.isDirectory) {
            fileOrDirectory.listFiles()?.forEach { child ->
                deleteRecursive(child)
            }
        }
        fileOrDirectory.delete()
    }
}
