package com.example.ass1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Compound2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compound2);

        Button show = (Button) findViewById(R.id.showcomp2);
        Button next = (Button)findViewById(R.id.nextcom2) ;
        Button back = (Button)findViewById(R.id.Backcomp2) ;
        TextView comp2Anser = (TextView) findViewById(R.id.comp2);


        show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                comp2Anser.setVisibility(View.VISIBLE);

            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Compound2Activity.this , Compound3.class);
                startActivity(intent);
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(Compound2Activity.this , Compound1Activity.class);
                startActivity(intent2);
            }
        });



    }
}