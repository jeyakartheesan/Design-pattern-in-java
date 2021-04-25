package com.jk;

public class AbstractFactory {
    public Adaptermethods getFactory(String str)
    {
        if(str.equals("School"))
        {
            return new SchoolAdapter();
        }
        else if(str.equals("College"))
        {
            return new CollegeAdapter();
        }
        else
        {
            return null;
        }
    }
}
