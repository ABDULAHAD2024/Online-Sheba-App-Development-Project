package com.abdulahad.amarmymensinghonlinesheba;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;
import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    DrawerLayout drawerLayout;
    NavigationView navigationView;
    ImageView menu;
    View header;


    AlertDialog.Builder ExitDialog;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // marque start

        TextView tv;
        tv = (TextView) this.findViewById(R.id.mywidget);
        tv.setSelected(true);
        // marque end


        // ImageSlider Start
        ImageSlider imageSlider;

        imageSlider = findViewById(R.id.image_slider);

        ArrayList<SlideModel> imageList = new ArrayList<>();

        imageList.add(new SlideModel(R.drawable.img1, ScaleTypes.FIT));
        imageList.add(new SlideModel(R.drawable.img2, ScaleTypes.FIT));
        imageList.add(new SlideModel(R.drawable.img3, ScaleTypes.FIT));
        imageList.add(new SlideModel(R.drawable.img4, ScaleTypes.FIT));
        imageList.add(new SlideModel(R.drawable.img5, ScaleTypes.FIT));
        imageList.add(new SlideModel(R.drawable.img6, ScaleTypes.FIT));
        imageList.add(new SlideModel(R.drawable.img7, ScaleTypes.FIT));
        imageList.add(new SlideModel(R.drawable.img8, ScaleTypes.FIT));
        imageList.add(new SlideModel(R.drawable.img9, ScaleTypes.FIT));
        imageList.add(new SlideModel(R.drawable.img10, ScaleTypes.FIT));

        imageSlider.setImageList(imageList);
        // ImageSlider end


//main content start


        CardView porichoy;
        porichoy = findViewById(R.id.porichoy);
        porichoy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, porichoy_activity.class));

            }
        });

        CardView etihas;
        etihas = findViewById(R.id.etihas);
        etihas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, etihas_activity.class));

            }
        });

        CardView jonopotinidi;
        jonopotinidi = findViewById(R.id.jonopotinidi);
        jonopotinidi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(MainActivity.this, AllSEABA.class));

            }
        });

        CardView person;
        person = findViewById(R.id.person);
        person.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, about_app.class));
            }
        });

        CardView share;
        share = findViewById(R.id.share);
        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String shareBody = "Hye,Mymensingh Helpline App" + "http://play.google.com/store/app/details?id =" + MainActivity.this.getPackageName();
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_TEXT, shareBody);
                startActivity(intent);
            }
        });


        CardView rate;
        rate = findViewById(R.id.rate);
        rate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent rateIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=" + MainActivity.this.getPackageName()));
                startActivity(rateIntent);
            }
        });

        CardView seba1;
        seba1 = findViewById(R.id.seba1);
        seba1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, seba1.class));

            }
        });

        CardView seba2;
        seba2 = findViewById(R.id.seba2);
        seba2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number = "999";
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:" + number));
                startActivity(intent);
            }
        });

        CardView seba3;
        seba3 = findViewById(R.id.seba3);
        seba3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number = "333";
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:" + number));
                startActivity(intent);
            }
        });

        CardView seba4;
        seba4 = findViewById(R.id.seba4);
        seba4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(MainActivity.this, SimCode.class));

            }
        });


        CardView seba5;
        seba5 = findViewById(R.id.seba5);
        seba5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, fire_services.class));

            }
        });

        CardView seba6;
        seba6 = findViewById(R.id.seba6);
        seba6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ambulance.class));

            }
        });

        Button allseba;
        allseba = findViewById(R.id.allseba);
        allseba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, AllSEABA.class));

            }
        });


// main content end


// navigation drawer
        drawerLayout = findViewById(R.id.drawerLayout);
        navigationView = findViewById(R.id.navigationView);
        menu = findViewById(R.id.menu);

        header = navigationView.getHeaderView(0);

        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
                    drawerLayout.closeDrawer(GravityCompat.START);
                } else {
                    drawerLayout.openDrawer(GravityCompat.START);
                }
            }
        });

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                if (item.getItemId() == R.id.share) {

                    String shareBody = "Hye,Mymensingh Helplin App" + "http://play.google.com/store/app/details?id =" + MainActivity.this.getPackageName();
                    Intent intent = new Intent(Intent.ACTION_SEND);
                    intent.setType("text/plain");
                    intent.putExtra(Intent.EXTRA_TEXT, shareBody);
                    startActivity(intent);
                    drawerLayout.closeDrawer(GravityCompat.START);

                } else if (item.getItemId() == R.id.rate) {

                    Intent rateIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=" + MainActivity.this.getPackageName()));
                    startActivity(rateIntent);
                    drawerLayout.closeDrawer(GravityCompat.START);

                } else if (item.getItemId() == R.id.home) {
                    drawerLayout.closeDrawer(GravityCompat.START);


                } else if (item.getItemId() == R.id.about) {
                    startActivity(new Intent(MainActivity.this, about_app.class));
                    drawerLayout.closeDrawer(GravityCompat.START);
                }

            else if (item.getItemId() == R.id.developer) {
                    startActivity(new Intent(MainActivity.this, developer.class));
                    drawerLayout.closeDrawer(GravityCompat.START);
                }
    else if (item.getItemId() == R.id.call) {
                    startActivity(new Intent(MainActivity.this, seba1.class));
                    drawerLayout.closeDrawer(GravityCompat.START);
                }


                return false;
            }
        });


    }

    public void loadExitDialog() {

        ExitDialog = new AlertDialog.Builder(MainActivity.this);
        ExitDialog.setMessage("আপনি কি এপ থেকে বের হতে চান?\nযেকোনো তথ্য দিতে যোগাযোগ করুন" );
        ExitDialog.setTitle("আমার ময়মনসিংহ");
        ExitDialog.setIcon(R.drawable.review);
        ExitDialog.setCancelable(false);
        ExitDialog.setPositiveButton("হ্যা", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });

        ExitDialog.setNegativeButton("না", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                dialog.cancel();
            }
        });

        AlertDialog alertDialog = ExitDialog.create();
        alertDialog.show();

    }


    @Override
    public void onBackPressed() {

        loadExitDialog();


    }
}