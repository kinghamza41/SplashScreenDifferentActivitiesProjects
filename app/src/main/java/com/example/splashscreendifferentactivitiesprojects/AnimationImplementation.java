package com.example.splashscreendifferentactivitiesprojects;

import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class AnimationImplementation extends AppCompatActivity {
    Button btnfadein,btnfadeout,btnblink,btnzoomin,btnzoomout,btnrotate,btnmove,btnslideup,btnslidedown,btnbounce,btnsequential;
    TextView tvfadein,tvfadeout,tvblink,tvzoomin,tvzoomout,tvrotate,tvmove,tvslideup,tvslidedown,tvbounce,tvsequential;
    Animation animationFadein,animationFadeout,animationblink,animationzoomin,animationzoomout,animationroatate,animationmove,animationslideup,animationslidedown,animationbounce,animationsequential;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation_implementation);

        btnfadein=(Button)findViewById(R.id.btnfadein);
        tvfadein=(TextView)findViewById(R.id.tvfadein);

        btnfadeout=(Button)findViewById(R.id.btnfadeout);
        tvfadeout=(TextView)findViewById(R.id.tvfadeout);

        btnblink=(Button)findViewById(R.id.btnblink);
        tvblink=(TextView)findViewById(R.id.tvblink);

        btnzoomin=(Button)findViewById(R.id.btnzoomin);
        tvzoomin=(TextView)findViewById(R.id.tvzoomin);

        btnzoomout=(Button)findViewById(R.id.btnzoomout);
        tvzoomout=(TextView)findViewById(R.id.tvzoomout);

        btnrotate=(Button)findViewById(R.id.btnrotate);
        tvrotate=(TextView)findViewById(R.id.tvrotate);

        btnmove=(Button)findViewById(R.id.btnmove);
        tvmove=(TextView)findViewById(R.id.tvmove);

        btnslideup=(Button)findViewById(R.id.btnslideup);
        tvslideup=(TextView)findViewById(R.id.tvslideup);

        btnslidedown=(Button)findViewById(R.id.btnslidedown);
        tvslidedown=(TextView)findViewById(R.id.tvslidedown);

        btnbounce=(Button)findViewById(R.id.btnbounce);
        tvbounce=(TextView)findViewById(R.id.tvbounce);

        btnsequential=(Button)findViewById(R.id.btnsequential);
        tvsequential=(TextView)findViewById(R.id.tvsequential);

        animationFadein= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in);

        animationFadeout=AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_out);

        animationblink=AnimationUtils.loadAnimation(getApplicationContext(),R.anim.blinkeffect);

        animationzoomin=AnimationUtils.loadAnimation(getApplicationContext(),R.anim.zoom_in);

        animationzoomout=AnimationUtils.loadAnimation(getApplicationContext(),R.anim.zoom_out);

        animationroatate=AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotate_mode);

        animationmove=AnimationUtils.loadAnimation(getApplicationContext(),R.anim.move_animation);

        animationslideup=AnimationUtils.loadAnimation(getApplicationContext(),R.anim.slide_up);

        animationslidedown=AnimationUtils.loadAnimation(getApplicationContext(),R.anim.slide_down);

        animationbounce=AnimationUtils.loadAnimation(getApplicationContext(),R.anim.bounce);

        animationsequential=AnimationUtils.loadAnimation(getApplicationContext(),R.anim.sequential);

        btnfadein.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvfadein.setVisibility(View.VISIBLE);

                tvfadein.startAnimation(animationFadein);

            }
        });
        btnfadeout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvfadeout.setVisibility(View.VISIBLE);

                tvfadeout.startAnimation(animationFadeout);
            }
        });

        btnblink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ObjectAnimator animator=ObjectAnimator.ofInt(tvblink,"textColor", Color.RED,Color.GRAY,Color.BLUE);
                animator.setEvaluator(new ArgbEvaluator());
                animator.start();
                tvblink.setVisibility(View.VISIBLE);


            }
        });

        btnzoomin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               tvzoomin.setVisibility(View.VISIBLE);
               tvzoomin.startAnimation(animationzoomin);
            }
        });

        btnzoomout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvzoomout.setVisibility(View.VISIBLE);
                tvzoomout.startAnimation(animationzoomout);
            }
        });

        btnrotate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvrotate.setVisibility(View.VISIBLE);
                tvrotate.startAnimation(animationroatate);
            }
        });

        btnmove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvmove.setVisibility(View.VISIBLE);
                tvmove.startAnimation(animationmove);
            }
        });

        btnslideup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvslideup.setVisibility(View.VISIBLE);
                tvslideup.startAnimation(animationslideup);
            }
        });

        btnslidedown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvslidedown.setVisibility(View.VISIBLE);
                tvslidedown.startAnimation(animationslidedown);
            }
        });

        btnbounce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvbounce.setVisibility(View.VISIBLE);
                tvbounce.startAnimation(animationbounce);
            }
        });

        btnsequential.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvsequential.setVisibility(View.VISIBLE);
                tvsequential.startAnimation(animationsequential);
            }
        });
    }
}
