package com.example.lab1kate

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class RecipeActivity : AppCompatActivity() {

    lateinit var nameOfRecipe: TextView
    lateinit var image : ImageView
    lateinit var recipe: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recipe)

        nameOfRecipe = findViewById(R.id.tv_name_recipe)
        recipe = findViewById(R.id.tv_recipe)
        image = findViewById(R.id.photo)

        var passingNameOfRecipe = intent.getStringExtra("passingName")
        var passingRecipe = intent.getStringExtra("passingRecipe")

        when(passingNameOfRecipe){
            "Delicious Ukrainian lard" -> image.setImageResource(R.drawable.lard)
            "Beef steak" -> image.setImageResource(R.drawable.stake)
            "Chicken curry" -> image.setImageResource(R.drawable.curry)
        }

        nameOfRecipe.text = passingNameOfRecipe
        recipe.text= passingRecipe
    }
}