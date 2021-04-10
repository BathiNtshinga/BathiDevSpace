package com.bathi.bathidevspace;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;

import java.util.ArrayList;

public class MyDevProfile extends AppCompatActivity {

    ListView listView;
    Context context;
    ArrayList proName;

    public static final Integer[] proImages = {
            R.drawable.profile, R.drawable.contact, R.drawable.email, R.drawable.twitter, R.drawable.linkedin
    };

    public static String[] proNames = new String[]{
            "Bathi Ntshinga", "0638610453", "bathi.ntshinga@westerncape.gov.za.com", "bathi_ntshinga", "Bathi Ntshinga"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_dev_profile);

    }
}