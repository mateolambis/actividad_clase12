package com.mateolambis.Persona.dominio;

public class Profesor extends Persona {
    protected String nivelPregrado;
    protected String experienciaLaboral;
    protected String especialidad;

    public Profesor(int id, String nombre, int edad, String genero, String nivelPregrado, String experienciaLaboral, String especialidad) {
        super(id, nombre, edad, genero);
        this.nivelPregrado = nivelPregrado;
        this.experienciaLaboral = experienciaLaboral;
        this.especialidad = especialidad;
    }

    public String getNivelPregrado() {
        return nivelPregrado;
    }

    public String getExperienciaLaboral() {
        return experienciaLaboral;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setExperienciaLaboral(String experienciaLaboral) {
        this.experienciaLaboral = experienciaLaboral;
    }

    public void setNivelEducativo(String especialidad) {
        this.especialidad = especialidad;
    }
}
