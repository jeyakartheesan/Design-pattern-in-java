package com.jk;

public class AdapterMain {
    public static void main(String[] args) {
        Pen p=new PenAdapter();
        CollegeAssignment collegeAssignment=new CollegeAssignment();
        collegeAssignment.setP(p);
        collegeAssignment.assignmentWritter("I am Jeya kartheesan");
    }
}
