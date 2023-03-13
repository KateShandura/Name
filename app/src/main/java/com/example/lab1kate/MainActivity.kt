package com.example.lab1kate

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView


class MainActivity : AppCompatActivity() {

    lateinit var pig : Animal
    lateinit var cow : Animal
    lateinit var chicken : Animal

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        pig = Animal("Peppa", "Delicious Ukrainian lard", R.drawable.pig,

            getString(R.string.lard_recipe))
        cow = Animal("Sveta", "Beef steak", R.drawable.cow, getString(R.string.beef_stake))
        chicken = Animal("Liza", "Chicken curry", R.drawable.chicken, getString(R.string.chicken_curry))

        val name1 : TextView = findViewById(R.id.tv_name_animal1)
        val name2 : TextView = findViewById(R.id.tv_name_animal2)
        val name3 : TextView = findViewById(R.id.tv_name_animal3)

        val desc1 : TextView = findViewById(R.id.tv_desc_anmial1)
        val desc2 : TextView = findViewById(R.id.tv_desc_anmial2)
        val desc3 : TextView = findViewById(R.id.tv_desc_animal3)

        val image1 : ImageView = findViewById(R.id.iv_animal1)
        val image2 : ImageView = findViewById(R.id.iv_animal2)
        val image3 : ImageView = findViewById(R.id.iv_animal3)

        val button1 : Button = findViewById(R.id.button_animal1)
        val button2 : Button = findViewById(R.id.button_animal2)
        val button3 : Button = findViewById(R.id.button_animal3)


        name1.text = pig.name
        name2.text = cow.name
        name3.text = chicken.name

        desc1.text = pig.desc
        desc2.text = cow.desc
        desc3.text = chicken.desc

        image1.setImageResource(R.drawable.pig)
        image2.setImageResource(R.drawable.cow)
        image3.setImageResource(R.drawable.chicken)


        button1.setOnClickListener {

            var passingName : String = pig.desc
            var passingRecipe : String = pig.recipe

            var intent = Intent(this, RecipeActivity::class.java)
            intent.putExtra("passingName", passingName)
            intent.putExtra("passingRecipe",passingRecipe)

            this.startActivity(intent)

        }

        button2.setOnClickListener {
            var passingName : String = cow.desc
            var passingRecipe : String = cow.recipe

            var intent = Intent(this, RecipeActivity::class.java)
            intent.putExtra("passingName", passingName)
            intent.putExtra("passingRecipe",passingRecipe)

            this.startActivity(intent)
        }

        button3.setOnClickListener {
            var passingName : String = chicken.desc
            var passingRecipe : String = chicken.recipe

            var intent = Intent(this, RecipeActivity::class.java)
            intent.putExtra("passingName", passingName)
            intent.putExtra("passingRecipe",passingRecipe)

            this.startActivity(intent)
        }


    }
}