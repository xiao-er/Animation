package com.xiaoxiao.animation;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * @author: 潇潇
 * @create on:  2018/11/28
 * @describe:DOTO
 */

public class JavaCodeAnimationActivity extends AppCompatActivity implements View.OnClickListener, Animation.AnimationListener {


    private Animation alphaAnimation, scaleAnimation, translateAnimation, rotateAnimation;
    private ImageView heartImg;
    private TextView txtAlpha, txtScale, txtTranslate, txtRotate;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xml_animation);
        findView();
        setClick();
    }


    //初始化控件
    private void findView() {
        txtAlpha = findViewById(R.id.txt_alpha);
        txtScale = findViewById(R.id.txt_scale);
        txtTranslate = findViewById(R.id.txt_translate);
        txtRotate = findViewById(R.id.txt_rotate);
        heartImg = findViewById(R.id.img);
    }

    //设置监听事件
    private void setClick() {
        txtAlpha.setOnClickListener(this);
        txtScale.setOnClickListener(this);
        txtTranslate.setOnClickListener(this);
        txtRotate.setOnClickListener(this);
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.txt_alpha:
                alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                alphaAnimation.setDuration(3000);
                heartImg.startAnimation(alphaAnimation);
                alphaAnimation.setAnimationListener(this);
                break;
            case R.id.txt_scale:
                scaleAnimation = new ScaleAnimation(0.0f, 1.4f, 0.0f, 1.4f, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
                scaleAnimation.setDuration(500);
                heartImg.startAnimation(scaleAnimation);
                scaleAnimation.setAnimationListener(this);
                break;
            case R.id.txt_translate:
                translateAnimation = new TranslateAnimation(30, -80, 30, 300);
                translateAnimation.setDuration(3000);
                heartImg.startAnimation(translateAnimation);
                translateAnimation.setAnimationListener(this);
                break;
            case R.id.txt_rotate:
                rotateAnimation = new RotateAnimation(0, +350.0f, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5F);
                rotateAnimation.setDuration(3000);
                heartImg.startAnimation(rotateAnimation);
                rotateAnimation.setAnimationListener(this);
                break;
        }
    }

    @Override
    public void onAnimationStart(Animation animation) {

    }

    @Override
    public void onAnimationEnd(Animation animation) {
//        if (animation == alphaAnimation) {
//            heartImg.startAnimation(alphaAnimation);
//        } else if (animation == scaleAnimation) {
//            heartImg.startAnimation(scaleAnimation);
//        } else if (animation == translateAnimation) {
//            heartImg.startAnimation(translateAnimation);
//        } else if (animation == rotateAnimation) {
//            heartImg.startAnimation(rotateAnimation);
//        }


    }

    @Override
    public void onAnimationRepeat(Animation animation) {

    }


    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}
