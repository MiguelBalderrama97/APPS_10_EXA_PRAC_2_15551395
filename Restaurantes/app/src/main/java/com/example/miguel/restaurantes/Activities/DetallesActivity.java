package com.example.miguel.restaurantes.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.miguel.restaurantes.Models.Restaurante;
import com.example.miguel.restaurantes.R;

import org.w3c.dom.Text;

public class DetallesActivity extends AppCompatActivity {

    private ImageView imgIcon;
    private TextView txtNom, txtDesc, txtDir;
    private ImageButton ibtnStar1, ibtnStar2, ibtnStar3;
    private Restaurante restaurant;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalles);

        imgIcon = findViewById(R.id.imgDetalles);
        txtNom = findViewById(R.id.txtNomDetalles);
        txtDesc = findViewById(R.id.txtDescDetalles);
        txtDir = findViewById(R.id.txtDirDetalles);
        ibtnStar1 = findViewById(R.id.imgStar1);
        ibtnStar2 = findViewById(R.id.imgStar2);
        ibtnStar3 = findViewById(R.id.imgStar3);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();


        int position = bundle.getInt("position");
        restaurant = ListaRestaurantesActivity.restaurantes.get(position);

        getSupportActionBar().setTitle("EVALUACIÓN");

        imgIcon.setImageResource(bundle.getInt("Imagen"));
        txtNom.setText(bundle.getString("Nombre"));
        txtDesc.setText(bundle.getString("Desc"));
        txtDir.setText(bundle.getString("Direccion"));

        switch (bundle.getInt("Rating2")){
            case 0:
                ibtnStar1.setImageResource(R.mipmap.ic_white_stars);
                ibtnStar2.setImageResource(R.mipmap.ic_white_stars);
                ibtnStar3.setImageResource(R.mipmap.ic_white_stars);
                break;
            case 1:
                ibtnStar1.setImageResource(R.mipmap.ic_black_stars);
                ibtnStar2.setImageResource(R.mipmap.ic_white_stars);
                ibtnStar3.setImageResource(R.mipmap.ic_white_stars);
                break;
            case 2:
                ibtnStar1.setImageResource(R.mipmap.ic_black_stars);
                ibtnStar2.setImageResource(R.mipmap.ic_black_stars);
                ibtnStar3.setImageResource(R.mipmap.ic_white_stars);
                break;
            case 3:
                ibtnStar1.setImageResource(R.mipmap.ic_black_stars);
                ibtnStar2.setImageResource(R.mipmap.ic_black_stars);
                ibtnStar3.setImageResource(R.mipmap.ic_black_stars);
                break;
        }

        ibtnStar1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                restaurant.setCalif2(1);
                restaurant.setCalif(R.mipmap.ic_one_star);
                finish();
            }
        });

        ibtnStar2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                restaurant.setCalif2(2);
                restaurant.setCalif(R.mipmap.ic_two_stars);
                finish();
            }
        });

        ibtnStar3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                restaurant.setCalif2(3);
                restaurant.setCalif(R.mipmap.ic_three_stars);
                finish();
            }
        });
    }
}
