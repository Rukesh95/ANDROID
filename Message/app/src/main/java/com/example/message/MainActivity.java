package com.example.message;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.concurrent.atomic.AtomicReference;

public class MainActivity extends AppCompatActivity {

    Button sendsms;
    EditText phno;
    EditText smsbody;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sendsms=findViewById(R.id.sendsms);
        phno=findViewById(R.id.phno);
        smsbody=findViewById(R.id.smsbody);

        sendsms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendSmsByIntent();

            }
        });
    }
    private void sendSmsByIntent()
    {
        Toast.makeText(this,"Started SMS",Toast.LENGTH_SHORT).show();
        Uri uri=Uri.parse("smsto:" + phno.getText().toString());
        AtomicReference<Intent> smsIntent= new AtomicReference<>(new Intent(Intent.ACTION_SENDTO, uri));
        smsIntent.get().putExtra("sms_body", smsbody.getText().toString());
        try
        {
            startActivity(smsIntent.get());
        }
        catch (Exception ex)
        {
            Toast.makeText(MainActivity.this,"Message not sent",Toast.LENGTH_LONG).show();
            ex.printStackTrace();
        }
    }
}
