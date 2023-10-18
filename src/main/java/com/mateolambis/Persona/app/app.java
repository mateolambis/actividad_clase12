package com.mateolambis.Persona.app;

import com.mateolambis.Persona.dominio.Estudiante;
import com.mateolambis.Persona.dominio.Persona;
import com.mateolambis.Persona.dominio.Profesor;

import java.util.ArrayList;
import java.util.List;

public class app {
    public static void main(String[] args){
        List<Persona> person = new ArrayList<>();
        Profesor profe = new Profesor(158, "Andres", 35, "hombre", "Profesional",
                "4 Años", "Educacion Fisica");
        Estudiante estudiante1 = new Estudiante(158, "Daniela", 17, "Mujer", 10,
                4.5);
        person.add(profe);
        person.add(estudiante1);

        Persona persona1 = profe;

        ((Profesor)persona1).setExperienciaLaboral("3 Años");
        if (persona1 instanceof Profesor){
            System.out.println(profe.getNombre() + " es un Profesor de " + profe.getEspecialidad());
        }else{
            System.out.println(estudiante1.getNombre() + " es un estudiante");
        }

    }
}
