package com.example.jesmin.myfavouritenewspaper;

import android.content.Intent;
import android.drm.DrmStore;
import android.os.Handler;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class SplashActivity extends AppCompatActivity {

    ImageView img1,img2;
    private static int splashTimeOut=4000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        img1=findViewById(R.id.img_1);
        img2=findViewById(R.id.img_2);

        Animation rotate= AnimationUtils.loadAnimation(SplashActivity.this,R.anim.rotate);
        img2.startAnimation(rotate);

        ActionBar actionBar=getSupportActionBar();
        actionBar.hide();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i=new Intent(SplashActivity.this,HomeActivity.class);
                startActivity(i);
                finish();
            }
        },splashTimeOut);
    }
}
