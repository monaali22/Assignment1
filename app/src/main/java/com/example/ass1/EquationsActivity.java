package com.example.ass1;

import static com.example.ass1.R.id.EQ1btnImage;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class EquationsActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_equations);

        ImageButton EQ1 = (ImageButton) findViewById(R.id.EQ1ImageBtn);
        EQ1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int1 = new Intent(EquationsActivity.this , Equation1Activity.class);
                startActivity(int1);

            }
        });

        ImageButton EQ2 = (ImageButton) findViewById(R.id.EQ2ImageBtn);
        EQ2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(EquationsActivity.this , Equation2Activity.class);
                startActivity(intent2);
            }
        });

        ImageButton EQ3 = (ImageButton) findViewById(R.id.EQ3ImageBtn);
        EQ3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(EquationsActivity.this , Equation3Activity.class);
                startActivity(intent3);
            }
        });

        ImageButton back = (ImageButton) findViewById(R.id.BackEQbtn);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4 = new Intent(EquationsActivity.this , MainActivity.class);
                startActivity(intent4);
            }
        });


    }
}