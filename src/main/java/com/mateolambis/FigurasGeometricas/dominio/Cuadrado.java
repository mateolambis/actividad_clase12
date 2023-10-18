package com.mateolambis.FigurasGeometricas.dominio;

public class Cuadrado extends FigurasGeometricas{
    protected double lado;

    public Cuadrado(String nombre, double lado) {
        super(nombre);
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }
}
