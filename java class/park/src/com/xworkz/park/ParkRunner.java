package com.xworkz.park;
import com.xworkz.park.dto.ParkDto;
public class ParkRunner {
    public static void main(String[] args){
        ParkDto dto= new ParkDto();
        dto.parkName="lalbhaga";
        dto.amount="300";
        dto.place="bengaluru";
        dto.timing="9am to 7 pm";
        dto.width= "2km";

        System.out.println("the park name is " +dto.parkName);
        System.out.println("the ticket price is " +dto.amount);
        System.out.println("the place of the park is " +dto.place);
        System.out.println("the timing of the park is " +dto.timing);
        System.out.println("the width of the park is" +dto.width);
    }
}
