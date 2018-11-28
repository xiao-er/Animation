package com.xiaoxiao.animation;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * @author: 潇潇
 * @create on:  2018/11/28
 * @describe:DOTO
 */

public class XmlAnimationActivity extends AppCompatActivity implements View.OnClickListener, Animation.AnimationListener {

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
        if (alphaAnimation != null) {
            heartImg.setAnimation(null);
        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.txt_alpha:
                alphaAnimation = AnimationUtils.loadAnimation(this, R.anim.alpha);
                heartImg.startAnimation(alphaAnimation);
                alphaAnimation.setAnimationListener(this);
                break;
            case R.id.txt_scale:
                scaleAnimation = AnimationUtils.loadAnimation(this, R.anim.scale);
                heartImg.startAnimation(scaleAnimation);
                scaleAnimation.setAnimationListener(this);
                break;
            case R.id.txt_translate:
                translateAnimation = AnimationUtils.loadAnimation(this, R.anim.translate);
                heartImg.startAnimation(translateAnimation);
                translateAnimation.setAnimationListener(this);
                break;
            case R.id.txt_rotate:
                rotateAnimation = AnimationUtils.loadAnimation(this, R.anim.rotate);
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
}
