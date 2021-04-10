package com.bathi.bathidevspace;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

/**
 * Author: Bathi Ntshinga
 * Class: Part Time
 * Student number: 214198227
 * Class Description: About Me screen
 */

public class AboutMe extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_me);

        ImageButton imageButton = findViewById(R.id.imageButton2);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AboutMe.this, Menu.class);
                startActivity(intent);

            }
        });

        textView = findViewById(R.id.textViewAboutMe);
        textView.setText ("Greetings. My name is Bathi Ntshinga. " +
                "I am currently doing my final year at CPUT in ICT: Applications Development." +
                "I am a student that enjoys coding. " +
                "In have very good computer and typing skills. " +
                "I also have very good administrative Skills"+
                "Upon Completion the Diploma I will proceed with the Advance Diploma." +
                "I am currently working for the Western Cape Education Department as an Admin Officer." +
                "I work with the Transversal Internal Control System, BAS and PERSAL." +
                "I am a person of integrity with strong morals" +
                "In 5 years time I see myself working as a succedsfull Senior Java Developer." );




    }
}