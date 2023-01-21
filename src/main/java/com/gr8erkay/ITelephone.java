package com.gr8erkay;

public interface ITelephone {

     void powerOn();
     void dial(int phoneNumber);
     void answer();
     boolean callPhone(int phoneNumber);
     boolean isRinging();
}
