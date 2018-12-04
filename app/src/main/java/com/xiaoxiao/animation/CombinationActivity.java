package com.xiaoxiao.animation;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.ScaleAnimation;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * @author: 潇潇
 * @create on:  2018/11/28
 * @describe:DOTO
 */

public class CombinationActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView imageView;
    private TextView txtCombination1, txtCombination2;
    private AnimationSet animationSet;
    private Animation animation;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_combination_animation);
        findview();
        setClick();
    }

    //初始化
    private void findview() {
        imageView = findViewById(R.id.img);
        txtCombination1 = findViewById(R.id.txt_combination1);
        txtCombination2 = findViewById(R.id.txt_combination2);

    }

    //设置监听事件
    private void setClick() {
        txtCombination1.setOnClickListener(this);
        txtCombination2.setOnClickListener(this);

    }


    /**
     * Called when a view has been clicked.
     *
     * @param v The view that was clicked.
     */
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.txt_combination1:
                animationSet = new AnimationSet(false);
                Animation alphAnimation = new AlphaAnimation(1.0f, 0.0f);
                Animation scaleAnimation = new ScaleAnimation(0.0f, 1.4f, 0.0f, 1.4f, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
                scaleAnimation.setDuration(2000);
                alphAnimation.setDuration(2000);
                animationSet.addAnimation(alphAnimation);
                animationSet.addAnimation(scaleAnimation);
                imageView.startAnimation(animationSet);
                break;
            case R.id.txt_combination2:
                animation = AnimationUtils.loadAnimation(this, R.anim.combination);
                imageView.startAnimation(animation);
                break;
        }
    }
}
