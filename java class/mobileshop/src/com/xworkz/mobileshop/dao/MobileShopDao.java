package com.xworkz.mobileshop.dao;

import com.xworkz.mobileshop.dto.MobileShopDto;

public class MobileShopDao {
    MobileShopDto ref;

    public boolean addMobileShopDetails(MobileShopDto ref){
        boolean isMobileShopNameValid=false;
        boolean isName1Valid=false;
        boolean isName2Valid=false;
        boolean isName3Valid=false;
        boolean isName4Valid=false;


        if(ref!=null){
            if(ref.getMobileName1()!=null)
                isName1Valid=true;
            else System.out.println("the name 1 is invalid");
            if(ref.getMobileName2()!=null)
                isName2Valid=true;
            else System.out.println("the name 2 is invalid");
            if(ref.getMobileName3()!=null)
                isName3Valid=true;
            else System.out.println("the name 3 is invalid");
            if(ref.getMobileName4()!=null)
                isName4Valid=true;
            else System.out.println("the name 4 is not valid");
        }
        else System.out.println("the all value invalid");
          if(isMobileShopNameValid==false) {
              this.ref = ref;
              isMobileShopNameValid = true;
          }
          return isMobileShopNameValid;
          }
          public void getDetails(){
              System.out.println("the name 1 is :"+ref.getMobileName1());
              System.out.println("the name 2 is :"+ref.getMobileName2());
              System.out.println("the name 3 is :"+ref.getMobileName3());
              System.out.println("the name 4 is :"+ref.getMobileName4());
        }


}
