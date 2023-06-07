package com.sanjit49.smartweatherapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import java.util.Objects;

public class StartingScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starting_screen);

        Objects.requireNonNull(getSupportActionBar()).hide();
        Thread thread = new Thread() {
            public  void run() {
                try
                {
                    sleep(1000);
                }
                catch(Exception e)
                {
                    e.printStackTrace();
                }
                finally
                {
                    startActivity(new Intent(StartingScreen.this,MainActivity.class));
                    finish();
                }
            }

        };thread.start();
    }

}