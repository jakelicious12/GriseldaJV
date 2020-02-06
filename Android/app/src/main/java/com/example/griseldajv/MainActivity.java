package com.example.griseldajv;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        GriseldaMember BennyTheBtucher = new GriseldaMember();
        GriseldaMember ConwayTheMachine = new GriseldaMember();
        GriseldaMember WestSideGunn = new GriseldaMember();
    }
}
