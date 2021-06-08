package com.example.wishme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.inputmethodservice.ExtractEditText;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText input_name = (EditText) findViewById(R.id.input_name);
        final Button wish_button = findViewById(R.id.wish_button);
        final TextView user_prompt;
        final Intent intent = new Intent(this ,Wish_time.class);

        wish_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = input_name.getText().toString();
                intent.putExtra(Wish_time.NAME_EXTRA, name);
                startActivity(intent);
            }
        });

    }


}