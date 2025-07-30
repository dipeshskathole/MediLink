package com.example.medilink;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HealthArticallist extends AppCompatActivity {

    Button btnback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_health_articallist);

        btnback = findViewById(R.id.buttonHealthArticalBack);
        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HealthArticallist.this,HomeActivity.class));

            }
        });

        CardView healthyheart = findViewById(R.id.cardArtical1);
        healthyheart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(HealthArticallist.this,Artical1.class);
                startActivity(it);
            }
        });

        CardView stopsmoking = findViewById(R.id.cardArtical2);
        stopsmoking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(HealthArticallist.this,Artical2.class);
                startActivity(it);
            }
        });

        CardView vitamin = findViewById(R.id.cardArtical3);
        vitamin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(HealthArticallist.this,Artical3.class);
                startActivity(it);
            }
        });

        CardView quitsugar = findViewById(R.id.cardArtical4);
        quitsugar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(HealthArticallist.this,Artical4.class);
                startActivity(it);
            }
        });

        CardView walkingdaily = findViewById(R.id.cardArtical5);
        walkingdaily.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(HealthArticallist.this,Artical5.class);
                startActivity(it);
            }
        });

        CardView firstaid = findViewById(R.id.cardArtical6);
        firstaid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(HealthArticallist.this,Artical6.class);
                startActivity(it);
            }
        });

        CardView powerup = findViewById(R.id.cardArtical7);
        powerup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(HealthArticallist.this,Artical7.class);
                startActivity(it);
            }
        });
    }
}