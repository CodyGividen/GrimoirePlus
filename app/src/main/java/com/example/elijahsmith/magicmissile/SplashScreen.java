package com.example.elijahsmith.magicmissile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

import butterknife.BindView;

public class SplashScreen extends AppCompatActivity {
    private ImageView imageView;
    private TextView textView;
    private Animation myAnimation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        imageView = findViewById(R.id.grimoire_image);
        textView = findViewById(R.id.welcome_textview);

        new Timer().schedule(new TimerTask(){
            public void run() {
                startActivity(new Intent(SplashScreen.this, MainActivity.class));
            }
        }, 2000);
        Animation a = new AlphaAnimation(1.00f, 0.00f);

        a.setDuration(1500);
        a.setAnimationListener(new Animation.AnimationListener() {

            public void onAnimationStart(Animation animation) {
                // TODO Auto-generated method stub

            }

            public void onAnimationRepeat(Animation animation) {
                // TODO Auto-generated method stub

            }

            public void onAnimationEnd(Animation animation) {
                imageView.setVisibility(View.GONE);
                textView.setVisibility(View.GONE);

            }
        });

        imageView.startAnimation(a);
        textView.startAnimation(a);
    }


    }
