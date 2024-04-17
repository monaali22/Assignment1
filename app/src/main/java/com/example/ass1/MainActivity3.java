package com.example.ass1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        Button btnComp1 = (Button) findViewById(R.id.com1btn);
        Button btnComp2 = (Button)findViewById(R.id.comp2btn) ;
        Button btnComp3 = (Button)findViewById(R.id.btncomp3) ;


        btnComp1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(MainActivity3.this , Compound1Activity.class);
                startActivity(intent1);
            }
        });

        btnComp2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(MainActivity3.this , Compound2Activity.class);
                startActivity(intent2);
            }
        });

        btnComp3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(MainActivity3.this , Compound3.class);
                startActivity(intent2);
            }
        });

        Button b = (Button) findViewById(R.id.bbtn);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(MainActivity3.this , MainActivity.class);
                startActivity(intent3);
            }
        });

    }
}