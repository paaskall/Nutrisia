package com.example.nutrisia


import android.os.Bundle
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout

class DiaryActivity : AppCompatActivity() {

    private lateinit var tvTitle: TextView
    private lateinit var tvDate: TextView
    private lateinit var progressCalories: ProgressBar
    private lateinit var tvCalorieBudget: TextView
    private lateinit var tvFoodTargetMorning: TextView
    private lateinit var ivMood: ImageView
    private lateinit var moodImages: Array<ImageView>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_daily_streak)

        // Initialize views
        tvTitle = findViewById(R.id.tv_title)
        tvDate = findViewById(R.id.tv_date)
        progressCalories = findViewById(R.id.progress_calories)
        tvCalorieBudget = findViewById(R.id.tv_calorie_budget)
        tvFoodTargetMorning = findViewById(R.id.ll_food_target)
        ivMood = findViewById(R.id.ll_mood)

        // Set initial data
        setDiaryDate("28 September 2024")
        setCalorieProgress(1200, 2000)
        setFoodTargetMorning(0)
        setMoodLevel(3)
    }

    // Set the diary date
    private fun setDiaryDate(date: String) {
        tvDate.text = date
    }

    // Set the progress for calorie intake
    private fun setCalorieProgress(currentCalories: Int, calorieBudget: Int) {
        tvCalorieBudget.text = "Budget: $calorieBudget"
        progressCalories.max = calorieBudget
        progressCalories.progress = currentCalories
    }

    // Set food target for morning
    private fun setFoodTargetMorning(count: Int) {
        tvFoodTargetMorning.text = "$count Makanan"
    }

    // Set mood level (1-5) and update mood icons accordingly
    private fun setMoodLevel(level: Int) {
        for (i in moodImages.indices) {
            if (i < level) {
                moodImages[i].setImageResource(R.drawable.grinhearts) // Filled heart
            } else {
                moodImages[i].setImageResource(R.drawable.sad) // Empty heart
            }
        }
    }
}
