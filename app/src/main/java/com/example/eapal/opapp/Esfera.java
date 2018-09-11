package com.example.eapal.opapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class Esfera extends AppCompatActivity {

    private EditText txtRadio;
    private TextView res;
    private ArrayList<EditText> campos = new ArrayList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_esfera);

        txtRadio = findViewById(R.id.txtRadio);
        res = findViewById(R.id.txtRes);
        campos.add(txtRadio);
    }

    public void calcular(View v){
        Double radio, result;

        if (Metodos.validar(campos, getString(R.string.errVacio), getString(R.string.errCero))){
            radio = Double.parseDouble(txtRadio.getText().toString());
            result = Metodos.volumenEsfera(radio);

            Resultados r = new Resultados(getString(R.string.vEsfera), getString(R.string.datoRad) +radio, result);
            r.guardar();

            res.setText(getString(R.string.mensajeEsf) + String.format("%.2f",  result));
            Metodos.borrar(campos);
        }
    }

    public void limpiar(View v){
        Metodos.borrar(campos);
        res.setText("");
    }
}
