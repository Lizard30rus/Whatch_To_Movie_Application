package com.example.whatch_to_movie_application

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView


class FilmDescriptionAct : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.film_description)

        val imageFilm : ImageView = findViewById(R.id.image_film_description)
        val imageId = intent.getIntExtra(IMAGE_FILM_ID, 100)
        imageFilm.setImageResource(imageId)

        val descriptionFilm : TextView = findViewById(R.id.description_film)
        val description = intent.getStringExtra(DESCRIPTION_FILM)
        descriptionFilm.text = description



    }

/*
    companion object {

        const val DESCRIPTION_FILM = "description film"

        fun start (context: Context, descriptionScreen: DescriptionScreen) {

            val intent = Intent(context, FilmDescriptionAct::class.java).apply {

                putExtra(DESCRIPTION_FILM, descriptionScreen)
            }

            context.startActivity(intent)
        }

    }

 */



}






