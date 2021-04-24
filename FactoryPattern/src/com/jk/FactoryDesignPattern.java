package com.jk;

public class FactoryDesignPattern {
    public OperatingSystem getOSClass(String str)
    {
        if(str.equals("Android"))
        {
            return new Android();
        }
        else if(str.equals("IOS"))
        {
            return new Ios();
        }
        else if(str.equals("Windows"))
        {
            return new Windows();
        }
        else
        {
            return null;
        }
    }
}
