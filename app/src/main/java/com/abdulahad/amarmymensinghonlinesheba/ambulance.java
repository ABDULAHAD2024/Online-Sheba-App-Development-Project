package com.abdulahad.amarmymensinghonlinesheba;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.airbnb.lottie.LottieAnimationView;

public class ambulance extends AppCompatActivity {

    ImageView back;
    LottieAnimationView call_1,call_2,call_3,call_4,call_5,call_6,call_7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_ambulance);


        call_1 = findViewById(R.id.call_1);
        call_2 = findViewById(R.id.call_2);
        call_3 = findViewById(R.id.call_3);
        call_4 = findViewById(R.id.call_4);
        call_5 = findViewById(R.id.call_5);
        call_6 = findViewById(R.id.call_6);
        call_7 = findViewById(R.id.call_7);

        call_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number = "01720-448666";
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:" + number));
                startActivity(intent);
            }
        });

        call_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number = "8801711980998";
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:" + number));
                startActivity(intent);
            }
        });

        call_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number = "01716798902";
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:" + number));
                startActivity(intent);
            }
        });

        call_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number = "880-91-52291";
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:" + number));
                startActivity(intent);
            }
        });

        call_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number = "880-91-55840";
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:" + number));
                startActivity(intent);
            }
        });


        call_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number = "880-91-61765";
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:" + number));
                startActivity(intent);
            }
        });

        call_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number = "880-91-63400";
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:" + number));
                startActivity(intent);
            }
        });








        back = findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}