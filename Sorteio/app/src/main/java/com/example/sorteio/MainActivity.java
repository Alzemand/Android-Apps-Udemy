package com.example.sorteio;

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

    public void sorteio(View view){

        TextView textoResultado = findViewById(R.id.textResultado);
        int numero = new Random().nextInt(10);
        textoResultado.setText("O número sorteado foi: " + numero);
    }
}
