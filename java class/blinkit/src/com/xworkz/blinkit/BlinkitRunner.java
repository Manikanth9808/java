package com.xworkz.blinkit;

import com.xworkz.blinkit.dao.BlinkitDao;
import com.xworkz.blinkit.dto.BlinkitDto;

public class BlinkitRunner {
    public static void main(String[] args) {
        BlinkitDto dto=new BlinkitDto();
        dto.name="mani";
        dto.lastName="pattar";
        dto.id=3534;
        dto.orderDate="21/07/2024";


        BlinkitDao dao=new BlinkitDao();
        dao.allDetailsAdd(dto);
        dao.getDetails();
    }
}
