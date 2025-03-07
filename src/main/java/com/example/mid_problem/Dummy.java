package com.example.mid_problem;

public class Dummy {
    private int id;
    private String courseName;
    private int section;
    private int credit;

    public Dummy(int id, String courseID, int section, int courseCredit) {
    }

    public Dummy(String courseName, int credit, int id, int section) {
        this.courseName = courseName;
        this.credit = credit;
        this.id = id;
        this.section = section;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
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
                "courseName='" + courseName + '\'' +
                ", id=" + id +
                ", section=" + section +
                ", credit=" + credit +
                '}';
    }
}
