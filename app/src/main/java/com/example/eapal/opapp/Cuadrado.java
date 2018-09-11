package com.example.eapal.opapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class Cuadrado extends AppCompatActivity {

    private EditText txtLado;
    private TextView res;
    private ArrayList<EditText> campos = new ArrayList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuadrado);

        txtLado = findViewById(R.id.txtLados);
        res = findViewById(R.id.txtRes);
        campos.add(txtLado);
    }

    public void calcular(View v){
        Double lados, result;

        if (Metodos.validar(campos, getString(R.string.errVacio), getString(R.string.errCero))){
            lados = Double.parseDouble(txtLado.getText().toString());
            result = Metodos.areaCuadrado(lados);

            Resultados r = new Resultados(getString(R.string.aCuadrado), getString(R.string.lados), result);
            r.guardar();

            res.setText(getString(R.string.mensajeCuad)+result);
            borrar();
        }
    }

    public void limpiar(View v){
        borrar();
        res.setText("");
    }

    public void borrar(){
        txtLado.setText("");
    }
}
