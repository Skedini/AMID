package com.lab03;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
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

        RadioGroup radioGroup = findViewById(R.id.radioGroup);


        Button button = findViewById(R.id.button);
        CheckBox checkBox = findViewById(R.id.ser);
        EditText editText = findViewById(R.id.editTextText);

        button.setOnClickListener(e-> {
            var radioId = radioGroup.getCheckedRadioButtonId();
            String rodzajPizzy = null;
            boolean ser = checkBox.isChecked();;
            String nazwa_klienta = editText.getText().toString();
            
            if (radioId != 0){
                RadioButton radioButton = findViewById(radioId);
                rodzajPizzy = radioButton.getText().toString();
            }


            Intent intent = new Intent(this, SummaryActivity.class);

            intent.putExtra("Nazwa", nazwa_klienta);
            intent.putExtra("Rodzaj", rodzajPizzy);
            intent.putExtra("Ser", String.valueOf(ser));

            startActivity(intent);
        });



    }
}