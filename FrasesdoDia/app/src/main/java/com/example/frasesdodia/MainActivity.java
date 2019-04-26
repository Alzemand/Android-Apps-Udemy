package com.example.frasesdodia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gerarFrase (View view){

        TextView resultado = findViewById(R.id.textFrase);

        //Vetor definido
        /*String[] frases = new String[10];
        frases[0] = "Poderia ser dessa forma" */

        String[] frases = {
                "Vai toma no cú tranquilo!!!valeu?",
                "Enfia uma dentadura no cu e ri pro caralho!",
                "Vou passar a lambida no pescoço!",
                "Cala boca meu aluno, você está defecando pela boca!"
        };

        int sorte = new Random().nextInt(4);

        resultado.setText(frases[sorte]);
    }

}
