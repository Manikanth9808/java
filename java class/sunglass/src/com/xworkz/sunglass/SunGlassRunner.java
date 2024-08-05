package com.xworkz.sunglass;
import com.xworkz.sunglass.dto.SunGlassDto;
public class SunGlassRunner {
    public static void main(String[] args) {

        SunGlassDto ref=new SunGlassDto();
        ref.name="rybon";
        ref.color="black";
        ref.id=423;
        ref.type="plastic";
        ref.price=10;

        System.out.println("the sun galss name is "+ref.name);
        System.out.println("the color is "+ref.color);
        System.out.println("the id is "+ref.id);
        System.out.println("the type is "+ref.type);
        System.out.println("the price is "+ref.price);
    }
}
