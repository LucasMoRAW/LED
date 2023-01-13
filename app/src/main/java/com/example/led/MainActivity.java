package com.example.led;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{

    private EditText editEmail;
    private EditText editMotDePasse;
    private Button connexion;
    private Button inscription;
    private Button reinitialiser;
    private TextView editInscription;
    private TextView editReinitialisation;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editEmail = (EditText) findViewById(R.id.Email);
        editMotDePasse = (EditText) findViewById(R.id.Mdp);
        editInscription = findViewById(R.id.text1);
        editReinitialisation = findViewById(R.id.text3);
        connexion = findViewById(R.id.connexion);
        inscription = findViewById(R.id.incrip);
        reinitialiser = findViewById(R.id.reinit);

        connexion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Accueil.class);
                startActivity(intent);

            }
        });

        inscription.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(MainActivity.this, Inscription.class);
                    startActivity(intent);
                }
        });

        reinitialiser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Reinitialiser.class);
                startActivity(intent);
            }
        });

    }
}