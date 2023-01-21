package com.gr8erkay;

public class Main {

    public static void main(String[] args) {
        ITelephone gr8erPhone;
        gr8erPhone = new DeskPhone(1234);
        gr8erPhone.powerOn();
        gr8erPhone.callPhone(1234);
        gr8erPhone.answer();

        System.out.println();


        gr8erPhone = new MobilePhone(5678);
        gr8erPhone.powerOn();
        gr8erPhone.callPhone(5678);
        gr8erPhone.answer();



    }

}
