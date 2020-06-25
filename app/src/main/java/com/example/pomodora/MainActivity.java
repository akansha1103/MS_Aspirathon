package com.example.pomodora;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button signup, signin;
    EditText username, passwrd;
    CheckBox c;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        signin=(Button)findViewById(R.id.btn_signin);
        signup = (Button)findViewById(R.id.btn_signup);
        username = (EditText)findViewById(R.id.username);
        passwrd = (EditText)findViewById(R.id.passwrd);
        c = (CheckBox) findViewById(R.id.chk);

        c.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (!c.isChecked()) {
                    passwrd.setTransformationMethod(PasswordTransformationMethod.getInstance());
                } else {
                    passwrd.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                }
            }
        });
        signin.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                if(username.getText().toString().equals("John") && passwrd.getText().toString().equals("12345"))
                {
                    Intent i = new Intent(MainActivity.this, HomeScreen.class);
                    startActivity(i);

                }
                else if(passwrd.getText().toString().length()==0){
                    Toast.makeText(MainActivity.this, "Please enter password.", Toast.LENGTH_SHORT).show();
                }
                else if(username.getText().toString().length()==0){
                    Toast.makeText(MainActivity.this,"Please enter Username.",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(MainActivity.this,"Wrong username or password.",Toast.LENGTH_SHORT).show();
                }
            }
        });



    }
}
