package com.example.apptorcedoralvinegro;

import android.content.Intent;
import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class TelaNoticias extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_noticias);

        TextView noticia1 = (TextView) findViewById(R.id.noticia1);
        noticia1.setPaintFlags(Paint.UNDERLINE_TEXT_FLAG);

        TextView noticia2 = (TextView) findViewById(R.id.noticia2);
        noticia2.setPaintFlags(Paint.UNDERLINE_TEXT_FLAG);

        TextView noticia3 = (TextView) findViewById(R.id.noticia3);
        noticia3.setPaintFlags(Paint.UNDERLINE_TEXT_FLAG);
    }


    public void vaiParaTelaNoticia1(View view){
        Intent intent = new Intent(getApplicationContext(), TelaNoticia1.class);
        startActivity(intent);
    }

    public void vaiParaTelaNoticia2(View view){
        Intent intent = new Intent(getApplicationContext(), TelaNoticia2.class);
        startActivity(intent);
    }

    public void vaiParaTelaNoticia3(View view){
        Intent intent = new Intent(getApplicationContext(), TelaNoticia3.class);
        startActivity(intent);
    }


}
