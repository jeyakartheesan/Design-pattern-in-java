package com.jk;

public class CollegeAdapter implements Adaptermethods{
    @Override
    public College collegeFactory(String str) {
        System.out.println("College Calling.....");
        if(str.equals("College Student"))
        {
            return new CollegeStudent();
        }
        else if(str.equals("College Staff"))
        {
            return new CollegeStaff();
        }
        else
        {
            return null;
        }
    }

    @Override
    public School schoolFactory(String str) {
        return null;
    }
}
