package com.abdulahad.amarmymensinghonlinesheba;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class GO extends AppCompatActivity {

    ImageView back;
    CardView Button1,Button2,Button3,Button4,Button5,Button6,Button7,Button8,Button13;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_go);

        back= findViewById(R.id.back);
        Button1= findViewById(R.id.Button1);
        Button2= findViewById(R.id.Button2);
        Button3 = findViewById(R.id.Button3);
        Button4= findViewById(R.id.Button4);
        Button5= findViewById(R.id.Button5);
        Button6= findViewById(R.id.Button6);
        Button7= findViewById(R.id.Button7);
        Button8= findViewById(R.id.Button8);
        Button13= findViewById(R.id.Button13);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        Button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(GO.this, G01.class));
            }
        });

        Button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(GO.this, GO2.class));
            }
        });


        Button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(GO.this, GO3.class));
            }
        });

        Button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(GO.this, ambulance.class));
            }
        });

        Button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(GO.this, doctor.class));
            }
        });

        Button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(GO.this, fire_services.class));
            }
        });

        Button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(GO.this, seba1.class));
            }
        });

        Button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(GO.this, GO8.class));
            }
        });

        Button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(GO.this, GO9.class));
            }
        });










        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}