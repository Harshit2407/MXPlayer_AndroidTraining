package com.mxplayer.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button about,gallery,contact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        about=(Button) findViewById(R.id.btn1);
        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1=new Intent(MainActivity.this,About.class);
                startActivity(i1);
            }
        });

        gallery=(Button) findViewById(R.id.btn2);
        gallery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2=new Intent(MainActivity.this,Gallery.class);
                startActivity(i2);
            }
        });

        contact=(Button) findViewById(R.id.btn3);
        contact.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i3=new Intent(MainActivity.this,Contact.class);
                startActivity(i3);
            }
        }));

    }

}