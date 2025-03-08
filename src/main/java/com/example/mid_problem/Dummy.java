package com.example.mid_problem;

public class Dummy {
    private int id;
    private String courseID;
    private int section;
    private int courseCredit;

    public Dummy() {
    }

    public Dummy(int courseCredit, String courseID, int id, int section) {
        this.courseCredit = courseCredit;
        this.courseID = courseID;
        this.id = id;
        this.section = section;
    }

    public int getCourseCredit() {
        return courseCredit;
    }

    public void setCourseCredit(int courseCredit) {
        this.courseCredit = courseCredit;
    }

    public String getCourseID() {
        return courseID;
    }

    public void setCourseID(String courseID) {
        this.courseID = courseID;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSection() {
        return section;
    }

    public void setSection(int section) {
        this.section = section;
    }

    @Override
    public String toString() {
        return "Dummy{" +
                "courseCredit=" + courseCredit +
                ", id=" + id +
                ", courseID='" + courseID + '\'' +
                ", section=" + section +
                '}';
    }
}
