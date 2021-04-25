package com.jk;

public class CollegeAssignment {
    private Pen p;

    public Pen getP() {
        return p;
    }

    public void setP(Pen p) {
        this.p = p;
    }

    public void assignmentWritter(String str)
    {
        this.p.write(str);
    }
}
