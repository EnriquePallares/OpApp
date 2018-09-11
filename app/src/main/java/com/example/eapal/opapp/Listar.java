package com.example.eapal.opapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import java.util.ArrayList;

public class Listar extends AppCompatActivity {

    private TableLayout tabla;
    private ArrayList<Resultados> resultados;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listar);

        tabla = findViewById(R.id.tabla);
        resultados = Datos.obtener();

        for (int i = 0; i < resultados.size(); i++) {
            TableRow fila = new TableRow(this);
            TextView c1 = new TextView(this);
            TextView c2 = new TextView(this);
            TextView c3 = new TextView(this);
            TextView c4 = new TextView(this);

            c1.setText(String.valueOf(i+1));
            c2.setText(resultados.get(i).getOperacion());
            c3.setText(resultados.get(i).getDatos());
            c4.setText(""+String.format("%.2f", resultados.get(i).getResultado()));

            fila.addView(c1);
            fila.addView(c2);
            fila.addView(c3);
            fila.addView(c4);

            tabla.addView(fila);
        }
    }
}
