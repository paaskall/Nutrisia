package com.example.nutrisia

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class ProfileActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile) // Ganti dengan nama file XML Anda

        // Inisialisasi komponen UI
        val imageViewProfile = findViewById<ImageView>(R.id.imageViewProfile)
        val buttonUploadPhoto = findViewById<Button>(R.id.buttonUploadPhoto)
        val editTextFullName = findViewById<EditText>(R.id.editTextFullName)
        val editTextEmail = findViewById<EditText>(R.id.editTextEmail)
        val editTextPassword = findViewById<EditText>(R.id.editTextPassword)
        val buttonEditProfile = findViewById<Button>(R.id.buttonEditProfile)

        // Set OnClickListener pada ImageView untuk profile picture
        imageViewProfile.setOnClickListener {
            Toast.makeText(this, "Profile Picture Clicked", Toast.LENGTH_SHORT).show()
        }

        // Set OnClickListener pada tombol Upload Photo
        buttonUploadPhoto.setOnClickListener {
            Toast.makeText(this, "Upload Photo Button Clicked", Toast.LENGTH_SHORT).show()
        }

        // Set OnClickListener pada tombol Edit Profile
        buttonEditProfile.setOnClickListener {
            Toast.makeText(this, "Edit Profile Button Clicked", Toast.LENGTH_SHORT).show()
        }
    }
}
