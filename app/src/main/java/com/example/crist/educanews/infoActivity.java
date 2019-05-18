package com.example.crist.educanews;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class infoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }
    public void zenfone(View view){
        Intent zenfoneIntent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.tecmundo.com.br/dispositivos-moveis/141304-vaza-design-asus-zenfone-6-tela-notch-camera-giratoria.htm"));
        startActivity(zenfoneIntent);
    }
    public void pedra(View view){
        Intent pedraIntent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.tecmundo.com.br/internet/141442-mulher-tem-casa-apedrejada-trocar-senha-wi-fi-veja-video.htm"));
        startActivity(pedraIntent);
    }
}
