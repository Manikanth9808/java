package com.xworkz.growwapp.dao;

import com.xworkz.growwapp.dto.GrowwDto;

public class GrowwDao {
    GrowwDto dto;

    public boolean addStocks(GrowwDto dto) {
        boolean isGrowwValid = false;
        boolean isStockValid = false;
        boolean isStockPrice = false;
        boolean isStockRfid = false;
        boolean isSlotsValid = false;

        if (null != dto) {

            if (dto.getStockName() != null) {
                isStockValid = true;

            } else System.out.println(" stock name invalid");
            if (dto.getStockPrice()> 0) {
                isStockPrice = true;
            } else System.out.println(" stock price invalid");
            if (dto.getStockRefid() > 0) {
                isStockRfid = true;
            } else System.out.println("stock id invalid");

            if (dto.getSlots() > 0) {
                isSlotsValid = true;
            } else System.out.println("slot invalid");
        }
        else System.out.println("invalid");


//            if (isStockValid == true && isStockPrice == true && isStockRfid == true && isSlotsValid == true) {
             if(isGrowwValid==false){
                this.dto = dto;
                isGrowwValid = true;


        }
        return isGrowwValid;
    }
        public void getDetails(){
            System.out.println("the name is " + dto.getStockName());
            System.out.println("the stock price is " + dto.getStockPrice());
            System.out.println("the id  is " + dto.getStockRefid());
            System.out.println("the slot is " + dto.getSlots());

        }
    }

