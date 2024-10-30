package com.example.nutrisia

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import android.widget.LinearLayout
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.constraintlayout.widget.ConstraintSet.Constraint
import com.example.nutrisia.AboutUsActivity
import com.example.nutrisia.OcrActivity
import com.example.nutrisia.R

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        // Menghubungkan LinearLayout menu dengan ID dari layout
        val bmiCalculateMenu: ConstraintLayout = findViewById(R.id.BMICalculate)
        val ocrMenu: ConstraintLayout = findViewById(R.id.OCR)
        val weightlossMenu: ConstraintLayout = findViewById(R.id.DeleteProgram)
        val kritikSaranMenu: ConstraintLayout = findViewById(R.id.BMI)
        val communityMenu: ConstraintLayout = findViewById(R.id.community)
        val aboutUsMenu: ConstraintLayout = findViewById(R.id.AboutUs)
        val iconProfile = findViewById<ImageView>(R.id.icon_profile)

        // Intent untuk setiap menu
        bmiCalculateMenu.setOnClickListener {
            val intent = Intent(this, BMICalculateActivity::class.java)
            startActivity(intent)
        }

        ocrMenu.setOnClickListener {
            val intent = Intent(this, OcrActivity::class.java)
            startActivity(intent)
        }

        weightlossMenu.setOnClickListener {
            val intent = Intent(this, ProgramActivity::class.java)
            startActivity(intent)
        }

        kritikSaranMenu.setOnClickListener {
            Toast.makeText(this, "Fitur Kritik & Saran sedang dikembangkan", Toast.LENGTH_SHORT).show()
        }

        communityMenu.setOnClickListener {
            Toast.makeText(this, "Fitur Komunitas sedang dikembangkan", Toast.LENGTH_SHORT).show()
        }

        aboutUsMenu.setOnClickListener {
            val intent = Intent(this, AboutUsActivity::class.java)
            startActivity(intent)
        }
        // Set OnClickListener pada ikon profil
        iconProfile.setOnClickListener {
            // Intent untuk membuka ProfileActivity
            val intent = Intent(this, ProfileActivity::class.java)
            startActivity(intent)
        }
    }
}
