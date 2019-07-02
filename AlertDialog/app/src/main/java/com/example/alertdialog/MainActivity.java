package com.example.alertdialog;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void abrirAlerta(View view){
        AlertDialog.Builder dialog = new AlertDialog.Builder(this);

        //configurar dialogo
        dialog.setTitle("Titulo");
        dialog.setMessage("Mensagem");

        dialog.setPositiveButton("sim", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(getApplicationContext(), "Sim foi pressionado", Toast.LENGTH_LONG).show();
            }
        });

        dialog.setNegativeButton("não", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(getApplicationContext(), "Não foi pressionado", Toast.LENGTH_LONG).show();
            }
        });

        dialog.create();
        dialog.show();
    }
}
