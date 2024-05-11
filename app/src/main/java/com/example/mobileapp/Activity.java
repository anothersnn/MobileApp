package com.example.mobileapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.mobileapp.Games.GuessTheAnimal;
import com.example.mobileapp.Games.WordPractice;

public class Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button guessTheAnimal = findViewById(R.id.buttonGuessTheAnimal);
        guessTheAnimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Activity.this, GuessTheAnimal.class));
            }
        });

        Button wordPractice = findViewById(R.id.buttonWordPractice);
        wordPractice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Activity.this, WordPractice.class));
            }
        });
        Button listeningButton = findViewById(R.id.buttonListening);
        listeningButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Activity.this, Audition.class));
            }
        });

        ImageView avatarButton = findViewById(R.id.imageAvatar);
        avatarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Activity.this, Profile.class));
            }
        });
    }
}