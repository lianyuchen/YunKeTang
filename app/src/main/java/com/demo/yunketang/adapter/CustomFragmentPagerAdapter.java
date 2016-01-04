package com.demo.yunketang.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.demo.yunketang.fragment.CourseFragment;
import com.demo.yunketang.fragment.InfoFragment;
import com.demo.yunketang.fragment.UserFragment;

/**
 * Created by lianyuchen on 15/10/6.
 */
public class CustomFragmentPagerAdapter extends FragmentPagerAdapter {
    public CustomFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        switch (position){
            case 0:
                fragment = new InfoFragment();
                break;
            case 1:
                fragment = new CourseFragment();
                break;
            case 2:
                fragment = new UserFragment();
                break;
        }
        return fragment;
    }

    @Override
    public int getCount() {
        return 3;
    }
}
