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

        // Handle click for Add Activity button
        btnNewSection.setOnClickListener {
            Toast.makeText(this, "Adding new activity", Toast.LENGTH_SHORT).show()
        }

        // Handle click for Calorie section
        llCalorie.setOnClickListener {
            Toast.makeText(this, "Opening calorie details", Toast.LENGTH_SHORT).show()
        }

        // Handle click for Streak Diary section
        llStreakDiary.setOnClickListener {
            Toast.makeText(this, "Opening streak details", Toast.LENGTH_SHORT).show()
        }

        // Handle clicks for Food Target sections
        llFoodTarget.setOnClickListener {
            val intent = Intent(this, FoodActivity::class.java).apply {
                putExtra("MEAL_TIME", "breakfast")
            }
            startActivity(intent)
            Toast.makeText(this, "Opening breakfast details", Toast.LENGTH_SHORT).show()
        }

        llFoodTarget1.setOnClickListener {
            val intent = Intent(this, FoodActivity::class.java).apply {
                putExtra("MEAL_TIME", "lunch")
            }
            startActivity(intent)
            Toast.makeText(this, "Opening lunch details", Toast.LENGTH_SHORT).show()
        }

        llFoodTarget2.setOnClickListener {
            val intent = Intent(this, FoodActivity::class.java).apply {
                putExtra("MEAL_TIME", "dinner")
            }
            startActivity(intent)
            Toast.makeText(this, "Opening dinner details", Toast.LENGTH_SHORT).show()
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