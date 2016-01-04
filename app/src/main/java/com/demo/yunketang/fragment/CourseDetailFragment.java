package com.demo.yunketang.fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.demo.yunketang.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class CourseDetailFragment extends BaseFragment {
    //    private volatile static CourseDetailFragment instance;
//    private CourseDetailFragment (){}
    private int position;
    private Bundle bundle;
    private static final String TAG = "CourseDetailFragment";

    public static CourseDetailFragment newInstance(int position){
        CourseDetailFragment courseDetailFragment = new CourseDetailFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("day",position);
        courseDetailFragment.setArguments(bundle);
        return courseDetailFragment;
    }
//    public static CourseDetailFragment getInstance() {
//        if (instance == null) {
//            synchronized (CourseDetailFragment.class) {
//                if (instance == null) {
//                    instance = new CourseDetailFragment();
//                }
//            }
//        }
//        return instance;
//    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_course_detail, null);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        bundle = getArguments();
        position = bundle.getInt("day");
        Log.i(TAG, position + "");

    }
}
