package com.demo.yunketang.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.demo.yunketang.R;
import com.demo.yunketang.adapter.AbstractViewPagerAdapter;
import com.demo.yunketang.adapter.ShowCourseInfoAdapter;
import com.demo.yunketang.model.CourseInfoListViewItem;
import com.viewpagerindicator.TabPageIndicator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lianyuchen on 15/12/30.
 */
public class CourseFragment extends BaseFragment {
    private View mViews = null;
    private static final String TAG = "CourseFragment";
    MyPagerAdapter adapter;
    private Context mContext;

    private static final String[] CONTENT = new String[]{"周一", "周二", "周三", "周四", "周五", "周六", "周日"};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        if (mViews == null) {
            mViews = inflater.inflate(R.layout.fragment_course, null);
            initView();
        }
        ViewGroup parent = (ViewGroup) mViews.getParent();
        if (parent != null) {
            parent.removeView(mViews);
        }
        return mViews;
    }


    private void initView() {
        mContext = getActivity();
        ViewPager pager = (ViewPager) mViews.findViewById(R.id.pager);
        List<ListView> listViews = new ArrayList<>();
        View view = LayoutInflater.from(getActivity()).inflate(R.layout.layout_listview, null);
        ListView lv1 = (ListView) view.findViewById(R.id.list_view);
        ListView lv2 = (ListView) view.findViewById(R.id.list_view);
        ListView lv3 = (ListView) view.findViewById(R.id.list_view);
        ListView lv4 = (ListView) view.findViewById(R.id.list_view);
        ListView lv5 = (ListView) view.findViewById(R.id.list_view);
        ListView lv6 = (ListView) view.findViewById(R.id.list_view);
        ListView lv7 = (ListView) view.findViewById(R.id.list_view);
        listViews.add(lv1);
        listViews.add(lv2);
        listViews.add(lv3);
        listViews.add(lv4);
        listViews.add(lv5);
        listViews.add(lv6);
        listViews.add(lv7);

        adapter = new MyPagerAdapter(listViews, CONTENT, mContext);
        pager.setAdapter(adapter);

        TabPageIndicator indicator = (TabPageIndicator) mViews.findViewById(R.id.indicator);
        indicator.setViewPager(pager);
    }


    class MyPagerAdapter extends AbstractViewPagerAdapter {

        private Context mContext;

        public MyPagerAdapter(List<ListView> data, String[] titles, Context context) {
            super(data, titles);
            mContext = context;
        }

        @Override
        public View newView(int position) {
            View view = View.inflate(mContext, R.layout.layout_listview, null);
            ListView listView = (ListView) view.findViewById(R.id.list_view);
            List<CourseInfoListViewItem> data = new ArrayList<>();
            for (int i = 1; i <= 20; i++) {
                CourseInfoListViewItem item = new CourseInfoListViewItem();
                item.setCourseTime("周" + (position+1) + "," + "第" + i + "节课");
                item.setCourseName("周" + (position+1) + "," + "这是第" + i + "节课课名");
                item.setCourseLoc("周" + (position+1) + "," + "第" + i + "节课地点");
                data.add(item);
            }
            listView.setAdapter(new ShowCourseInfoAdapter(mContext, data));
            return view;
        }

    }
}
