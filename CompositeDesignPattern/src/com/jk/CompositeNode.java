package com.jk;

import java.util.ArrayList;
import java.util.List;

public class CompositeNode implements Component{
    String name;
    List<Component> components=new ArrayList<>();
    public void addComponent(Component component)
    {
        components.add(component);
    }

    public CompositeNode(String name) {
        this.name = name;
    }

    @Override
    public void showPrice() {
        System.out.println(name);
        for (Component component:components)
        {
            component.showPrice();
        }
    }
}
