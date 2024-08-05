package com.xworkz.facebook;
import com.xworkz.facebook.dto.FacebookDto;
import com.xworkz.facebook.dao.FacebookDao;
public class FacebookRunner {

    public static void main(String[] args){

        FacebookDto ref=new FacebookDto();
        ref.name="manikanth";
        ref.lastName="pattar";
        ref.dateOfBirth="27/05/2002";
        ref.followers=3000;
        ref.likesOfAllPost=2300;

        FacebookDao ref2=new FacebookDao();
        ref2.seeDetails(ref);
        ref2.getDetails();
    }
}
