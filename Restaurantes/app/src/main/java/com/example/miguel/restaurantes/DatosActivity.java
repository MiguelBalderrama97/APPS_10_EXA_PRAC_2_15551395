package com.example.miguel.restaurantes;

import android.app.Activity;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class DatosActivity extends AppCompatActivity {
    Intent inImg;
    final int MY_IMG_REQUEST = 42;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datos);
    }

    public void onClick(View v){
        switch (v.getId()){
            case R.id.btnGuardar:
                break;
            case R.id.imgVwCom:
                startActivityForResult(inImg,MY_IMG_REQUEST);
                break;
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
//        String sCad;
        if(requestCode == MY_IMG_REQUEST){
            if(resultCode == Activity.RESULT_OK){
//                sCad = data.getStringExtra("DATOS");

            }else if(resultCode == Activity.RESULT_CANCELED){
                Toast.makeText(getApplicationContext(),"Cancelado",Toast.LENGTH_SHORT).show();
            }
        }
    }
}
