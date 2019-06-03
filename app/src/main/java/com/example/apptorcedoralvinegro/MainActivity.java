package com.example.apptorcedoralvinegro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void vaiParaTelaResultados(View view){
        Intent intent = new Intent(getApplicationContext(), TelaResultados.class);
        startActivity(intent);
    }

    public void vaiParaTelaIntegrantes(View view){
        Intent intent = new Intent(getApplicationContext(), TelaIntegrantes.class);
        startActivity(intent);
    }
}
