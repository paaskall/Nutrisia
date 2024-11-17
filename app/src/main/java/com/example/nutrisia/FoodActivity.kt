package com.example.nutrisia

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout

class FoodActivity : AppCompatActivity() {

    private lateinit var tvTitle: ConstraintLayout
    private lateinit var tvDate: TextView
    private lateinit var btnSarapan: Button
    private lateinit var btnMakanSiang: Button
    private lateinit var btnMakanMalam: Button
    private lateinit var btnMakanCemilan: Button
    private lateinit var button: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_food)

        // Inisialisasi komponen UI
        button = findViewById(R.id.logo)
        tvTitle = findViewById(R.id.tv_calorie_today)
        tvDate = findViewById(R.id.tv_date)
        btnSarapan = findViewById(R.id.BTN_calorie_title)
        btnMakanSiang = findViewById(R.id.BTN_calorie_title_siang)
        btnMakanMalam = findViewById(R.id.BTN_calorie_title_malam)
        btnMakanCemilan = findViewById(R.id.BTN_calorie_title_snack)

        // Set listener untuk tombol Sarapan
        btnSarapan.setOnClickListener {
            val intent = Intent(this, OcrActivity::class.java)
            startActivity(intent)
            // overridePendingTransition(R.anim.slide_in_right, R.anim.slide_left_left)
        }

        // Set listener untuk tombol Makan Siang
        btnMakanSiang.setOnClickListener {
            val intent = Intent(this, OcrActivity::class.java)
            startActivity(intent)
            // overridePendingTransition(R.anim.slide_in_right, R.anim.slide_left_left)
        }

        // Set listener untuk tombol Makan Malam
        btnMakanMalam.setOnClickListener {
            val intent = Intent(this, OcrActivity::class.java)
            startActivity(intent)
            // overridePendingTransition(R.anim.slide_in_right, R.anim.slide_left_left)
        }

        // Set listener untuk tombol Makan Cemilan
        btnMakanCemilan.setOnClickListener {
            val intent = Intent(this, OcrActivity::class.java)
            startActivity(intent)
            // overridePendingTransition(R.anim.slide_in_right, R.anim.slide_left_left)
        }

        button.setOnClickListener{
            val intent = Intent(this, MenuActivity::class.java)
            startActivity(intent)
            // overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right)
        }
    }
}
