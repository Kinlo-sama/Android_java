package com.example.practica_4;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private Button botonSuma,botonResta,botonMult,botonDiv;
    private EditText valor1,valor2;
    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Encontrar variable
        botonSuma = findViewById(R.id.botonSuma);
        botonResta = findViewById(R.id.botonResta);
        botonMult = findViewById(R.id.botonMult);
        botonDiv = findViewById(R.id.botonDiv);
        valor1 = findViewById(R.id.valor1);
        valor2 = findViewById(R.id.valor2);
        resultado = findViewById(R.id.resultado);

        //Funciones
        botonSuma.setOnClickListener(new View.OnClickListener(){
           @Override
           public void onClick(View view){
               mostrarSuma();
           }
        });
        botonResta.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                mostrarResta();
            }
        });
        botonMult.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                mostrarMult();
            }
        });
        botonDiv.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                mostrarDiv();
            }
        });
    }
    private void mostrarSuma(){
        String svalor1 = valor1.getText().toString();
        String svalor2 = valor2.getText().toString();
        double numero1 = Double.parseDouble(svalor1);
        double numero2 = Double.parseDouble(svalor2);
        double res = numero1 + numero2;
        resultado.setText("Resultado:"+ res);
    }
    private void mostrarResta(){
        String svalor1 = valor1.getText().toString();
        String svalor2 = valor2.getText().toString();
        double numero1 = Double.parseDouble(svalor1);
        double numero2 = Double.parseDouble(svalor2);
        double res = numero1 - numero2;
        resultado.setText("Resultado:"+ res);
    }
    private void mostrarMult(){
        String svalor1 = valor1.getText().toString();
        String svalor2 = valor2.getText().toString();
        double numero1 = Double.parseDouble(svalor1);
        double numero2 = Double.parseDouble(svalor2);
        double res = numero1 * numero2;
        resultado.setText("Resultado:"+ res);
    }
    private void mostrarDiv(){
        String svalor1 = valor1.getText().toString();
        String svalor2 = valor2.getText().toString();
        double numero1 = Double.parseDouble(svalor1);
        double numero2 = Double.parseDouble(svalor2);
        double res = numero1 / numero2;
        resultado.setText("Resultado:"+ res);
    }
}