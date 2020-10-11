package com.cps731lab5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;

import java.util.Timer;
import java.util.TimerTask;

public class SplashActivity extends AppCompatActivity {

    private Intent intent;
    MediaPlayer openingMusic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        openingMusic = new MediaPlayer();
        openingMusic = MediaPlayer.create(this, R.raw.arp005);
        openingMusic.start();
        TimerTask task=new TimerTask() {
            @Override
            public void run() {
                finish();
                startActivity(new Intent(SplashActivity.this, RecipeListActivity.class));
            }
        };
        Timer opening= new Timer();
        opening.schedule(task,5000);
    }

}