package com.xworkz.growwapp.dto;

public class GrowwDto {

  private int stockRefId;
    private String stockName;
   private int stockPrice;
    private int slots;

    public int getStockRefid(){
       return stockRefId;

    }
    public void setStockRefId(int stockRefId){
        this.stockRefId=stockRefId;
    }

    public void setStockPrice(int stockPrice){
        this.stockPrice=stockPrice;
    }


public String getStockName(){
    return stockName;
}
    public void setStockName(String stockName){
        this.stockName=stockName;
    }
public int getStockPrice(){
    return stockPrice;

}
public int getSlots(){
    return slots;
}
    public void setSlots(int slots){
        this.slots=slots;

    }




}