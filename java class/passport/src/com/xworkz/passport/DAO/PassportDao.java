package com.xworkz.passport.DAO;

import com.xworkz.passport.DTO.PassportDto;

public class PassportDao {

    PassportDto dto;

    public boolean createPassport(PassportDto dto) {

        boolean isDtoCreated = false;
        System.out.println("creating passport user details");
        if (null != dto) {
            this.dto = dto;
            isDtoCreated = true;
        } else System.out.println("please provide valid sur name");
        System.out.println("user passport process ended");

        return isDtoCreated;

    }

    }

