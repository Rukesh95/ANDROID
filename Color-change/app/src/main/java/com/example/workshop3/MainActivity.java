package com.example.workshop3;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button bold,Italic,Colour;
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bold=findViewById(R.id.bold);
        Italic=findViewById(R.id.italic);
        Colour=findViewById(R.id.color);
        text=findViewById(R.id.text);



        bold.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                text.setTypeface(null, Typeface.BOLD);

            }
        });

        Italic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setTypeface(null,Typeface.ITALIC);
            }
        });
        Colour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setTextColor(Color.parseColor("#ff0000"));
            }
        });
    }
}
