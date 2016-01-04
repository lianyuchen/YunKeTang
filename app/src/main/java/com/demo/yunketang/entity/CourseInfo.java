package com.demo.yunketang.entity;

/**
 * Created by lianyuchen on 16/1/3.
 */
public class CourseInfo {
    private int course_id;
    private String course_name;
    private String course_time;

    public int getCourse_id() {
        return course_id;
    }

    public void setCourse_id(int course_id) {
        this.course_id = course_id;
    }

    public String getCourse_name() {
        return course_name;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }

    public String getCourse_time() {
        return course_time;
    }

    public void setCourse_time(String course_time) {
        this.course_time = course_time;
    }

    @Override
    public String toString() {
        return "CourseInfo{" +
                "course_id=" + course_id +
                ", course_name='" + course_name + '\'' +
                ", course_time='" + course_time + '\'' +
                '}';
    }
}
