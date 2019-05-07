package com.example.revisao;

import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView textoFinal;
    private TextInputEditText nome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textoFinal = findViewById(R.id.txtResultado);
        nome = findViewById(R.id.nomeUsuario);
    }

    public void sortear (View view){


        textoFinal.setText(nome.getText());

    }
}
