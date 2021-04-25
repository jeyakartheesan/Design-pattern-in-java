package com.jk;

public class PhoneBuilder {
    private String phoneName;
    private String phoneModel;
    private String phoneVerision;
    private String phoneOsName;
    private String phoneCompanyName;

    public PhoneBuilder setPhoneName(String phoneName) {
        this.phoneName = phoneName;
        return this;
    }

    public PhoneBuilder setPhoneModel(String phoneModel) {
        this.phoneModel = phoneModel;
        return this;
    }

    public PhoneBuilder setPhoneVerision(String phoneVerision) {
        this.phoneVerision = phoneVerision;
        return this;
    }

    public PhoneBuilder setPhoneOsName(String phoneOsName) {
        this.phoneOsName = phoneOsName;
        return this;
    }

    public PhoneBuilder setPhoneCompanyName(String phoneCompanyName) {
        this.phoneCompanyName = phoneCompanyName;
        return this;
    }
    public Phone get()
    {
        return new Phone(this.phoneName,this.phoneModel,this.phoneVerision,this.phoneOsName,this.phoneCompanyName);
    }

}
