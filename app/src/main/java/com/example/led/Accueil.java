package com.example.led;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Accueil extends AppCompatActivity {
    private Button quitter;
    private Button supprimer;
    private Button ajouter;
    private ImageButton blueetooth1;
    private ImageButton blueetooth2;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accueil);

        quitter=(Button)findViewById(R.id.quitter);
        quitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Accueil.this, MainActivity.class);
                startActivity(intent);
            }
        });

        supprimer=(Button)findViewById(R.id.supprimer);
        supprimer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Accueil.this, SupprimerLed.class);
                startActivity(intent);
            }
        });

        ajouter=(Button)findViewById(R.id.ajouter);
        ajouter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Accueil.this, AjouterLed.class);
                startActivity(intent);
            }
        });

        blueetooth1=(ImageButton)findViewById(R.id.Blueetooth1);
        blueetooth1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Accueil.this, CercleChromatique.class);
                startActivity(intent);
            }
        });

        blueetooth2=(ImageButton)findViewById(R.id.Blueetooth2);
        blueetooth2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Accueil.this, CercleChromatique.class);
                startActivity(intent);
            }
        });
    }
}