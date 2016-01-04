package com.demo.yunketang.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.demo.yunketang.R;
import com.viewpagerindicator.TabPageIndicator;

/**
 * Created by lianyuchen on 15/12/30.
 */
public class CourseFragment extends BaseFragment {
    private View mViews = null;
    private static final String TAG ="CourseFragment";
    //    private GridView mGridView;
//    private List<Map<String, Object>> mData;
//    private int[] images = new int[]{
//            R.mipmap.ic_launcher, R.mipmap.ic_launcher, R.mipmap.ic_launcher,
//            R.mipmap.ic_launcher, R.mipmap.ic_launcher, R.mipmap.ic_launcher,
//            R.mipmap.ic_launcher, R.mipmap.ic_launcher, R.mipmap.ic_launcher,
//            R.mipmap.ic_launcher, R.mipmap.ic_launcher, R.mipmap.ic_launcher,
//            R.mipmap.ic_launcher, R.mipmap.ic_launcher, R.mipmap.ic_launcher};
    private static final String[] CONTENT = new String[]{"周一", "周二", "周三", "周四", "周五", "周六", "周日"};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        if (mViews == null) {
            mViews = inflater.inflate(R.layout.fragment_course, null);
            initView();
//            initData();
//            initListener();
        }
        ViewGroup parent = (ViewGroup) mViews.getParent();
        if (parent != null) {
            parent.removeView(mViews);
        }
        return mViews;
    }

    /*private void initListener() {
        SimpleAdapter simpleAdapter = new SimpleAdapter(getActivity(), mData, R.layout.gv_item, new String[]{"image"}, new int[]{R.id.image});
        mGridView.setAdapter(simpleAdapter);
        mGridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getActivity(),"位置" + i, Toast.LENGTH_SHORT).show();
            }
        });
    }*/

    /*private void initData() {
        mData = new ArrayList<Map<String, Object>>();
        for (int i = 0; i < images.length; i++) {
            Map<String, Object> item = new HashMap<String, Object>();
            item.put("image", images[i]);
            mData.add(item);
        }
    }*/

    private void initView() {
//        mGridView = (GridView) mViews.findViewById(R.id.gv_course);
        FragmentPagerAdapter adapter = new GoogleMusicAdapter(getActivity().getSupportFragmentManager());

        ViewPager pager = (ViewPager) mViews.findViewById(R.id.pager);
        pager.setAdapter(adapter);

        TabPageIndicator indicator = (TabPageIndicator) mViews.findViewById(R.id.indicator);
        indicator.setViewPager(pager);
    }

    class GoogleMusicAdapter extends FragmentPagerAdapter {
        public GoogleMusicAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
//            Toast.makeText(getActivity(),position, Toast.LENGTH_SHORT).show();
            Log.i(TAG,position % CONTENT.length + "");

            return CourseDetailFragment.newInstance(position % CONTENT.length);
        }

        @Override
        public CharSequence getPageTitle(int position) {
            Log.i(TAG,"Title" + position + "");
            return CONTENT[position % CONTENT.length].toUpperCase();
        }

        @Override
        public int getCount() {
            return CONTENT.length;
        }
    }
}
