package com.example.firstprojek;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        Bundle ambil = getIntent().getExtras();
        if (ambil !== null){
            tv.setTex(nama);
        }
    }
}