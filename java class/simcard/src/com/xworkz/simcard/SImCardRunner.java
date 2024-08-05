package com.xworkz.simcard;
import com.xworkz.simcard.dto.SimCardDto;
public class SImCardRunner {
    public static void main(String[] args) {
        SimCardDto dto=new SimCardDto();
        dto.name="jio";
        dto.id=2;
        dto.plan="239";
        dto.validity="28days";

        System.out.println("the name is "+dto.name);
        System.out.println("the id is "+dto.id);
        System.out.println("the plan is "+dto.plan);
        System.out.println("the validity is "+dto.validity);
    }
}
