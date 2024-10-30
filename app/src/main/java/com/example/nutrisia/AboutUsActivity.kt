package com.example.nutrisia

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class AboutUsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        // Inisialisasi komponen UI
        val imgLogo = findViewById<ImageView>(R.id.img_logo_nutrisia)
        val tvAboutTitle = findViewById<TextView>(R.id.tv_about_title)
        val tvAboutDescription = findViewById<TextView>(R.id.tv_about_description)
        val tvOurTeamTitle = findViewById<TextView>(R.id.tv_our_team_title)
        val tvTeamMembers = findViewById<TextView>(R.id.tv_team_members)
        val btnContactUs = findViewById<Button>(R.id.btn_contact_us)

        // Set tindakan untuk tombol Contact Us
        btnContactUs.setOnClickListener {
            // Contoh aksi: Menampilkan Toast pesan kontak
            Toast.makeText(this, "Hubungi kami di Instagram", Toast.LENGTH_LONG).show()
        }
    }
}
