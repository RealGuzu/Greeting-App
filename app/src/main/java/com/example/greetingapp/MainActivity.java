package com.example.greetingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
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

        TextView title = findViewById(R.id.txtTitle);
        Button btn = findViewById(R.id.btnClick);
        EditText etxt = findViewById(R.id.txtEdit);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputName = etxt.getText().toString();

                Toast.makeText(MainActivity.this, "Welcome to my application "+ inputName + ".", Toast.LENGTH_SHORT).show();
            }
        });


    }
}