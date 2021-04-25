package com.jk;

public class BuilderPatternMain {
    public static void main(String[] args) {
        Phone phone=new PhoneBuilder().setPhoneCompanyName("VIVO").setPhoneName("VIVO Z1X").setPhoneModel("Z1X 1897").setPhoneVerision("1.5.1").setPhoneOsName("Fund OS").get();
        System.out.println(phone);
        Phone phone1=new PhoneBuilder().setPhoneCompanyName("VIVO").setPhoneName("VIVO Z1X").setPhoneVerision("1.5.1").setPhoneOsName("Fund OS").get();
        System.out.println(phone1);

    }
}
