package com.example.tp1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
   private TextView NomT;
   private TextView PrenomT;
   private TextView NumT;
   private TextView AgeT;
   private EditText Nom;
   private EditText Prenom;
   private EditText Num;
   private EditText Age;
   private Button Valider;
   private Button Fr;
   private Button EN;
   private Boolean valid= false;
   private Boolean valid1 = false;
   private Boolean valid2= false;
   private Boolean valid3 = false;





    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Nom = (EditText) findViewById(R.id.nom) ;
        Prenom = (EditText) findViewById(R.id.prenom) ;
        Num = (EditText) findViewById(R.id.num) ;
        Age = (EditText) findViewById(R.id.age) ;
        NomT = (TextView) findViewById(R.id.nomT);
        PrenomT =(TextView) findViewById(R.id.prenomT) ;
        NumT=(TextView) findViewById(R.id.numT) ;
        AgeT=(TextView) findViewById(R.id.ageT) ;

        Valider = (Button) findViewById(R.id.valider);
        Fr = (Button) findViewById(R.id.fr);
        EN = (Button) findViewById(R.id.en);
        Valider.setEnabled(false);
        Nom.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                valid = s.toString().length()!=0   ;
                Valider.setEnabled(valid && valid1 && valid2 && valid3);

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        Prenom.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                valid1 = s.toString().length()!=0   ;
                Valider.setEnabled(valid && valid1 && valid2 && valid3);
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        Age.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                valid2 = s.toString().length()!=0   ;
                Valider.setEnabled(valid && valid1 && valid2 && valid3);
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        Num.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                valid3 = s.toString().length()!=0   ;
                Valider.setEnabled(valid && valid1 && valid2 && valid3);
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        EN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NomT.setText("Last Name :");
                PrenomT.setText("First Name :");
                NumT.setText("Number Phone : ");
                Valider.setText("Validate");


            }
        });
        Fr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NomT.setText("Nom :");
                PrenomT.setText("Prénom :");
                NumT.setText(" Numéro de télephone: ");
                Valider.setText("Valider");
            }
        });

    }
}