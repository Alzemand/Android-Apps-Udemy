package com.example.combustivel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.BoringLayout;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText txtAlcool;
    private EditText txtGasolina;
    private TextView txtResultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtAlcool = findViewById(R.id.txtAlcool);
        txtGasolina = findViewById(R.id.txtGasolina);
    }

    public void calcular (View view){

        //Recuperar valores

        String precoGasolina = txtGasolina.getText().toString();
        String precoAlcool = txtAlcool.getText().toString();

        Boolean camposValidados = this.validador(precoAlcool, precoGasolina);

        if (camposValidados){
            this.calcularMelhorPreco(precoAlcool, precoGasolina);
        }else{
            txtResultado.setText("Digite todos os campos");
        }

    }

    public Boolean validador (String pAlcool, String pGasolina){

        Boolean camposValidados = true;

        if (pAlcool == null || pAlcool.equals("")){
            camposValidados = false;
        }else if (pGasolina == null || pGasolina.equals("")){
            camposValidados = false;
        }
        return camposValidados;
    }

    public void calcularMelhorPreco(String pAlcool, String pGasolina){

        Double precoAlcool = Double.parseDouble(pAlcool);
        Double precoGasolina = Double.parseDouble(pGasolina);

        Double resultado = precoAlcool / precoGasolina;
        if (resultado >= 0.7){
            txtResultado.setText("Melhor usar Gasolina");
        }else{
            txtResultado.setText("Melhor usar Alcool");
        }

    }


}
