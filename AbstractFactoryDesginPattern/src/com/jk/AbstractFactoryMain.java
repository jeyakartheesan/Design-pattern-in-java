package com.jk;

public class AbstractFactoryMain {
    public static void main(String[] args) {
        AbstractFactory abstractFactory=new AbstractFactory();
        Adaptermethods collegeAdapter=abstractFactory.getFactory("College");
        collegeAdapter.collegeFactory("College Student").display();
        collegeAdapter.collegeFactory("College Staff").display();

        Adaptermethods schoolAdapter=abstractFactory.getFactory("School");
        schoolAdapter.schoolFactory("School Student").display();
        schoolAdapter.schoolFactory("School Staff").display();
        try
        {
            collegeAdapter.schoolFactory("jk").display();
        }
        catch (NullPointerException e)
        {
            System.err.println(e.getMessage());
        }
        try
        {
            schoolAdapter.collegeFactory("jk").display();
        }
        catch (NullPointerException e)
        {
            System.err.println(e.getMessage());
        }

    }
}
