package com.example.trabalhoiicharles;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class novaTela extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nova_tela);
    }

    public void Site (View v){

        Intent intencao = new Intent(Intent.ACTION_VIEW);
        Uri uri = Uri.parse("https://www.valvesoftware.com/pt-br/");
        intencao.setData(uri);
        startActivity(intencao);
    }

    public void Ligar (View v){

        Intent ligar = new Intent(Intent.ACTION_DIAL);
        Uri uri = Uri.parse("tel://(425) 889-9642");
        ligar.setData(uri);
        startActivity(ligar);
    }

    public void Compartilhar (View v){

        Intent intencao = new Intent(Intent.ACTION_SEND);
        intencao.putExtra(Intent.EXTRA_TEXT, "https://www.valvesoftware.com/pt-br/");
        intencao.setType("text/plain");
        startActivity(intencao);
    }
}
