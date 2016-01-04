package com.demo.yunketang.entity;

/**
 * Created by lianyuchen on 16/1/3.
 */
public class StudentInfo {
    private int student_id;
    private String student_name;
    private String student_pwd;
    private String student_photo;

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    public String getStudent_pwd() {
        return student_pwd;
    }

    public void setStudent_pwd(String student_pwd) {
        this.student_pwd = student_pwd;
    }

    public String getStudent_photo() {
        return student_photo;
    }

    public void setStudent_photo(String student_photo) {
        this.student_photo = student_photo;
    }

    @Override
    public String toString() {
        return "StudentInfo{" +
                "student_id=" + student_id +
                ", student_name='" + student_name + '\'' +
                ", student_pwd='" + student_pwd + '\'' +
                ", student_photo='" + student_photo + '\'' +
                '}';
    }
}
