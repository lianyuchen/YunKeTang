package com.demo.yunketang.activity;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.demo.yunketang.R;

public class BaseActivity extends FragmentActivity {

    private ImageButton mBack;
    private TextView mTitle;
    private TextView mRight;
    protected Resources resources;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        resources = this.getResources();
    }
    protected void initTitleBar() {
        mTitle = (TextView) findViewById(R.id.tv_title);
        mBack = (ImageButton) findViewById(R.id.ib_back);
        mRight = (TextView) findViewById(R.id.tv_right);
        if (null != mBack) {
            mBack.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    goBack();
                }
            });
        }
    }

    private void goBack() {
        finish();
    }
    protected void setTitleBarText(String title) {
        if (null != mTitle && null != title) {
            mTitle.setText(title);
        }
    }

    protected void setTitleBarText(int resId) {
        if (null != mTitle) {
            mTitle.setText(resId);
        }
    }

    protected void setTitleBarRightText(String text, View.OnClickListener listener) {
        if (null != mRight) {
            mRight.setVisibility(View.VISIBLE);
            mRight.setText(text);
            if (null != listener) {
                mRight.setOnClickListener(listener);
            }
        }
    }

    protected void setTitleBarRightText(int resId, View.OnClickListener listener) {
        if (null != mRight) {
            mRight.setVisibility(View.VISIBLE);
            mRight.setText(resId);
            if (null != listener) {
                mRight.setOnClickListener(listener);
            }
        }
    }
    protected void setTitleLeftClick(View.OnClickListener listener) {
        if (null != mBack) {
            mBack.setOnClickListener(listener);
        }
    }
}
