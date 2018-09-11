package com.example.eapal.opapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class Rectangulo extends AppCompatActivity {

    private EditText txtBase, txtAltura;
    private TextView res;
    private ArrayList<EditText> campos = new ArrayList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rectangulo);

        txtBase = findViewById(R.id.txtBase);
        txtAltura = findViewById(R.id.txtAltura);
        res = findViewById(R.id.txtRes);
        campos.add(txtBase);
        campos.add(txtAltura);
    }

    public void calcular(View v){
        Double base, altura, result;

        if (Metodos.validar(campos, getString(R.string.errVacio), getString(R.string.errCero))){
            base = Double.parseDouble(txtBase.getText().toString());
            altura = Double.parseDouble(txtAltura.getText().toString());
            result = Metodos.areaRectangulo(base, altura);

            Resultados r = new Resultados(getString(R.string.aRectangulo), getString(R.string.base)
                    + getString(R.string.altura), result);
            r.guardar();

            res.setText(getString(R.string.mensajeRect)+result);
            borrar();
        }
    }

    public void limpiar(View v){
        borrar();
        res.setText("");
    }

    public void borrar(){
        txtBase.setText("");
        txtAltura.setText("");
    }

}
