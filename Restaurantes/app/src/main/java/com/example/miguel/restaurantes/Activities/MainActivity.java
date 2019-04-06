package com.example.miguel.restaurantes.Activities;

import android.app.Activity;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.miguel.restaurantes.Models.Restaurante;
import com.example.miguel.restaurantes.R;

public class MainActivity extends AppCompatActivity {

    private Intent inDatos, inList;

    private Restaurante rDato;
    final int RESTARUANTE_REQUEST=420;


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
                startActivityForResult(inDatos,RESTARUANTE_REQUEST);
                break;
            case R.id.btnMostrar:
                startActivity(inList);
                break;
            case R.id.btnSalir:
                finish();
                break;
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);


        if(requestCode == RESTARUANTE_REQUEST){
            if(resultCode == Activity.RESULT_OK){
                int icon =data.getIntExtra("icon",R.drawable.barrafina);
                String nom = data.getStringExtra("nom");
                String desc = data.getStringExtra("desc");
                String dir=data.getStringExtra("dir");
                rDato = new Restaurante(nom,desc,dir,icon,R.mipmap.ic_cero_starts,0); //Este es el mero dato
                ListaRestaurantesActivity.restaurantes.add(rDato);

            }else if(resultCode == Activity.RESULT_CANCELED){
                Toast.makeText(getApplicationContext(),"Cancelado",Toast.LENGTH_SHORT).show();
            }
        }
    }
}
