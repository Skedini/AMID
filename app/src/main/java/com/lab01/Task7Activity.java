package com.lab01;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Task7Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task7);

        List<Product> products = new ArrayList<>();
        products.add(new Product("Laptop", "Lekki laptop do nauki i pracy"));
        products.add(new Product("Smartfon", "Telefon z dobrym aparatem"));
        products.add(new Product("Słuchawki", "Bezprzewodowe, z redukcją szumów"));
        products.add(new Product("Klawiatura", "Mechaniczna, podświetlana"));
        products.add(new Product("Mysz", "Ergonomiczna mysz bezprzewodowa"));
        products.add(new Product("Monitor", "24 cale, Full HD"));

        RecyclerView recyclerView = findViewById(R.id.recyclerProducts);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new ProductAdapter(products));
    }
}
