package com.example.nutrisia

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import android.content.SharedPreferences

class SplashActivity : AppCompatActivity() {

    private val splashTime: Long = 3000 // Durasi 3 detik

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        // Handler untuk menjalankan delay
        Handler(Looper.getMainLooper()).postDelayed({
            // Cek apakah pengguna sudah melihat onboarding
            val sharedPreferences: SharedPreferences = getSharedPreferences("PREF", MODE_PRIVATE)
            val isFirstRun = sharedPreferences.getBoolean("isFirstRun", true)

            if (isFirstRun) {
                // Jika pertama kali menjalankan aplikasi, arahkan ke OnboardingActivity
                val intent = Intent(this@SplashActivity, OnBoardingActivity::class.java)
                startActivity(intent)

                // Set preference agar tidak masuk onboarding lagi di masa depan
                sharedPreferences.edit().putBoolean("isFirstRun", false).apply()
            } else {
                // Jika bukan pertama kali, arahkan ke LoginActivity
                val intent = Intent(this@SplashActivity, LoginActivity::class.java)
                startActivity(intent)
            }

            finish() // Tutup SplashActivity agar tidak bisa kembali ke sini
        }, splashTime)
    }
}
