package com.example.miguel.restaurantes.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.miguel.restaurantes.R;

public class MainActivity extends AppCompatActivity {
    private Intent inDatos, inList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inDatos = new Intent(this,DatosActivity.class);
        inList = new Intent(this, ListaRestaurantesActivity.class);

    }

    public void onClick(View v){
        switch (v.getId()){
            case R.id.btnCap:
                startActivity(inDatos);
                break;
            case R.id.btnMostrar:
                startActivity(inList);
                break;
            case R.id.btnSalir:
                finish();
                break;
        }
    }


}
