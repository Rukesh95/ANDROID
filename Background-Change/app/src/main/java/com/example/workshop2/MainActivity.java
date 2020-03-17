package com.example.workshop2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public boolean onCreateOptionsMenu(Menu menu)
    {
        MenuInflater inflater= getMenuInflater();
        inflater.inflate(R.menu.menu,menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem menuItem)
    {
        ConstraintLayout clayout=findViewById(R.id.clayout);
        switch (menuItem.getItemId())
        {
            case R.id.yellow:
                clayout.setBackgroundColor(Color.YELLOW);
                return true;
            case R.id.blue:
                clayout.setBackgroundColor(Color.CYAN);
                return true;
            case R.id.red:
                clayout.setBackgroundColor(Color.RED);
                return true;
            case R.id.black:
                clayout.setBackgroundColor(Color.BLACK);
                return true;
            case R.id.white:
                clayout.setBackgroundColor(Color.WHITE);
                return true;

                default: super.onOptionsItemSelected(menuItem);


        }
        return true;
    }
}
