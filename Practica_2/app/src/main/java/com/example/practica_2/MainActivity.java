package com.example.practica_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    //Declaracion de tipos a usar
    private Button boton;
    private EditText texto1_edit;
    private TextView texto_mostrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        texto1_edit = findViewById(R.id.texto_edit_1);
        boton = findViewById(R.id.boton1);
        texto_mostrar = findViewById(R.id.texto1);
        //Funcion que define el evento de presionar el boton
        boton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //Funcion para visualizar la cadena ingresada
                mostrarTextoEnTextView();
            }
        });
    }
    private void mostrarTextoEnTextView(){
        String textoIngresado = texto1_edit.getText().toString();
        texto_mostrar.setText(textoIngresado);
    }
}