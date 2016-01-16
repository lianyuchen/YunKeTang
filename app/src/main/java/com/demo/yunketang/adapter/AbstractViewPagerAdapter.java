package com.demo.yunketang.adapter;

import android.support.v4.view.PagerAdapter;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by lianyuchen on 16/1/9.
 */
public abstract class AbstractViewPagerAdapter<T> extends PagerAdapter {
    protected List<T> mData;
    private SparseArray<View> mViews;
    private String[] mTitles;
    public AbstractViewPagerAdapter(List<T> data,String[] titles) {
        this.mData = data;
        this.mTitles = titles;
        mViews = new SparseArray<View>(data.size());
    }
    public abstract View newView(int position);
    public T getItem(int position) {
        return mData.get(position);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mTitles[position];
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        View view = mViews.get(position);
        if (view == null) {
            view = newView(position);
            mViews.put(position, view);
        }
        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView(mViews.get(position));
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public int getCount() {
        return mData.size();
    }
}
