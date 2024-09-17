package com.example.hw

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.helper.widget.Carousel
import androidx.constraintlayout.helper.widget.Carousel.Adapter
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.hw.databinding.ActivityMainBinding
import android.widget.Adapter as Adapter1

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    val personNames = listOf<String>(
        "Alice",
        "Bob",
        "Charlie",
        "David",
        "Eva",
        "Frank",
        "Grace",
        "Hannah",
        "Isaac",
        "Julia",
        "Kevin",
        "Lena",
        "Michael",
        "Nora",
        "Oliver",
        "Penny",
        "Quincy",
        "Rachel",
        "Samuel",
        "Tara",
        "Ulysses",
        "Victoria",
        "Walter",
        "Xena",
        "Yvonne",
        "Zachary",
        "Alexis",
        "Benjamin",
        "Chloe",
        "Daniel",
        "Emily",
        "Fiona",
        "George",
        "Holly",
        "Ian",
        "Jasmine",
        "Kyle",
        "Lily",
        "Megan",
        "Nathan",
        "Olivia",
        "Peter",
        "Quinn",
        "Rebecca",
        "Simon",
        "Tessa",
        "Uma",
        "Vincent"
    )


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)



        val adp = adapt (personNames.toString())
        adp .submitList(personNames)
        binding.recyclerView.adapter = adp


    }
}