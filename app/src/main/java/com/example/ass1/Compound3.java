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

public class Compound3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compound3);

        Button show = (Button) findViewById(R.id.showcom3);
        TextView comp1Anser = (TextView) findViewById(R.id.textView34);

        show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                comp1Anser.setVisibility(View.VISIBLE);

            }
        });

        Button Next = (Button) findViewById(R.id.Backcomp3);
        Next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(Compound3.this , Compound2Activity.class);
                startActivity(intent1);

            }
        });

        ImageButton back = (ImageButton) findViewById(R.id.imagebtnComp3);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(Compound3.this , MainActivity3.class);
                startActivity(intent2);
            }
        });





    }
}