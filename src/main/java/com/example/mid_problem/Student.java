package com.example.mid_problem;

public class Student {
    private int studentId;
    private boolean hasScholarship;
    private int scholarshipRate;

    public Student() {
    }

    public Student(boolean hasScholarship, int scholarshipRate, int studentId) {
        this.hasScholarship = hasScholarship;
        this.scholarshipRate = scholarshipRate;
        this.studentId = studentId;
    }

    public boolean isHasScholarship() {
        return hasScholarship;
    }

    public void setHasScholarship(boolean hasScholarship) {
        this.hasScholarship = hasScholarship;
    }

    public int getScholarshipRate() {
        return scholarshipRate;
    }

    public void setScholarshipRate(int scholarshipRate) {
        this.scholarshipRate = scholarshipRate;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "hasScholarship=" + hasScholarship +
                ", studentId=" + studentId +
                ", scholarshipRate=" + scholarshipRate +
                '}';
    }
}


