package com.example.miguel.restaurantes.Adapters;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.miguel.restaurantes.Models.Restaurante;
import com.example.miguel.restaurantes.R;

import org.w3c.dom.Text;

import java.util.List;

public class MyAdapter extends BaseAdapter {

    private Context context;
    private int layout;
    private List<Restaurante> restaurantes;

    public MyAdapter(Context context, int layout, List<Restaurante> restaurantes) {
        this.context = context;
        this.layout = layout;
        this.restaurantes = restaurantes;
    }

    @Override
    public int getCount() {
        return restaurantes.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ImageView imgIcon, imgRating;
        TextView txtNom, txtDesc, txtDir;

        if(convertView == null){ //NO EXISTE LA FILA, HAY QUE CREARLA
            LayoutInflater layoutInflater = ((Activity)context).getLayoutInflater();
            convertView = layoutInflater.inflate(layout, parent, false);
        }

        imgIcon = convertView.findViewById(R.id.imgIconList);
        imgRating = convertView.findViewById(R.id.imgRatList);
        txtNom = convertView.findViewById(R.id.txtNomList);
        txtDesc = convertView.findViewById(R.id.txtDescList);
        txtDir = convertView.findViewById(R.id.txtDirList);

        Restaurante currentRest = restaurantes.get(position);
        imgIcon.setImageResource(currentRest.getIcon());
        imgRating.setImageResource(currentRest.getCalif());
        txtNom.setText(currentRest.getNombre());
        txtDesc.setText(currentRest.getDesc());
        txtDir.setText(currentRest.getDireccion());

        return convertView;
    }
}
