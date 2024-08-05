package com.xworkz.swigy;

import com.xworkz.swigy.DAO.SwigyDao;
import com.xworkz.swigy.DTO.SwigyDto;

public class SwigyRunner {
    public static void main(String[] args) {
        SwigyDto ref= new SwigyDto();
        ref.name="mani";
        ref.location="kalaburagi";
        ref.contactNum=9113036673l;
        ref.additionNum=6361273857l;

        ref.price=400;
        ref.isOrderConfirm=true;

        SwigyDao ref1=new SwigyDao();
        ref1.addDetails(ref);
        ref1.getDetails();

    }
}
