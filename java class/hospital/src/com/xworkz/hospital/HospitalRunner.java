package com.xworkz.hospital;

import com.xworkz.hospital.dao.HospitalDao;
import com.xworkz.hospital.dto.HospitalDto;

public class HospitalRunner {
    public static void main(String[] args) {

        HospitalDto dto= new HospitalDto();
        dto.patientName="abc";
        dto.petientId=353;
        dto.admitDate="21/03/2002";
        dto.dischargeDate="23/03/2002";
        dto.bill=2000;

        HospitalDao dao= new HospitalDao();
        dao.addPetientDetails(dto);
        dao.getDetails();
    }
}
