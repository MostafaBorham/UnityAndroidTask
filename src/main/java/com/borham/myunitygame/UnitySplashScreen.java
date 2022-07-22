package com.borham.myunitygame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.ScaleAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;

public class UnitySplashScreen extends AppCompatActivity {

    private ImageView unityLogo;
    private Animation zoomInAnimation;
    final int delay=1000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unity_splash_screen);
        getSupportActionBar().hide();
        zoomInAnimation= AnimationUtils.loadAnimation(this,R.anim.zoom_in_anim);
        unityLogo=findViewById(R.id.unityLogo);
        new Handler().postDelayed(() -> {
            unityLogo.setVisibility(View.VISIBLE);
            unityLogo.startAnimation(zoomInAnimation);
        }, delay);
        zoomInAnimation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {}

            @Override
            public void onAnimationEnd(Animation animation) {
                Intent intent=new Intent(UnitySplashScreen.this,UnityGameActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_TASK_ON_HOME);
                startActivity(intent);
                finish();
            }

            @Override
            public void onAnimationRepeat(Animation animation) {}
        });
    }
}