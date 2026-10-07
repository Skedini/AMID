package com.kalkulatorbmi;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        EditText wagaText = findViewById(R.id.weightEditText);
        EditText wzrostText = findViewById(R.id.heightEditText);
        Button oblicz = findViewById(R.id.button);
        RadioGroup radioGroup = findViewById(R.id.radioGroup);

        TextView wynikText = findViewById(R.id.wynik);

        oblicz.setOnClickListener(e ->{
            
            if (wagaText.getText().isEmpty() || wzrostText.getText().isEmpty()){
                Toast.makeText(MainActivity.this, "Wprowadź poprawne dane", Toast.LENGTH_SHORT).show();
                if(wagaText.getText().toString().trim().isEmpty()){
                    wagaText.setError("Pole nie może być puste");
                    wagaText.requestFocus();
                }
                else {
                    wzrostText.setError("Pole nie może być puste");
                    wzrostText.requestFocus();
                }
                return;
            }


            double waga = Double.parseDouble(wagaText.getText().toString());
            double wzrost = Double.parseDouble(wzrostText.getText().toString());


            float BMI = (float)((float) waga / Math.pow(wzrost / 100, 2));

            String klasyfikacjaBMI = "";

            if (BMI < 18.5) {
                klasyfikacjaBMI = "Niedowaga";
            } else if (BMI >= 18.5 && BMI < 25) {
                klasyfikacjaBMI = "Waga Właściwa";
            } else if (BMI >= 25 && BMI < 30) {
                klasyfikacjaBMI = "Nadwaga";
            } else if (BMI >= 30) {
                klasyfikacjaBMI = "Otyłość";
            }


            wynikText.setText("Twoje BMI:" + BMI + " " + klasyfikacjaBMI);

            

        });
    }
}