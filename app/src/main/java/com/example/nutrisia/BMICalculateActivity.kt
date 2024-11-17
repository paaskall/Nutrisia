package com.example.nutrisia

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class BMICalculateActivity : AppCompatActivity() {

    // Deklarasi variabel untuk view dan elemen input
    private lateinit var rbMale: RadioButton
    private lateinit var rbFemale: RadioButton
    private lateinit var etHeight: EditText
    private lateinit var etWeight: EditText
    private lateinit var spinnerActivityLevel: Spinner
    private lateinit var tvBMIResult: TextView
    private lateinit var tvBMIDesc: TextView
    private lateinit var btnCalculateBMI: Button
    private lateinit var btnViewPrograms: Button
    private lateinit var button: ImageView // Inisialisasi ImageView button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_obesity_prevention)

        // Inisialisasi view berdasarkan id
        rbMale = findViewById(R.id.rbMale)
        rbFemale = findViewById(R.id.rbFemale)
        etHeight = findViewById(R.id.etHeight)
        etWeight = findViewById(R.id.etWeight)
        spinnerActivityLevel = findViewById(R.id.spinnerActivityLevel)
        tvBMIResult = findViewById(R.id.tvBMIResult)
        tvBMIDesc = findViewById(R.id.tvBMIDesc)
        btnCalculateBMI = findViewById(R.id.btnCalculateBMI)
        btnViewPrograms = findViewById(R.id.btnViewPrograms)
        button = findViewById(R.id.logo) // Inisialisasi ImageView button setelah setContentView

        // Menambahkan klik listener untuk tombol Hitung BMI
        btnCalculateBMI.setOnClickListener {
            calculateBMI()
        }

        // Menambahkan klik listener untuk tombol Lihat Program yang Disarankan
        btnViewPrograms.setOnClickListener {
            val intent = Intent(this, ProgramActivity::class.java)
            startActivity(intent)
            // overridePendingTransition(R.anim.slide_in_right, R.anim.slide_left_left)
        }

        // Menambahkan klik listener untuk logo (ImageView)
        button.setOnClickListener {
            val intent = Intent(this, MenuActivity::class.java)
            startActivity(intent)
            // overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right)
        }
    }

    private fun calculateBMI() {
        // Validasi input tinggi dan berat
        val heightText = etHeight.text.toString()
        val weightText = etWeight.text.toString()

        if (heightText.isEmpty() || weightText.isEmpty()) {
            Toast.makeText(this, "Masukkan tinggi dan berat badan", Toast.LENGTH_SHORT).show()
            return
        }

        // Menghitung BMI
        val height = heightText.toFloat() / 100 // Konversi ke meter
        val weight = weightText.toFloat()
        val bmi = weight / (height * height)

        // Menampilkan hasil BMI
        tvBMIResult.text = String.format("%.2f", bmi)
        tvBMIDesc.text = getBMIDescription(bmi)
    }

    // Fungsi untuk memberikan deskripsi berdasarkan BMI
    private fun getBMIDescription(bmi: Float): String {
        return when {
            bmi < 18.5 -> "Kurus, kekurangan berat badan."
            bmi in 18.5..24.9 -> "Normal, berat badan ideal."
            bmi in 25.0..29.9 -> "Overweight, kelebihan berat badan."
            else -> "Obesitas, resiko kesehatan yang lebih tinggi."
        }
    }
}
