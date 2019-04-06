package com.example.miguel.restaurantes.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import com.example.miguel.restaurantes.Adapters.MyAdapter;
import com.example.miguel.restaurantes.Models.Restaurante;
import com.example.miguel.restaurantes.R;

import java.util.ArrayList;
import java.util.List;

public class ListaRestaurantesActivity extends AppCompatActivity {

    public static List<Restaurante> restaurantes = new ArrayList<>();
    private MyAdapter myAdapter = new MyAdapter(ListaRestaurantesActivity.this, R.layout.list_item, restaurantes);

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_restaurantes);

        listView = findViewById(R.id.listRest);

        getSupportActionBar().setTitle("SELECCIONA TU RESTAURANTE");
        listView.setAdapter(myAdapter);


    }
}
