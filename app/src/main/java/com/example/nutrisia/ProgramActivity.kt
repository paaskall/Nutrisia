package com.example.nutrisia

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.FrameLayout
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import com.example.nutrisia.R

class ProgramActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_program) // Pastikan nama layout file-nya benar

        // Inisialisasi Views
        val tvTitle: ConstraintLayout = findViewById(R.id.tv_title)
        val btnStartProgram1: Button = findViewById(R.id.btnStartProgram1)
        val targetKalori: TextView = findViewById(R.id.TargetKalori)
        val imgProgressChart: ImageView = findViewById(R.id.imgProgressChart)
        val continueProgram: ConstraintLayout = findViewById(R.id.ContinueProgram)
        val newProgram: ConstraintLayout = findViewById(R.id.NewProgram)
        val deleteProgram: ConstraintLayout = findViewById(R.id.DeleteProgram)
        val button: ImageView = findViewById(R.id.logo)


        button.setOnClickListener{
            val intent = Intent(this, MenuActivity::class.java)
            startActivity(intent)
            // overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right)
        }

        // Set Listener untuk memulai program (contoh sederhana)
        btnStartProgram1.setOnClickListener {
            // Tambahkan logika yang ingin dijalankan saat program dimulai
            val intent = Intent(this, DiaryActivity::class.java)
            startActivity(intent)
            // overridePendingTransition(R.anim.slide_in_right, R.anim.slide_left_left)
        }

        continueProgram.setOnClickListener {
            Toast.makeText(this, "Melanjutkan Program", Toast.LENGTH_SHORT).show()
        }

        newProgram.setOnClickListener {
            Toast.makeText(this, "Memulai Program Baru", Toast.LENGTH_SHORT).show()
        }

        deleteProgram.setOnClickListener {
            Toast.makeText(this, "Menghapus Program", Toast.LENGTH_SHORT).show()
        }

    }

    // Fungsi untuk memulai program
    private fun startProgram() {
        // Menampilkan toast saat program dimulai
        Toast.makeText(this, "Program dimulai", Toast.LENGTH_SHORT).show()
    }

    private fun continueExistingProgram() {
        // Menampilkan toast saat melanjutkan program
        Toast.makeText(this, "Melanjutkan program", Toast.LENGTH_SHORT).show()
    }

    private fun startNewProgram() {
        // Menampilkan toast saat memulai program baru
        Toast.makeText(this, "Memulai program baru", Toast.LENGTH_SHORT).show()
    }

    private fun deleteCurrentProgram() {
        // Menampilkan toast saat menghapus program
        Toast.makeText(this, "Program dihapus", Toast.LENGTH_SHORT).show()
    }
}
