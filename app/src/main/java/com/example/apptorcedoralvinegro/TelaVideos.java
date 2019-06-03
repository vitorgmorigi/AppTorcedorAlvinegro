package com.example.apptorcedoralvinegro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import java.util.Vector;

public class TelaVideos extends AppCompatActivity {

    RecyclerView recyclerView;
    Vector<VideosYoutube> videosYoutube = new Vector<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_videos);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager( new LinearLayoutManager(this));

        videosYoutube.add( new VideosYoutube("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/-7tl-gxlvfs\" frameborder=\"0\" allowfullscreen></iframe>") );;

        VideoAdapter videoAdapter = new VideoAdapter(videosYoutube);

        recyclerView.setAdapter(videoAdapter);
    }

}
