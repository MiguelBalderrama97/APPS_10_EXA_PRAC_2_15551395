package com.example.miguel.restaurantes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Intent inDatos;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inDatos = new Intent(this,DatosActivity.class);

    }

    public void onClick(View v){
        switch (v.getId()){
            case R.id.btnCap:
                startActivity(inDatos);
                break;
            case R.id.btnMostrar:
                startActivity(inDatos);
                break;
            case R.id.btnSalir:
                startActivity(inDatos);
                break;
        }
    }


}
