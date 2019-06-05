package com.example.apptorcedoralvinegro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class TelaAgenda extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_agenda);
    }

    public void vaiParaMapaRodada7(View view){
        Intent intent = new Intent(getApplicationContext(), MapaRodada7.class);
        startActivity(intent);
    }

    public void vaiParaMapaRodada8(View view){
        Intent intent = new Intent(getApplicationContext(), MapaRodada8.class);
        startActivity(intent);
    }

    public void vaiParaMapaRodada9(View view){
        Intent intent = new Intent(getApplicationContext(), MapaRodada9.class);
        startActivity(intent);
    }
}
