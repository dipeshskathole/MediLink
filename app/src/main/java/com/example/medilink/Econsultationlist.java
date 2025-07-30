package com.example.medilink;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class  Econsultationlist extends AppCompatActivity {

    Button btnEconsultationBack;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_econsultationlist);

        btnEconsultationBack = findViewById(R.id.buttonEconsultantBack);
        btnEconsultationBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Econsultationlist.this,HomeActivity.class));

            }
        });

        CardView psychologist = findViewById(R.id.cardPsychologist);
        psychologist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(Econsultationlist.this,OpenCameraApp.class);
                startActivity(it);
            }
        });

        CardView thearpist = findViewById(R.id.cardTherapist);
        thearpist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(Econsultationlist.this,OpenCameraApp.class);
                startActivity(it);
            }
        });

        CardView nutritionsts = findViewById(R.id.cardNutritionst);
        nutritionsts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(Econsultationlist.this,OpenCameraApp.class);
                startActivity(it);
            }
        });
    }
}