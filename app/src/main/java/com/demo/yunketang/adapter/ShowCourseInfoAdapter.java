package com.demo.yunketang.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.demo.yunketang.R;
import com.demo.yunketang.model.CourseInfoListViewItem;

import java.util.List;

/**
 * Created by lianyuchen on 16/1/4.
 */
public class ShowCourseInfoAdapter extends BaseAdapter{
    private Context context;
    private List<CourseInfoListViewItem> data;
    private LayoutInflater inflater;

    public ShowCourseInfoAdapter(Context context, List<CourseInfoListViewItem> data) {
        this.context = context;
        this.data = data;
        this.inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        ViewHolder holder = null;
        if (null == view){
            view = inflater.inflate(R.layout.course_info_item,null);
            holder = new ViewHolder();
            holder.mTime = (TextView) view.findViewById(R.id.tv_time);
            holder.mCourse = (TextView) view.findViewById(R.id.tv_course_name);
            holder.mLoc = (TextView) view.findViewById(R.id.tv_course_loc);

            view.setTag(holder);

        }else {
            holder = (ViewHolder) view.getTag();
            CourseInfoListViewItem currentData = data.get(position);
            holder.mTime.setText(currentData.getCourseTime().toString());
            holder.mCourse.setText(currentData.getCourseName().toString());
            holder.mLoc.setText(currentData.getCourseLoc().toString());
        }
        return view;
    }

    class ViewHolder{
        TextView mTime;
        TextView mCourse;
        TextView mLoc;

    }

}
