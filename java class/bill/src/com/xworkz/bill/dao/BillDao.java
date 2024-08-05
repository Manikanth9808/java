package com.xworkz.bill.dao;
import com.xworkz.bill.dto.BillDto;

public class BillDao {
    BillDto ref;
public boolean billDetails(BillDto ref){
    boolean isBillValid=false;
    boolean isCostmareNameValid=false;
    boolean isProductId=false;
    boolean isOrderValid=false;
    boolean isDeliveryDate=false;
    boolean isPriece=false;

    if(ref!=null){
        if(ref.customerName!=null)
            isCostmareNameValid=true;
        else System.out.println("the costumer name is invalid");
        if(ref.productId>0)
            isProductId=true;
        else System.out.println("the product id is ");
        if(ref !)

    }
}

}
