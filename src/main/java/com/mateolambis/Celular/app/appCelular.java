package com.mateolambis.Celular.app;

import com.mateolambis.Celular.dominio.Celular;
import com.mateolambis.Celular.dominio.Smarphone;

import java.util.ArrayList;
import java.util.List;

public class appCelular {
    public static void main(String[] args){
        List<Celular> celular = new ArrayList<>();
        Smarphone smarphone = new Smarphone(5, "Nokia", "Gris");
        Smarphone smarphone2 = new Smarphone(8, "Blackberry", "Amarillo");

        celular.add(smarphone);
        celular.add(smarphone2);

        Celular celular1 = smarphone;
        ((Smarphone) celular1).getColor();
        if (celular1 instanceof Smarphone){
            System.out.println("este celular es un smarphone");
        }else{
            System.out.println("Este celular no es un smarphone");
        }
    }
}
