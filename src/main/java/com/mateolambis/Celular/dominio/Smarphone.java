package com.mateolambis.Celular.dominio;

public class Smarphone extends Celular{
    protected String color;

    public Smarphone(int serial, String marca, String color) {
        super(serial, marca);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
