package com.demo.yunketang.entity;

/**
 * Created by lianyuchen on 16/1/3.
 */
public class EnrollmentInfo {
    private int enrollment_id;
    private CourseInfo courseInfo;
    private StudentInfo studentInfo;

    @Override
    public String toString() {
        return "EnrollmentInfo{" +
                "enrollment_id=" + enrollment_id +
                ", courseInfo=" + courseInfo +
                ", studentInfo=" + studentInfo +
                '}';
    }

    public int getEnrollment_id() {
        return enrollment_id;
    }

    public void setEnrollment_id(int enrollment_id) {
        this.enrollment_id = enrollment_id;
    }

    public CourseInfo getCourseInfo() {
        return courseInfo;
    }

    public void setCourseInfo(CourseInfo courseInfo) {
        this.courseInfo = courseInfo;
    }

    public StudentInfo getStudentInfo() {
        return studentInfo;
    }

    public void setStudentInfo(StudentInfo studentInfo) {
        this.studentInfo = studentInfo;
    }
}
