package com.xworkz.hospital;

import com.xworkz.hospital.dao.HospitalDao;
import com.xworkz.hospital.dto.HospitalDto;

import java.util.Scanner;

public class HospitalRunner {



        public static void main(String[] args) {

            HospitalDto dto = new HospitalDto();
            Scanner ref=new Scanner(System.in);
            System.out.println("the  name 1 is:");
            dto.setPatientName1(ref.next());
            System.out.println("the  name 2  is: ");
            dto.setPatientName2(ref.next());
            System.out.println("the  name 3 is :");

            dto.setPatientName3(ref.next());
            System.out.println("the name 4 is:");
            dto.setPatientName4(ref.next());
            System.out.println("the  name 5 is:");
            dto.setPatientName5(ref.next());

            HospitalDao ref1= new HospitalDao();
            ref1.addMobileShopDetails(dto);
            ref1.getDetails();
        }
    }


