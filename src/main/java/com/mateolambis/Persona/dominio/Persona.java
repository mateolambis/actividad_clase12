package com.mateolambis.Persona.dominio;

public class Persona {
    protected int id;
    protected String nombre;
    protected int edad;
    protected String genero;

    public Persona(int id, String nombre, int edad, String genero) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
