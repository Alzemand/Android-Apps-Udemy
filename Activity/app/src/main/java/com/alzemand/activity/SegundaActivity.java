package com.alzemand.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SegundaActivity extends AppCompatActivity {

    private TextView textNome, textIdade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        textNome = findViewById(R.id.textNome);
        textIdade = findViewById(R.id.textIdade);

        //Recuperar os dados

        Bundle dados = getIntent().getExtras();
        String nome = dados.getString("nome");
        Integer idade = dados.getInt("idade");

        //valores recuperados

        textNome.setText(nome);
        textIdade.setText(String.valueOf(idade));


    }
}
