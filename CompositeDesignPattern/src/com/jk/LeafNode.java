package com.jk;

public class LeafNode implements Component{
    private String name;
    private int price;

    public LeafNode(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public void showPrice() {
        System.out.println(name + " : " + price);
    }
}
