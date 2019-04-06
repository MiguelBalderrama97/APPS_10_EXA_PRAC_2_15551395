package com.example.miguel.restaurantes.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.example.miguel.restaurantes.R;

public class ListaRestaurantesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_restaurantes);

        getSupportActionBar().setTitle("SELECCIONA TU RESTAURANTE");
        Toast.makeText(this, "LISTA", Toast.LENGTH_SHORT).show();
    }
}
