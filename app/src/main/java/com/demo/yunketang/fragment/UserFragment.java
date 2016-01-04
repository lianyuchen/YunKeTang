package com.demo.yunketang.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.demo.yunketang.R;

/**
 * Created by lianyuchen on 15/12/30.
 */
public class UserFragment extends BaseFragment {
    private View mViews = null;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        if (mViews == null){
            mViews = inflater.inflate(R.layout.fragment_user,null);
        }
        ViewGroup parent = (ViewGroup) mViews.getParent();
        if (parent != null) {
            parent.removeView(mViews);
        }
        return mViews;
    }
}
