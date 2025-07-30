package com.example.medilink;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ProfileUpdate extends AppCompatActivity {

    EditText edUsername, edFullname, edAge, edBloodgroup;

    Button btninsert , btnupdate, btndelete , btnback;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_update);

        edUsername = findViewById(R.id.editTextUsernamepro);
        edFullname = findViewById(R.id.editTextFullnamepro);
        edAge = findViewById(R.id.editTextNumberAgepro);
        edBloodgroup = findViewById(R.id.editTextbloodpro);
        btninsert = findViewById(R.id.buttonInsert);
        btnupdate = findViewById(R.id.buttonUpdate);
        btndelete = findViewById(R.id.buttonDelete);
        btnback = findViewById(R.id.button5);

        btninsert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = edUsername.getText().toString();
                String fullname = edFullname.getText().toString();
                String blood_group = edBloodgroup.getText().toString();
                String age = edAge.getText().toString();
                Database db = new Database(getApplicationContext(),"MediLink",null,1);
                db. udpadeprofile(username,fullname,blood_group,age);
                Toast.makeText(getApplicationContext(), "Data inserted successfully", Toast.LENGTH_SHORT).show();

            }
        });
        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ProfileUpdate.this,HomeActivity.class));
            }
        });

        btnupdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = edUsername.getText().toString();
                String fullname = edFullname.getText().toString();
                String blood_group = edBloodgroup.getText().toString();
                String age = edAge.getText().toString();
                Database db = new Database(getApplicationContext(),"MediLink",null,1);
                db.updatedata( username,fullname,blood_group,age);
                Toast.makeText(getApplicationContext(), "Data Updated successfully", Toast.LENGTH_SHORT).show();


            }
        });

        btndelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = edUsername.getText().toString();

                Database db = new Database(getApplicationContext(),"MediLink",null,1);
                db.deleteProfile( username);
                Toast.makeText(getApplicationContext(), "Data Deleted successfully", Toast.LENGTH_SHORT).show();


            }
        });

    }
}