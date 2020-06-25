package com.example.pomodora;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class Hydro extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    Spinner spinner;
    Button done;
    Button analytics;
    TextView num;
    int counter=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hydro);

        done = findViewById(R.id.done);
        spinner = findViewById(R.id.dropdown);
        analytics = findViewById(R.id.btn_analytics);
        num = findViewById(R.id.number);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.days, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);





        done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b = new Intent(Hydro.this, HomeScreen.class);
                startActivity(b);

            }
        });



        analytics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent an = new Intent(Hydro.this,Analytics.class);
                startActivity(an);
            }
        });

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String text = parent.getItemAtPosition(position).toString();
        Toast.makeText(parent.getContext(),text, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
    public void countIN(View view)
    {
        counter++;
        num.setText(Integer.toString(counter));
    }
    public void countDE(View view)
    {
        if(counter!=0) {
            counter--;
            num.setText(Integer.toString(counter));
        }
    }
}
