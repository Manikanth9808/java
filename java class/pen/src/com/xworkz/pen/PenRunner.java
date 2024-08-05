package com.xworkz.pen;
import com.xworkz.pen.dto.PenDto;
public class PenRunner {
    public static void main(String[] args) {


        PenDto ref = new PenDto();
        ref.name="reynolds";
        ref.color="blue";
        ref.id=43;
        ref.price=20;
        System.out.println("the brand name is "+ref.name);
        System.out.println("the color is "+ref.color);
        System.out.println("the id is "+ref.id);
        System.out.println("the price is "+ref.price);
    }
}
