package com.example.nutrisia

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class FoodActivity : AppCompatActivity() {

    private lateinit var tvTitle: TextView
    private lateinit var tvDate: TextView
    private lateinit var btnSarapan: Button
    private lateinit var btnMakanSiang: Button
    private lateinit var btnMakanMalam: Button
    private lateinit var btnMakanCemilan: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_food)

        // Inisialisasi komponen UI
        tvTitle = findViewById(R.id.tv_title)
        tvDate = findViewById(R.id.tv_date)
        btnSarapan = findViewById(R.id.BTN_calorie_title)
        btnMakanSiang = findViewById(R.id.BTN_calorie_title_siang)
        btnMakanMalam = findViewById(R.id.tv_calorie_title_malam)
        btnMakanCemilan = findViewById(R.id.BTN_calorie_title_snack)

        // Set listener untuk tombol Sarapan
        btnSarapan.setOnClickListener {
            val intent = Intent(this, OcrActivity::class.java)
            startActivity(intent)
            Toast.makeText(this, "Tambahkan Makanan Sarapan", Toast.LENGTH_SHORT).show()
        }

        // Set listener untuk tombol Makan Siang
        btnMakanSiang.setOnClickListener {
            val intent = Intent(this, OcrActivity::class.java)
            startActivity(intent)
            Toast.makeText(this, "Tambahkan Makanan Makan Siang", Toast.LENGTH_SHORT).show()
        }

        // Set listener untuk tombol Makan Malam
        btnMakanMalam.setOnClickListener {
            val intent = Intent(this, OcrActivity::class.java)
            startActivity(intent)
            Toast.makeText(this, "Tambahkan Makanan Makan Malam", Toast.LENGTH_SHORT).show()
        }

        // Set listener untuk tombol Makan Cemilan
        btnMakanCemilan.setOnClickListener {
            val intent = Intent(this, OcrActivity::class.java)
            startActivity(intent)
            Toast.makeText(this, "Tambahkan Makanan Cemilan", Toast.LENGTH_SHORT).show()
        }
    }
}
