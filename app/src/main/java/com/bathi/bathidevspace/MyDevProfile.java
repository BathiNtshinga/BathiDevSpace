package com.bathi.bathidevspace;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Author: Bathi Ntshinga
 * Class: Part Time
 * Student number: 214198227
 * Class Description: My Dev Profile screen
 */

public class MyDevProfile extends AppCompatActivity {

    Button button;
    View listView;
    Context context;
    ArrayList proName;

    public static final Integer[] myImages = {
            R.drawable.profile, R.drawable.contact, R.drawable.email, R.drawable.twitter, R.drawable.linkedin
    };

    public static String[] myNames = new String[]{
            "Bathi Ntshinga", "0638610453", "bathi.ntshinga@westerncape.gov.za.com", "bathi_ntshinga", "Bathi Ntshinga"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_dev_profile);

        ImageButton imageButton = findViewById(R.id.imageButton3);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MyDevProfile.this, Menu.class);
                startActivity(intent);
            }
        });

        MyListViewAdapter adapter = new MyListViewAdapter(this, myNames, myImages);
        listView = findViewById(R.id.listView2);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new  AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MyDevProfile.this, "You clicked on:" + myNames[position], Toast.LENGTH_SHORT).show();

            }
        });
    }
}