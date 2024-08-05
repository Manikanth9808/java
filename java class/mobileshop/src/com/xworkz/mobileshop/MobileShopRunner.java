package com.xworkz.mobileshop;

import com.xworkz.mobileshop.dao.MobileShopDao;
import com.xworkz.mobileshop.dto.MobileShopDto;
import java.util.Scanner;
public class MobileShopRunner {
    public static void main(String[] args) {

        MobileShopDto dto = new MobileShopDto();
        Scanner ref=new Scanner(System.in);
        System.out.println("the mobile name 1 is:");
        dto.setMobileName1(ref.next());
        System.out.println("the mobile name 2  is: ");
        dto.setMobileName2(ref.next());
        System.out.println("the mobile name 3 is :");

        dto.setMobileName3(ref.next());
        System.out.println("the mobile name 4 is:");
        dto.setMobileName4(ref.next());

        MobileShopDao ref1= new MobileShopDao();
        ref1.addMobileShopDetails(dto);
        ref1.getDetails();
    }
}
