package com.example.nutrisia

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.button.MaterialButton
import com.google.android.material.tabs.TabLayoutMediator

class OnBoardingActivity : AppCompatActivity() {

    private lateinit var viewPager: ViewPager2
    private lateinit var skipButton: MaterialButton
    private lateinit var finishButton: MaterialButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_on_boarding)

        viewPager = findViewById(R.id.viewPager)
        skipButton = findViewById(R.id.btn_skip)
        finishButton = findViewById(R.id.btn_finish)

        val onboardingItems = listOf(
            OnboardingItem("Welcome!", "Selamat datang di Nutrisia.", R.mipmap.nutrisia),
            OnboardingItem("Body Mass Index", "Ketahui tinggi dan berat ideal mu.", R.drawable.on3),
            OnboardingItem("Penuhi kebutuhan kalori", "Hitung kalori harian lebih cepat dan mudah.", R.drawable.on1),
            OnboardingItem("Mulai aktivitas fisik", "Imbangi kebutuhan kalori dan aktivitas fisikmu", R.drawable.on2)
        )

        val adapter = OnboardingPagerAdapter(this, onboardingItems)
        viewPager.adapter = adapter

        // Setup TabLayout with ViewPager
        TabLayoutMediator(findViewById(R.id.tabLayout), viewPager) { _, _ -> }.attach()

        // Skip button action
        skipButton.setOnClickListener {
            goToLoginActivity()
        }

        // Finish button action
        finishButton.setOnClickListener {
            if (viewPager.currentItem == onboardingItems.size - 1) {
                goToLoginActivity()
            } else {
                viewPager.currentItem += 1
            }
        }
    }

    private fun goToLoginActivity() {
        startActivity(Intent(this, LoginActivity::class.java))
        finish() // Tutup OnboardingActivity agar tidak bisa kembali ke sini
    }
}
