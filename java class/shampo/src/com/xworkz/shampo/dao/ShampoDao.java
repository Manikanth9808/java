package com.xworkz.shampo.dao;
import com.xworkz.shampo.dto.ShampoDto;
public class ShampoDao {
   ShampoDto dto;

   public boolean getDtails(ShampoDto dto){
       boolean isNameValid=false;
       if(null!=dto){
           this.dto=dto;
           isNameValid=true;
       }
       return isNameValid;
   }
}
