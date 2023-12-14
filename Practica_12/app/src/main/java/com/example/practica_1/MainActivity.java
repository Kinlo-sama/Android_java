package com.example.practica_1;

import androidx.appcompat.app.AppCompatActivity;
//Aqui importaremos los layots en caso de agregar mas
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override//Sobrecarga de onCreate para nuestra app
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);//Sobreescribiendo onCreate
        setContentView(R.layout.activity_main);
    }
}