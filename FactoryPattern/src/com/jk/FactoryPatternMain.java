package com.jk;

public class FactoryPatternMain {
    public static void main(String[] args) {
        FactoryDesignPattern factoryDesignPattern=new FactoryDesignPattern();
        factoryDesignPattern.getOSClass("Android").display();
        factoryDesignPattern.getOSClass("IOS").display();
        factoryDesignPattern.getOSClass("Windows").display();
        try
        {
            factoryDesignPattern.getOSClass("Linux").display();
        }
        catch (NullPointerException e)
        {
            System.err.println(e.getMessage());
        }

    }
}
