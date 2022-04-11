package com.mxplayer.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Contact extends AppCompatActivity {
MediaPlayer mp;
Button  Play,Pause,Play1,Pause1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);
        Play=findViewById(R.id.play);
        Pause=findViewById(R.id.pause);

        Play1=findViewById(R.id.play1);
        Pause1=findViewById(R.id.pause1);


        Play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(mp == null){
                    mp = MediaPlayer.create(Contact.this,R.raw.sample);
                    mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                        @Override
                        public void onCompletion(MediaPlayer mp) {
                           // stopPlayer();
                        }
                    });
                }
                mp.start();

            }
        });

        Pause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mp != null){
                    mp.pause();
                }

            }
        });



        Play1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(mp == null){
                    mp = MediaPlayer.create(Contact.this,R.raw.sample);
                    mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                        @Override
                        public void onCompletion(MediaPlayer mp) {
                            //stopPlayer();
                        }
                    });
                }
                mp.start();

            }
        });

        Pause1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(mp != null){
                    mp.pause();
                }

            }
        });
    }

}