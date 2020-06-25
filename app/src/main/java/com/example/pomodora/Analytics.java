package com.example.pomodora;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class Analytics extends AppCompatActivity {

    Button log;
    Spinner spin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_analytics);

        log = findViewById(R.id.logs);
        spin = findViewById(R.id.dropdown2);


        log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent o = new Intent(Analytics.this,Hydro.class);
                startActivity(o);
            }
        });
    }
}
