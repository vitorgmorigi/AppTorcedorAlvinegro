package com.example.apptorcedoralvinegro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class TelaNoticia1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_noticia1);
    }

    public void voltaParaTelaNoticias(View view){
        Intent intent = new Intent(getApplicationContext(), TelaNoticias.class);
        startActivity(intent);
    }
}
