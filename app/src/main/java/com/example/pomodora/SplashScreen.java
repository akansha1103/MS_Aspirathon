package com.example.pomodora;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashScreen extends AppCompatActivity {


    Handler handler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
               /* if (user.getPhn() != "") {
                    Intent go = new Intent(Splash_screen.this, Main_Menu.class);
                    startActivity(go);
                    finish();
                } else
                    {*/
                Intent g = new Intent(SplashScreen.this, MainActivity.class);
                startActivity(g);
                finish();
                //}
            }
        }, 3000);

    }
}
