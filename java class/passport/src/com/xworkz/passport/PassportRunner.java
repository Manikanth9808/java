package com.xworkz.passport;

import com.xworkz.passport.DTO.PassportDto;

public class PassportRunner {
    public static void main(String[] args) {
        PassportDto dto= new PassportDto();

        dto.captcha="";
        dto.confPass="";
        dto.em="";
        dto.db="";
        dto.cprLoc="";
        dto.giveN="dev777";
        dto.hintA="";
        dto.pass="";
        dto.isLogSameEmail=false;
        dto.dcdrLoc=2;
        dto.hintQ="";

        System.out.println(dto.dcdrLoc);
        System.out.println(dto.giveN);
    }
}
