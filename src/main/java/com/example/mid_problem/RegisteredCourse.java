package com.example.mid_problem;

public class RegisteredCourse {
    private String courseID;
    private int courseCredit;
    private int section;

    public RegisteredCourse() {
    }

    public RegisteredCourse(int courseCredit, String courseID, int section) {
        this.courseCredit = courseCredit;
        this.courseID = courseID;
        this.section = section;
    }

    public String getCourseID() {
        return courseID;
    }

    public void setCourseID(String courseID) {
        this.courseID = courseID;
    }

    public int getSection() {
        return section;
    }

    public void setSection(int section) {
        this.section = section;
    }

    public int getCourseCredit() {
        return courseCredit;
    }

    public void setCourseCredit(int courseCredit) {
        this.courseCredit = courseCredit;
    }

    @Override
    public String toString() {
        return "RegisteredCourse{" +
                "courseCredit=" + courseCredit +
                ", courseID='" + courseID + '\'' +
                ", section=" + section +
                '}';
    }
}
