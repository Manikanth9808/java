package com.xworkz.bakery.dao;

import com.xworkz.bakery.dto.BakeryDto;

public class BakeryDao {
    BakeryDto ref;

    public boolean AddDetails(BakeryDto ref){
        boolean isBakeryItemsValid=false;
        boolean isItem1Valid=false;
        boolean isItem2Valid=false;
        boolean isItem3Valid=false;
        boolean isItem4Valid=false;
        boolean isItem5Valid=false;

        if(ref !=null){
            if(ref.getItem1()!=null)
                isItem1Valid=true;
            else System.out.println("item1 name not valid");
            if(ref.getItem2()!=null)
                isItem2Valid=true;
              else   System.out.println("the item2 not valid");
            if(ref.getItem3()!=null)
                isItem3Valid=true;
             else    System.out.println("the item3 is not valid");

                if(ref.getItem4()!=null)
                    isItem4Valid=true;
                else System.out.println("the item 4 is not valid");
            if(ref.getItem5()!=null)
                isItem5Valid=true;
            else System.out.println("the item 5 is not valid");

        }
        if(isBakeryItemsValid==false){
            this.ref=ref;
            isBakeryItemsValid=true;

        }
        else System.out.println("provide valid details");
        return isBakeryItemsValid;
    }
    public void getDetails(){
        System.out.println("the item 1 name is "+ref.getItem1());
        System.out.println("the item 2 name is "+ref.getItem2());
        System.out.println("the item 3 name is "+ref.getItem3());
        System.out.println("the item 4 name is "+ref.getItem4());
        System.out.println("the item 5 name is "+ref.getItem5());
    }
}
