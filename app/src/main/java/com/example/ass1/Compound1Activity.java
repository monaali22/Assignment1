package com.example.ass1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Compound1Activity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compound1);

        Button show = (Button) findViewById(R.id.showCom1);
        TextView comp1Anser = (TextView) findViewById(R.id.comAnser1);

        show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                comp1Anser.setVisibility(View.VISIBLE);

            }
        });

        Button Next = (Button) findViewById(R.id.NextComp);
        Next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(Compound1Activity.this , Compound2Activity.class);
                startActivity(intent1);

            }
        });

        ImageButton back = (ImageButton) findViewById(R.id.backCom1);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(Compound1Activity.this , MainActivity3.class);
                startActivity(intent2);
            }
        });



    }
}