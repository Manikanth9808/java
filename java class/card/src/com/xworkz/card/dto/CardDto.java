//encapuslation means process of making group of data in one blok
package com.xworkz.card.dto;

public class CardDto {

    private int cardId; // we make acess specifier private because achieve encapsulation
    // if private keyword then assume this is encapsulation. and if we make private
    // then  we cant acess this property or variable directly outside the class
    // that the reason we made getter and setter
    private String cardHolderName;
    private long cardNo;
    private int cvv;
    private String email;
//these are getter and setter.
    public void setCardId(int cardId){
        this.cardId=cardId;

    }
    public int getCardId(){
        return this.cardId; //we can return parameter variable or instace variable both are same
    }
    public void setCardHolderName(String cardHolderName){
        this.cardHolderName=cardHolderName;
    }
    public String  getCardHolderName(){
        return cardHolderName;
    }
    public void setCardNo(long cardNo){
        this.cardNo=cardNo;

    }
    public long getCardNo(){
        return cardNo;
    }
    public void setCvv(int cvv){
        this.cvv=cvv;

    }
    public int getCvv(){
        return cvv;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public String getEmail(){
        return email;
    }

}
