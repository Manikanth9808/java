package com.xworkz.trainee;

import com.xworkz.trainee.dao.TraineeDao;
import com.xworkz.trainee.dto.TraineeDto;
import java.util.Scanner;

public class TraineeRunner {

    public static void main(String[] args) {
        TraineeDto dto=new TraineeDto();
        Scanner obj=new Scanner(System.in);

        System.out.println("enter the trainee name:");

        String name=obj.next();
        dto.setName(name);
        System.out.println("the trainee last name is :");
        String name1=obj.next();
        dto.setLastName(name1);
        System.out.println("the trainee batch start date is:");
        String name2=obj.next();
        dto.setBatch(name2);
        System.out.println("the trainee clg name is: ");
        String name3=obj.next();
        dto.setClgName(name3);

        System.out.println("the trainee is selected csr:");
        boolean name4=obj.nextBoolean();
        dto.setIsSelectedCsr(name4);










        TraineeDao dao= new TraineeDao();
        dao.getTraineeDetails(dto);
        dao.readDetails();;
    }
}
