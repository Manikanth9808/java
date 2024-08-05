package com.xworkz.facebook.dao;
import com.xworkz.facebook.dto.FacebookDto;
public class FacebookDao {
    FacebookDto ref;


    public boolean seeDetails(FacebookDto ref){
        boolean isSeeDetailsValid=false;
        boolean isNameValid=false;
        boolean isLastNameValid=false;
        boolean isDateOfBirthValid=false;
        boolean isFollowersValid=false;
        boolean isLikesOfAllPost=false;

        if(ref !=null){
            if(ref.name !=null)
                isNameValid=true;
            else System.out.println("the name invalid");
            if(ref.lastName !=null)
                isLastNameValid=true;
            else System.out.println("the last name is invalid");
            if(ref.dateOfBirth!=null)
                isDateOfBirthValid=true;
            else System.out.println("the date of birth is invalid");
            if(ref.followers>0)
                isFollowersValid=true;
        else    System.out.println("the followers invalid ");
           if(ref.likesOfAllPost >0)
               isLikesOfAllPost=true;
           else System.out.println("the likes of invalid");

        }
        else System.out.println("the given data is invalid");
        if(isSeeDetailsValid==false){
            isSeeDetailsValid=true;
            this.ref=ref;
        }
        else System.out.println("provide valid details");
        return isSeeDetailsValid;

    }
    public void getDetails(){
        System.out.println("the name is "+ref.name);
        System.out.println("the last name is "+ref.lastName);
        System.out.println("the date of birth is "+ref.dateOfBirth);
        System.out.println("the follower is  "+ref.followers);
        System.out.println("the linke of all post is "+ref.likesOfAllPost);
    }
}
