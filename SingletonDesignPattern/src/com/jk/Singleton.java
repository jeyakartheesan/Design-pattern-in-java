package com.jk;

public final class Singleton {
    private static volatile Singleton singleton=null;
    private Singleton()
    {
    }
    public static Singleton getInstance()
    {
        if(singleton==null)
        {
            synchronized (Singleton.class)
            {
                if(singleton==null)
                {
                    singleton= new Singleton();
                }
            }
        }
        return singleton;
    }
    public void Display()
    {
        System.out.println("Singleton is woring.....");

    }

}
