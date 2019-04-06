package com.example.miguel.restaurantes.Activities;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.miguel.restaurantes.R;

public class CatalogoImagenesActivity extends AppCompatActivity {
    private Intent inDatos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catalogo_imagenes);

        getSupportActionBar().setTitle("SELECCIONA LA IMAGEN");

    }

    public void onClick(View v){
        inDatos = new Intent();
        switch (v.getId()){
            case R.id.imgVw1:
                inDatos.putExtra("img",R.drawable.barrafina);
                setResult(Activity.RESULT_OK,inDatos);
                break;
            case R.id.imgVw2:
                inDatos.putExtra("img",R.drawable.bourkestreetbakery);
                setResult(Activity.RESULT_OK,inDatos);
                break;
            case R.id.imgVw3:
                inDatos.putExtra("img",R.drawable.cafedeadend);
                setResult(Activity.RESULT_OK,inDatos);
                break;
        }
        finish();
    }
}
