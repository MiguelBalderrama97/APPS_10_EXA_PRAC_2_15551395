package com.example.miguel.restaurantes.Activities;

import android.app.Activity;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.miguel.restaurantes.R;

public class DatosActivity extends AppCompatActivity {
    Intent inImg;
    Intent inDatoRest;
    ImageView imgVwCom;
    EditText edtTxtNom,edtTxtDesc,edtTxtDir;
    int iRec = R.drawable.barrafina;
    final int MY_IMG_REQUEST = 42;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datos);
        getSupportActionBar().setTitle("DATOS");
        imgVwCom = findViewById(R.id.imgVwCom);
        inImg = new Intent(this,CatalogoImagenesActivity.class);

        edtTxtNom = findViewById(R.id.edtTxtNom);
        edtTxtDesc = findViewById(R.id.edtTxtDesc);
        edtTxtDir = findViewById(R.id.edtTxtDir);

    }

    public void onClick(View v){
        inDatoRest = new Intent();
        switch (v.getId()){
            case R.id.btnGuardar:
                inDatoRest.putExtra("icon",iRec);
                inDatoRest.putExtra("nom",edtTxtNom.getText().toString());
                inDatoRest.putExtra("desc",edtTxtDesc.getText().toString());
                inDatoRest.putExtra("dir",edtTxtDir.getText().toString());
                setResult(Activity.RESULT_OK,inDatoRest);
                finish();
                break;
            case R.id.imgVwCom:
                startActivityForResult(inImg,MY_IMG_REQUEST);
                break;
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        int iRecurso;
        if(requestCode == MY_IMG_REQUEST){
            if(resultCode == Activity.RESULT_OK){
                iRecurso = data.getIntExtra("img",0);
                iRec = iRecurso;
                imgVwCom.setImageResource(iRecurso);

            }else if(resultCode == Activity.RESULT_CANCELED){
                Toast.makeText(getApplicationContext(),"Cancelado",Toast.LENGTH_SHORT).show();
            }
        }

    }
}
