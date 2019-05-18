package com.example.crist.educanews;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class gameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }
    public void gaCs(View view){
        Intent gaCsIntent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.techtudo.com.br/noticias/2019/05/csgo-mibr-supera-eunited-e-brasileiros-avancam-na-ecs-season-7-esports.ghtml"));
        startActivity(gaCsIntent);
    }
    public void apex(View view){
        Intent apexIntent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.techtudo.com.br/noticias/2019/05/apex-legends-entenda-a-queda-da-popularidade-do-battle-royale.ghtml"));
        startActivity(apexIntent);
    }
}
