package com.example.ass1;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Adapter;
import android.widget.AdapterView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
public class MainActivity extends AppCompatActivity {
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listview);

        // Set up click listener for the ListView
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    // Open EquationsActivity
                    Intent intent0 = new Intent(MainActivity.this, EquationsActivity.class);
                    startActivity(intent0);
                }

                else if (position == 1) {
                    // Open EquationsActivity
                    Intent intent1 = new Intent(MainActivity.this, MainActivity2.class);
                    startActivity(intent1);

                }

                else if (position == 2) {
                    // Open EquationsActivity
                    Intent intent2 = new Intent(MainActivity.this, MainActivity3.class);
                    startActivity(intent2);

                }


            }
        });
    }
}