package com.demo.yunketang.model;

/**
 * Created by lianyuchen on 16/1/4.
 */
public class CourseInfoListViewItem {
    private String courseName;
    private String courseLoc;
    private String courseTime;

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseLoc() {
        return courseLoc;
    }

    public void setCourseLoc(String courseLoc) {
        this.courseLoc = courseLoc;
    }

    public String getCourseTime() {
        return courseTime;
    }

    public void setCourseTime(String courseTime) {
        this.courseTime = courseTime;
    }

    @Override
    public String toString() {
        return "CourseInfoListViewItem{" +
                "courseName='" + courseName + '\'' +
                ", courseLoc='" + courseLoc + '\'' +
                ", courseTime='" + courseTime + '\'' +
                '}';
    }
}
