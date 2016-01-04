package com.demo.yunketang.activity;

import android.os.Bundle;
import android.support.v4.app.FragmentPagerAdapter;
import android.widget.FrameLayout;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.demo.yunketang.R;
import com.demo.yunketang.adapter.CustomFragmentPagerAdapter;

public class MainActivity extends BaseActivity implements RadioGroup.OnCheckedChangeListener {

    private TextView mTitle;
    private FrameLayout mFrameLayout;
    private RadioGroup mRadioGroup;
    private FragmentPagerAdapter mFragmentPagerAdapter;
    private int currentRadioButtonId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initAdapter();

    }


    private void initAdapter() {
        mFragmentPagerAdapter = new CustomFragmentPagerAdapter(getSupportFragmentManager());
        mRadioGroup.setOnCheckedChangeListener(this);

        currentRadioButtonId = R.id.rb_menu_course;
    }

    private void initView() {

        mTitle = (TextView) findViewById(R.id.tv_title);
        mTitle.setText("云课堂");

        mFrameLayout = (FrameLayout) findViewById(R.id.fl_content);
        mRadioGroup = (RadioGroup) findViewById(R.id.rg_menu);

    }

    @Override
    protected void onStart() {
        super.onStart();
        //当回到程序界面时，显示之前保存的页面
        mRadioGroup.check(currentRadioButtonId);
    }

    @Override
    protected void onPause() {
        super.onPause();
        //当程序处于pause时记录下当前选中了哪个页面
        currentRadioButtonId = mRadioGroup.getCheckedRadioButtonId();
    }

    /**
     * RadioButton的选中切换监听事件
     *
     * @param radioGroup
     * @param checkId    选中的button的id
     */

    @Override
    public void onCheckedChanged(RadioGroup radioGroup, int checkId) {
        int fragmentIndex = 0;
        switch (checkId) {
            case R.id.rb_menu_school:
                fragmentIndex = 0;
                break;
            case R.id.rb_menu_course:
                fragmentIndex = 1;
                break;
            case R.id.rb_menu_user:
                fragmentIndex = 2;
                break;

        }
        Object object = mFragmentPagerAdapter.instantiateItem(mFrameLayout, fragmentIndex);
        mFragmentPagerAdapter.setPrimaryItem(mFrameLayout, 0, object);
        mFragmentPagerAdapter.finishUpdate(mFrameLayout);


    }
}
