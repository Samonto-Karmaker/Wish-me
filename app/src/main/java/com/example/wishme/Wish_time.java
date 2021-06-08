package com.example.wishme;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Wish_time extends AppCompatActivity {

    public static final String NAME_EXTRA = "name_extra";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wish_time);


        TextView wishing = findViewById(R.id.wishing);
        String user_name;

        Bundle extras = getIntent().getExtras();
        if (extras != null){
            user_name = extras.getString(NAME_EXTRA);
        }
        else{
            user_name = null;
        }

        wishing.setText("Happy Birthday\n" + user_name + " !!");
    }
}
