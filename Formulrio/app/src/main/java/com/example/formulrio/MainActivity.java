package com.example.formulrio;

import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private TextInputEditText campoNome;
    private TextView campoResultado;
    private CheckBox cbBranco, cbAzul, cbVermelho;
    List<String> check = new ArrayList<String>();
    private RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        campoNome = findViewById(R.id.txtNome);
        campoResultado = findViewById(R.id.txtResultado);
        cbBranco = findViewById(R.id.cbBranco);
        cbAzul = findViewById(R.id.cbAzul);
        cbVermelho = findViewById(R.id.cbVermelho);
        radioGroup = findViewById(R.id.rgGrupo);

    }

    public void verifica (){

        check.clear();

        if (cbBranco.isChecked()){
            check.add(cbBranco.getText().toString());
        }

        if (cbVermelho.isChecked()){
            check.add(cbVermelho.getText().toString());
        }

        if (cbAzul.isChecked()){
            check.add(cbAzul.getText().toString());
        }
        campoResultado.setText(check.toString());
    }

    public void verificarRadioButton(){

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if( checkedId == R.id.radioButton7){

                }else if (checkedId == R.id.radioButton8){

                }
            }
        });


    }



    public void enviar (View view){
//        String nome = campoNome.getText().toString();
//        campoResultado.setText(nome);
            verifica();
    }

}
