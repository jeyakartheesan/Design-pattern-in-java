package com.jk;

public class CompositeDesignMain {
    public static void main(String[] args) {
        Component schoolStudent = new LeafNode("School Student",2500);
        Component schoolStaff = new LeafNode("School Staff",5000);
        Component collegeStudent = new LeafNode("College Student",10000);
        Component collegeStaff = new LeafNode("College Staff",30000);

        CompositeNode school=new CompositeNode("School");
        school.addComponent(schoolStaff);
        school.addComponent(schoolStudent);

        CompositeNode college = new CompositeNode("College");
        college.addComponent(collegeStaff);
        college.addComponent(collegeStudent);

        CompositeNode education = new CompositeNode("Education");
        education.addComponent(school);
        education.addComponent(college);
        education.showPrice();
    }
}
