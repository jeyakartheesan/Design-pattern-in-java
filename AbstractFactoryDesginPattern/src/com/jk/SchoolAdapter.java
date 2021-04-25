package com.jk;

public class SchoolAdapter implements Adaptermethods{
    @Override
    public College collegeFactory(String str) {
        return null;
    }

    @Override
    public School schoolFactory(String str) {
        System.out.println("Scholling.........");
        if(str.equals("School Staff"))
        {
            return new SchoolStaff();
        }
        else if(str.equals("School Student"))
        {
            return new SchoolStudent();
        }
        else {
            return null;
        }
    }
}
