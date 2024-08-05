package com.xworkz.bakery;

import com.xworkz.bakery.dao.BakeryDao;
import com.xworkz.bakery.dto.BakeryDto;
import java.util.Scanner;
public class bakeryRunner {
    public static void main(String[] args) {

        BakeryDto dto=new BakeryDto();
        Scanner ref= new Scanner(System.in);
        System.out.println("the item 1 name is :");
        dto.setItem1(ref.next());
        System.out.println("the item 2 name is:");
        dto.setItem2(ref.next());
        System.out.println("the item 3 name is :");
        dto.setItem3(ref.next());
        System.out.println("the item4 name is :");
        dto.setItem4(ref.next());
        System.out.println("the item 5 name is :");
        dto.setItem5(ref.next());

        BakeryDao ref1=new BakeryDao();
        ref1.AddDetails(dto);
        ref1.getDetails();


    }
}
