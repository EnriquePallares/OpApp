package com.example.eapal.opapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class Cubo extends AppCompatActivity {

    private EditText txtArista;
    private TextView res;
    private ArrayList<EditText> campos = new ArrayList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cubo);

        txtArista = findViewById(R.id.txtArista);
        res = findViewById(R.id.txtRes);
        campos.add(txtArista);
    }

    public void calcular(View v){
        Double arista, result;

        if (Metodos.validar(campos, getString(R.string.errVacio), getString(R.string.errCero))){
            arista = Double.parseDouble(txtArista.getText().toString());
            result = Metodos.volumenCubo(arista);

            Resultados r = new Resultados(getString(R.string.vCubo), getString(R.string.datoAri) +arista, result);
            r.guardar();

            res.setText(getString(R.string.mensajeCub) + String.format("%.2f",  result));
            Metodos.borrar(campos);
        }
    }

    public void limpiar(View v){
        Metodos.borrar(campos);
        res.setText("");
    }
}
