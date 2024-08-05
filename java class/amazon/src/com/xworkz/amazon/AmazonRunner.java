package com.xworkz.amazon;
import com.xworkz.amazon.dto.AmazonDto;
import com.xworkz.amazon.dao.AmazonDao;
public class AmazonRunner {
    public static void main(String[] args) {
        AmazonDto ref= new AmazonDto();
        ref.name="samsung";
        ref.price=34000;
        ref.Quantity=1;
        ref.DeliveryDate = "23/07/2024";
        ref.offer="20% of";

        AmazonDao ref2 =new AmazonDao();
        ref2.addDetails(ref);
        ref2.getDetails();

        AmazonDto ref3= new AmazonDto();
        ref3.name="max";
        ref3.price=34000;
        ref3.Quantity=1;
        ref3.DeliveryDate = "23/07/2024";
        ref3.offer="20% of";

        AmazonDao ref4 =new AmazonDao();
        ref4.addDetails(ref3);
        ref4.getDetails();


    }
}
