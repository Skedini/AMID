package com.lab01;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnTask1 = findViewById(R.id.btnTask1);
        btnTask1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Task1Activity.class));
            }
        });

        Button btnTask2 = findViewById(R.id.btnTask2);
        btnTask2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Task2Activity.class));
            }
        });

        Button btnTask3 = findViewById(R.id.btnTask3);
        btnTask3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Task3Activity.class));
            }
        });

        Button btnTask4 = findViewById(R.id.btnTask4);
        btnTask4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Task4Activity.class));
            }
        });

        Button btnTask5 = findViewById(R.id.btnTask5);
        btnTask5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Task5Activity.class));
            }
        });

        Button btnTask6 = findViewById(R.id.btnTask6);
        btnTask6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Task6Activity.class));
            }
        });

        Button btnTask7 = findViewById(R.id.btnTask7);
        btnTask7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Task7Activity.class));
            }
        });
    }
}
