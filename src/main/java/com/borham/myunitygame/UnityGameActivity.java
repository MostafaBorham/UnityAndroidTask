package com.borham.myunitygame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class UnityGameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unity_game);
        getSupportActionBar().hide();
    }
}