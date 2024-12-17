package com.example.movieapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MenuActivity extends AppCompatActivity {
    Button b1,b2,b3,b4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_menu);
        b1=(Button) findViewById(R.id.exitbtn);
        b2=(Button) findViewById(R.id.addbtn);
        b3=(Button) findViewById(R.id.searchbtn);
        b4=(Button) findViewById(R.id.viewbtn);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent o2=new Intent(getApplicationContext(), MainActivity.class);
                startActivity(o2);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent o3=new Intent(getApplicationContext(), AddMovieActivity.class);
                startActivity(o3);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent o4=new Intent(getApplicationContext(), MainActivity.class);
                startActivity(o4);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent o5=new Intent(getApplicationContext(), ViewMovieActivity.class);
                startActivity(o5);
            }
        });
    }
}