package com.lab03;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SummaryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_summary);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Intent intent = getIntent();

        TextView nazwa = findViewById(R.id.nazwa);
        nazwa.setText("Nazwa klienta: " + intent.getStringExtra("Nazwa"));

        TextView rodzaj = findViewById(R.id.rodzaj);
        rodzaj.setText("Rozmiar: " + intent.getStringExtra("Rodzaj"));

        TextView ser = findViewById(R.id.serview);
        ser.setText("Czy ser?: " + intent.getStringExtra("Ser"));

        Button button = findViewById(R.id.powrot);

        button.setOnClickListener(e -> {
            finish();
        });


    }
}