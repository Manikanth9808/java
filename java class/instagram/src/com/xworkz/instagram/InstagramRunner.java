package com.xworkz.instagram;
import com.xworkz.instagram.dto.InstagramDto;
public class InstagramRunner {
    public static void main(String[] args){
        InstagramDto ref= new InstagramDto();
        ref.name="mani";
        ref.lastName="pattar";
        ref.email="mani123@gmail.com";
        ref.enterPassword="mani1234";
        ref.confmPassword="mani1234";
        ref.phoneNo=6361273857l;


        System.out.println("the name is "+ref.name);
        System.out.println("the last name is  "+ref.lastName);
        System.out.println("the email id is "+ref.email);
        System.out.println("the enter password is "+ref.enterPassword);
        System.out.println("the phone number is "+ref.phoneNo);
    }
}
