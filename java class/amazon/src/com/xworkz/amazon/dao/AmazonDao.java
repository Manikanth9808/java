package com.xworkz.amazon.dao;

import com.xworkz.amazon.dto.AmazonDto;

public class AmazonDao {
    AmazonDto ref;

    public boolean addDetails(AmazonDto ref){
        boolean isAddDetailsValid=false;
        boolean isNameValid=false;
        boolean isPriceValid=false;
        boolean isOfferValid=false;
        boolean isDeliveryDateValid=false;
        boolean isQuanityValid=false;

        if(ref !=null) {
            if (ref.name != null)
                isNameValid = true;
            else System.out.println("the name is not valid");

            if (ref.price > 0)
                isPriceValid = true;
            else System.err.println("the price is invalid");

            if (ref.DeliveryDate != null)
                isDeliveryDateValid = true;
            else System.out.println("the delivery date is invalid");
            if (ref.offer != null)
                isOfferValid = true;

            else System.out.println("the offer is invalid");

            if (ref.Quantity > 0)
                isQuanityValid = true;

            else System.out.println("the quantity is invalid");
        }
        if(isAddDetailsValid==false){
            this.ref=ref;
            isAddDetailsValid=true;
        }
        return isAddDetailsValid;

}

public void getDetails(){
    System.out.println("the name is "+ref.name);
    System.out.println("the price is "+ref.price);
    System.err.println("the product offer is "+ref.offer);
    System.out.println("the product delivery date is "+ref.DeliveryDate);
    System.out.println("the product quantity is "+ref.Quantity);

    }
}