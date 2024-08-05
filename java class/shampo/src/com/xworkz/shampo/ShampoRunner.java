package com.xworkz.shampo;
import com.xworkz.shampo.dto.ShampoDto;
public class ShampoRunner {
    public static void main(String[] args) {
        ShampoDto ref=new ShampoDto();
        ref.brandName="clinic plus";
        ref.id=244;
        ref.manifactureDate="23/03/2024";
        ref.expireDate="23/03/2025";
        ref.price=30;
        ref.quantity=15;

        System.out.println("the brand name is "+ref.brandName);
        System.out.println("the id is "+ref.id);
        System.out.println("the manifacture date is "+ref.manifactureDate);
        System.out.println("the expire date is "+ref.expireDate);
        System.out.println("the price is "+ref.price);
        System.out.println("the quantiy is "+ref.quantity);

    }
}
