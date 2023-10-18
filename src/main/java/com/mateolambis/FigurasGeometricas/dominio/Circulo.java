package com.mateolambis.FigurasGeometricas.dominio;

public class Circulo extends FigurasGeometricas{
    protected double radio;

    public Circulo(String nombre, double radio) {
        super(nombre);
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

}
