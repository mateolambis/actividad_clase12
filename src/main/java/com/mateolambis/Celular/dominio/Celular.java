package com.mateolambis.Celular.dominio;

public class Celular {
    protected int serial;
    protected String marca;
    protected String nombre;

    public Celular(int serial, String marca) {
        this.serial = serial;
        this.marca = marca;
    }

    public int getSerial() {
        return serial;
    }

    public String getMarca() {
        return marca;
    }
}
