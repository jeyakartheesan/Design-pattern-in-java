package com.jk;

public class Phone{
    private String phoneName;
    private String phoneModel;
    private String phoneVerision;
    private String phoneOsName;
    private String phoneCompanyName;

    public Phone(String phoneName, String phoneModel, String phoneVerision, String phoneOsName, String phoneCompanyName) {
        this.phoneName = phoneName;
        this.phoneModel = phoneModel;
        this.phoneVerision = phoneVerision;
        this.phoneOsName = phoneOsName;
        this.phoneCompanyName = phoneCompanyName;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "phoneName='" + phoneName + '\'' +
                ", phoneModel='" + phoneModel + '\'' +
                ", phoneVerision='" + phoneVerision + '\'' +
                ", phoneOsName='" + phoneOsName + '\'' +
                ", phoneCompanyName='" + phoneCompanyName + '\'' +
                '}';
    }

}
