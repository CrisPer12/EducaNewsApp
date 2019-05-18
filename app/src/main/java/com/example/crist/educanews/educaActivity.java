package com.example.crist.educanews;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class educaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_educa);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }
    public void educaMat(View view){
        Intent educaMatIntent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://educacao.uol.com.br/noticias/2019/04/02/falencia-de-grafica-inep-diz-que-cronograma-do-enem-2019-esta-mantido.htm"));
        startActivity(educaMatIntent);
    }

}
