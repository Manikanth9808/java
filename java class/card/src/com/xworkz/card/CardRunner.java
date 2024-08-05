package com.xworkz.card;

import com.xworkz.card.dto.CardDto;


public class CardRunner {
    public static void main(String[] args) {

        CardDto ref= new CardDto();
        ref.setCardId(1);
        ref.setCardHolderName("mani");
        ref.setCardNo(9824848278723456l);
        ref.setCvv(234);
        ref.setEmail("manikanthpattar0@gmail.com");

      int cardId=  ref.getCardId();
        System.out.println("the card id is "+cardId);
        String name= ref.getCardHolderName();
        System.out.println("the card holder name is "+name);

        long cardNo=ref.getCardNo();
        System.out.println("the card no is "+cardNo);
        int cvv=ref.getCvv();
        System.out.println("the card cvv is "+cvv);
//        System.out.println("the email id is "+ref.getEmail());// we can call this type also.
        String email=ref.getEmail();
        System.out.println("the email id is "+email);


    }

}

