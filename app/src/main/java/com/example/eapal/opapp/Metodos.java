package com.example.eapal.opapp;

import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class Metodos {

    public static double areaCuadrado(double lado){
        return (lado*lado);
    }
    public static double areaRectangulo(double base, double altura){
        return (base*altura);
    }
    public static double volumenEsfera(double radio){
        return (Math.pow(radio,3)*Math.PI*4)/3;
    }
    public static double volumenCubo(double arista){
        return Math.pow(arista,3);
    }

    public static boolean validar(ArrayList<EditText> campos, String err1, String err2){
        for (int i = 0; i < campos.size(); i++) {
            if (campos.get(i).getText().toString().isEmpty()){
                campos.get(i).setError(err1);
                campos.get(i).requestFocus();
                return false;
            } else if (Double.parseDouble(campos.get(i).getText().toString()) == 0
                    || Double.parseDouble(campos.get(i).getText().toString()) == 0.0){
                campos.get(i).setError(err2);
                campos.get(i).requestFocus();
                return false;
            }
        }
        return true;
    }

    public static void borrar(ArrayList<EditText> campos){
        for (int i = 0; i < campos.size(); i++) {
            campos.get(i).setText("");
            campos.get(i).requestFocus();
        }
    }
}
