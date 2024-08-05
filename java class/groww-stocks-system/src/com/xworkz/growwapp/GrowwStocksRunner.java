package com.xworkz.growwapp;
import com.xworkz.growwapp.dao.GrowwDao;
import com.xworkz.growwapp.dto.GrowwDto;

public class GrowwStocksRunner {
    public static void main(String[] args) {


        GrowwDto ref = new GrowwDto();
        ref.setStockName("tata");
        ref.setStockPrice(1);
        ref.setSlots(3);
        ref.setStockRefId(2);

        GrowwDao ref1 = new GrowwDao();
      ref1.addStocks(ref);
          ref1.getDetails();

    }
}
