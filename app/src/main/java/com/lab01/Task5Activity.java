package com.lab01;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Task5Activity extends AppCompatActivity {

    TextView display;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task5);
        display = findViewById(R.id.tvDisplay);
    }

    public void onKeyClick(View v) {
        Button key = (Button) v;
        String text = key.getText().toString();
        String current = display.getText().toString();

        if (text.equals("C")) {
            display.setText("0");
        } else if (current.equals("0")) {
            display.setText(text);
        } else {
            display.setText(current + text);
        }
    }
}
