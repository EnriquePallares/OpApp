package com.example.eapal.opapp;

import java.util.ArrayList;

public class Datos {

    private static ArrayList<Resultados> resultados = new ArrayList();

    public static void guardar(Resultados r){
        resultados.add(r);
    }

    public static ArrayList<Resultados> obtener(){
        return resultados;
    }
}
