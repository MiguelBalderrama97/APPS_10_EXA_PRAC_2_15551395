package com.example.miguel.restaurantes.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.miguel.restaurantes.Adapters.MyAdapter;
import com.example.miguel.restaurantes.Models.Restaurante;
import com.example.miguel.restaurantes.R;

import java.util.ArrayList;
import java.util.List;

public class ListaRestaurantesActivity extends AppCompatActivity implements ListView.OnItemClickListener {

    public static List<Restaurante> restaurantes = new ArrayList<>();
    private MyAdapter myAdapter = new MyAdapter(ListaRestaurantesActivity.this, R.layout.list_item, restaurantes);

    private Intent inDetalles;
    private Bundle bundle;

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_restaurantes);

        listView = findViewById(R.id.listRest);

        getSupportActionBar().setTitle("SELECCIONA TU RESTAURANTE");
        listView.setAdapter(myAdapter);

        listView.setOnItemClickListener(this);

    }

    @Override
    protected void onStart() {
        super.onStart();
        myAdapter.notifyDataSetChanged();
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Restaurante currentRest = restaurantes.get(position);
        bundle = new Bundle();
        inDetalles = new Intent(ListaRestaurantesActivity.this, DetallesActivity.class);
        bundle.putString("Nombre", currentRest.getNombre());
        bundle.putString("Desc", currentRest.getDesc());
        bundle.putString("Direccion", currentRest.getDireccion());
        bundle.putInt("Rating", currentRest.getCalif());
        bundle.putInt("Imagen", currentRest.getIcon());
        bundle.putInt("Rating2", currentRest.getCalif2());
        bundle.putInt("position",position);
        inDetalles.putExtras(bundle);
        startActivity(inDetalles);
    }
}
