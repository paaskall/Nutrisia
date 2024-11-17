package com.example.nutrisia


import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.ProgressBar
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout

class DiaryActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_daily_streak)

        // Initialize views
        val btnNewSection = findViewById<Button>(R.id.btn_new_section)
        val llCalorie = findViewById<ConstraintLayout>(R.id.ll_calorie)
        val llStreakDiary = findViewById<ConstraintLayout>(R.id.ll_streak_diary)
        val llFoodTarget = findViewById<LinearLayout>(R.id.ll_food_target)
        val llFoodTarget1 = findViewById<LinearLayout>(R.id.ll_food_target1)
        val llFoodTarget2 = findViewById<LinearLayout>(R.id.ll_food_target2)
        val moodIcons = listOf(
            findViewById<ImageView>(R.id.mood_1),
            findViewById<ImageView>(R.id.mood_2),
            findViewById<ImageView>(R.id.mood_3),
            findViewById<ImageView>(R.id.mood_4),
            findViewById<ImageView>(R.id.mood_5)
        )
        val button: ImageView = findViewById(R.id.logo)

        button.setOnClickListener {
            val intent = Intent(this, MenuActivity::class.java)
            startActivity(intent)
            // overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right)
        }

        // Handle click for Add Activity button
        btnNewSection.setOnClickListener {
            Toast.makeText(this, "Aktivitas di tambahkan", Toast.LENGTH_SHORT).show()
        }

        // Handle click for Calorie section
        llCalorie.setOnClickListener {
            Toast.makeText(this, "Membuka detail kalori", Toast.LENGTH_SHORT).show()
        }

        // Handle click for Streak Diary section
        llStreakDiary.setOnClickListener {
            Toast.makeText(this, "Membuka detail runtutan", Toast.LENGTH_SHORT).show()
        }

        // Handle clicks for Food Target sections
        llFoodTarget.setOnClickListener {
            val intent = Intent(this, FoodActivity::class.java).apply {
                putExtra("MEAL_TIME", "breakfast")
            }
            startActivity(intent)
            // overridePendingTransition(R.anim.slide_in_right, R.anim.slide_left_left)
        }

        llFoodTarget1.setOnClickListener {
            val intent = Intent(this, FoodActivity::class.java).apply {
                putExtra("MEAL_TIME", "lunch")
            }
            startActivity(intent)
            // overridePendingTransition(R.anim.slide_in_right, R.anim.slide_left_left)
        }

        llFoodTarget2.setOnClickListener {
            val intent = Intent(this, FoodActivity::class.java).apply {
                putExtra("MEAL_TIME", "dinner")
            }
            startActivity(intent)
            // overridePendingTransition(R.anim.slide_in_right, R.anim.slide_left_left)
        }

        // Handle clicks for Mood icons
        moodIcons.forEachIndexed { index, imageView ->
            imageView.setOnClickListener {
                // Update mood selection UI
                moodIcons.forEach { it.alpha = 0.5f }
                imageView.alpha = 1.0f
                val moodNames = listOf("Happy", "Love", "Neutral", "Sad", "Angry")
                Toast.makeText(this, "Mood set to: ${moodNames[index]}", Toast.LENGTH_SHORT).show()
                startActivity(intent)
            }
        }
    }
}