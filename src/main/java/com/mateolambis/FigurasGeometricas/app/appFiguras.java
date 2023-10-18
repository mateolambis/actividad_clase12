package com.mateolambis.FigurasGeometricas.app;

import com.mateolambis.FigurasGeometricas.dominio.Circulo;
import com.mateolambis.FigurasGeometricas.dominio.Cuadrado;
import com.mateolambis.FigurasGeometricas.dominio.FigurasGeometricas;
import com.mateolambis.FigurasGeometricas.dominio.Triangulo;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class appFiguras {
    public static void main(String[] args){
        List<FigurasGeometricas> figuras = new ArrayList<>();
        Circulo circulo = new Circulo("Circulo", 3.14);
        Cuadrado cuadrado = new Cuadrado("Cuadrado", 4.14);
        Triangulo triangulo = new Triangulo("Triangulo", 3, 1.5);

        figuras.add(circulo);
        figuras.add(cuadrado);
        figuras.add(triangulo);

        FigurasGeometricas figura1 = circulo;
        ((Circulo) figura1).getRadio();
        if (figura1 instanceof Circulo){
            System.out.println("Esta figura es un circulo");
        }else{
            System.out.println("Esta figura no es un circulo");
        }

        FigurasGeometricas figura2 = cuadrado;
        ((Cuadrado) figura2).getLado();
        if (figura2 instanceof Cuadrado){
            System.out.println("Esta figura es un cuadrado");
        }else{
            System.out.println("Esta figura no es un cuadrado");
        }
    }
}
