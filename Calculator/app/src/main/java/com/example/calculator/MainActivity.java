package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText opr1,opr2;
    private TextView txtresult;
    private Button Buttonadd,Buttonsub,Buttonmul,Buttondiv,clear;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        opr1=findViewById(R.id.opr1);
        opr2=findViewById(R.id.opr2);
        Buttonadd=findViewById(R.id.buttonadd);
        Buttonsub=findViewById(R.id.buttonsub);
        Buttonmul=findViewById(R.id.buttonmul);
        Buttondiv=findViewById(R.id.buttondiv);
        clear=findViewById(R.id.clear);
        txtresult=findViewById(R.id.result);
        opr2.setInputType(InputType.TYPE_CLASS_NUMBER);
        opr1.setInputType(InputType.TYPE_CLASS_NUMBER);

        Buttonadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (opr1.getText().length() > 0 && opr2.getText().length() > 0)
                {
                    double oper1 = Double.parseDouble(opr1.getText().toString());
                    double oper2 = Double.parseDouble(opr2.getText().toString());
                    double result = oper1 + oper2;
                    txtresult.setText(Double.toString(result));


                }
                else
                    {

                    Toast.makeText(MainActivity.this, "oper1 and oper2 required", Toast.LENGTH_SHORT).show();
                   }
            }

        });
        Buttonsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (opr1.getText().length()>0&&opr2.getText().length()>0)
                {
                    double oper1 = Double.parseDouble(opr1.getText().toString());
                    double oper2 = Double.parseDouble(opr2.getText().toString());
                    double result = oper1 - oper2;
                    txtresult.setText(Double.toString(result));
                }
                else
                {

                    Toast.makeText(MainActivity.this, "oper1 and oper2 required", Toast.LENGTH_SHORT).show();
                }
            }
        });
        Buttonmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (opr1.getText().length() > 0 && opr2.getText().length() > 0) {
                    double oper1 = Double.parseDouble(opr1.getText().toString());
                    double oper2 = Double.parseDouble(opr2.getText().toString());
                    double result = oper1 * oper2;
                    txtresult.setText(Double.toString(result));
                } else {

                    Toast.makeText(MainActivity.this, "oper1 and oper2 required", Toast.LENGTH_SHORT).show();
                }
            }
        });
        Buttondiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (opr1.getText().length() > 0 && opr2.getText().length() > 0) {
                    double oper1 = Double.parseDouble(opr1.getText().toString());
                    double oper2 = Double.parseDouble(opr2.getText().toString());
                    double result = oper1 / oper2;
                    txtresult.setText(Double.toString(result));
                } else {

                    Toast.makeText(MainActivity.this, "oper1 and oper2 required", Toast.LENGTH_SHORT).show();
                }
            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opr1.setText("");
                opr2.setText("");
                txtresult.setText("0.00");
                opr1.requestFocus();
            }
        });
    }
}
