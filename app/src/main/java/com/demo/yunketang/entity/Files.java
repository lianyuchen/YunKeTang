package com.demo.yunketang.entity;

/**
 * Created by lianyuchen on 16/1/3.
 */
public class Files {
    private int file_id;
    private CourseInfo courseInfo;
    private String file_path;
    private String file_name;
    private String file_describe;
    private boolean isDownload;

    @Override
    public String toString() {
        return "Files{" +
                "file_id=" + file_id +
                ", courseInfo=" + courseInfo +
                ", file_path='" + file_path + '\'' +
                ", file_name='" + file_name + '\'' +
                ", file_describe='" + file_describe + '\'' +
                ", isDownload=" + isDownload +
                '}';
    }

    public CourseInfo getCourseInfo() {
        return courseInfo;
    }

    public void setCourseInfo(CourseInfo courseInfo) {
        this.courseInfo = courseInfo;
    }

    public String getFile_path() {
        return file_path;
    }

    public void setFile_path(String file_path) {
        this.file_path = file_path;
    }

    public String getFile_name() {
        return file_name;
    }

    public void setFile_name(String file_name) {
        this.file_name = file_name;
    }

    public String getFile_describe() {
        return file_describe;
    }

    public void setFile_describe(String file_describe) {
        this.file_describe = file_describe;
    }

    public boolean isDownload() {
        return isDownload;
    }

    public void setDownload(boolean download) {
        isDownload = download;
    }

    public int getFile_id() {

        return file_id;
    }

    public void setFile_id(int file_id) {
        this.file_id = file_id;
    }
}
