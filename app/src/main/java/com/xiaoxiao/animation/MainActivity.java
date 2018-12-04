package com.xiaoxiao.animation;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView txtXmlAnimation, txtJavacodeAnimation, txtCombinationAnimation;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findView();
        setClick();
    }

    /**
     * 初始化控件
     */
    private void findView() {
        txtXmlAnimation = findViewById(R.id.txt_xml_animation);
        txtJavacodeAnimation = findViewById(R.id.txt_javacode_animation);
        txtCombinationAnimation = findViewById(R.id.txt_combination_animation);
    }

    /**
     * 设置监听事件
     */
    private void setClick() {
        txtCombinationAnimation.setOnClickListener(this);
        txtJavacodeAnimation.setOnClickListener(this);
        txtXmlAnimation.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.txt_xml_animation:
                intent = new Intent();
                intent.setClass(MainActivity.this, XmlAnimationActivity.class);
                startActivity(intent);
                break;
            case R.id.txt_javacode_animation:
                intent = new Intent();
                intent.setClass(MainActivity.this, JavaCodeAnimationActivity.class);
                startActivity(intent);
                break;
            case R.id.txt_combination_animation:
                intent = new Intent();
                intent.setClass(MainActivity.this, CombinationActivity.class);
                startActivity(intent);
                break;
        }
    }


}
