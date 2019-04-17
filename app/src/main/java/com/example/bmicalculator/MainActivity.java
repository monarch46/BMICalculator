package com.example.bmicalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText a1, a2, fresult;
    Button b;
    double res, hei, wei, finh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        a1=(EditText) findViewById(R.id.htext);
        a2=(EditText) findViewById(R.id.wtext);
        fresult=(EditText) findViewById(R.id.result);
        b=(Button) findViewById(R.id.buttona);

        b.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String height=a1.getText().toString();
                hei=Double.parseDouble(height);
                String weight=a2.getText().toString();
                wei=Double.parseDouble(weight);
                finh=(hei/100)*(hei/100);
                res= wei/finh;

                if(res<18.5){
                    Toast.makeText(getApplicationContext(),"BMI category: Underweight",Toast.LENGTH_SHORT).show();
                    String fin=Double.toString(res);
                    fresult.setText(fin);
                }
                else if(res>18.5 || res<24.9){
                    Toast.makeText(getApplicationContext(),"BMI Category: Normal Wieght",Toast.LENGTH_SHORT).show();
                    String fin=Double.toString(res);
                    fresult.setText(fin);
                }
                else if(res>25.0 || res<29.9){
                    Toast.makeText(getApplicationContext(),"BMI Category: Overweight",Toast.LENGTH_SHORT).show();
                    String fin=Double.toString(res);
                    fresult.setText(fin);
                }
                else if(res==30 || res>30){
                    Toast.makeText(getApplicationContext(),"BMI Category: Obesity",Toast.LENGTH_SHORT).show();
                    String fin=Double.toString(res);
                    fresult.setText(fin);
                }
                else{
                    Toast.makeText(getApplicationContext(),"Error Input Please Appropriate Value",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}

