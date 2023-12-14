package com.example.practica_3;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private Button botonSuma;
    private EditText valor1;
    private EditText valor2;
    private TextView resultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Valores a sumar
        valor1 = findViewById(R.id.valor1);
        valor2 = findViewById(R.id.valor2);
        //Boton suma
        botonSuma = findViewById(R.id.botonSuma);
        //Resultado
        resultado = findViewById(R.id.resultado);
        botonSuma.setOnClickListener(new View.OnClickListener(){
           @Override
           public void onClick(View view){
               mostrarSumaenResultado();
           }
        });
    }
    private void mostrarSumaenResultado(){
        String svalor1 = valor1.getText().toString();
        String svalor2 = valor2.getText().toString();
        //Asumiremos que lo que recibido fue un numero
        double numeroValor1 = Double.parseDouble(svalor1);
        double numeroValor2 = Double.parseDouble(svalor2);
        numeroValor2 += numeroValor1;
        resultado.setText("Resultado:"+numeroValor2);
    }
}