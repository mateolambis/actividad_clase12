package com.mateolambis.Persona.dominio;

public class Estudiante extends Persona{
    protected int nivelEducativo;
    protected double calificaciones;

    public Estudiante(int id, String nombre, int edad, String genero, int nivelEducativo, double calificaciones) {
        super(id, nombre, edad, genero);
        this.nivelEducativo = nivelEducativo;
        this.calificaciones = calificaciones;
    }

    public int getNivelEducativo() {
        return nivelEducativo;
    }

    public double getCalificaciones() {
        return calificaciones;
    }

    public void setNivelEducativo(int nivelEducativo) {
        this.nivelEducativo = nivelEducativo;
    }

    public void setCalificaciones(int calificaciones) {
        this.calificaciones = calificaciones;
    }
}
