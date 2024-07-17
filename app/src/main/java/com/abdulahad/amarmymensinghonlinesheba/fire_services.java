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

public class fire_services extends AppCompatActivity {

    ImageView back;
    LottieAnimationView call_1,call_2,call_3,call_4,call_5,call_6,call_7,call_8,call_9,call_10,call_11;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_fire_services);

        call_1 = findViewById(R.id.call_1);
        call_2 = findViewById(R.id.call_2);
        call_3 = findViewById(R.id.call_3);
        call_4 = findViewById(R.id.call_4);
        call_5 = findViewById(R.id.call_5);
        call_6 = findViewById(R.id.call_6);
        call_7 = findViewById(R.id.call_7);
        call_8 = findViewById(R.id.call_8);
        call_9 = findViewById(R.id.call_9);
        call_10 = findViewById(R.id.call_10);
        call_11 = findViewById(R.id.call_11);



        call_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number = "01730-002353";
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:" + number));
                startActivity(intent);
            }
        });

        call_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number = "01758-731414";
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:" + number));
                startActivity(intent);
            }
        });
        call_10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number = "09033-56333";
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:" + number));
                startActivity(intent);
            }
        });
        call_11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number = "01730-879000";
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:" + number));
                startActivity(intent);
            }
        });






        call_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String number = "09028-75222";
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:" + number));
                startActivity(intent);
            }
        });

        call_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number = "01720-020041";
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:" + number));
                startActivity(intent);
            }
        });

        call_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number = "01730-002368";
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:" + number));
                startActivity(intent);
            }
        });

        call_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number = "01730-002367";
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:" + number));
                startActivity(intent);
            }
        });


        call_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number = "09025-56400";
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:" + number));
                startActivity(intent);
            }
        });

        call_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number = "09026-56333";
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:" + number));
                startActivity(intent);
            }
        });


        call_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number = "091-67444";
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