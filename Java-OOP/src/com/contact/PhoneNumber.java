package com.contact;

public class PhoneNumber {

    private int countryCode;
    private String phoneNumber;

    PhoneNumber(String phoneNumber){
        if (phoneNumber.length() >10){
            this.countryCode = Integer.parseInt(phoneNumber.substring(0, phoneNumber.length()-10));
            this.phoneNumber = phoneNumber.substring(phoneNumber.length()-10);
        }else{
            this.countryCode =1;
            this.phoneNumber=phoneNumber;
        }

    }

    PhoneNumber(int countryCode, String phoneNumber){

    }

    @Override
    public String toString() {
        return "PhoneNumber{" +
                "countryCode=" + countryCode +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
