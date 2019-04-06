package com.example.miguel.restaurantes.Models;

public class Restaurante {

    private String nombre, desc, direccion;
    private int icon, calif, calif2;

    public Restaurante(){}

    public Restaurante(String nombre, String desc, String direccion, int icon, int calif, int calif2) {
        this.nombre = nombre;
        this.desc = desc;
        this.direccion = direccion;
        this.icon = icon;
        this.calif = calif;
        this.calif2 = calif2;
    }

    public int getCalif2() {
        return calif2;
    }

    public void setCalif2(int calif2) {
        this.calif2 = calif2;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    public int getCalif() {
        return calif;
    }

    public void setCalif(int calif) {
        this.calif = calif;
    }
}
