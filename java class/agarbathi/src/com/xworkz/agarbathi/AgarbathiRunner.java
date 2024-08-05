package com.xworkz.agarbathi;
 import com.xworkz.agarbathi.dto.AgarbathiDto;
 import com.xworkz.agarbathi.dao.AgarbathiDao;
public class AgarbathiRunner{
    public static void main(String[] args){
        AgarbathiDto ref=new AgarbathiDto();
//        ref.brandName="ullas";
//        ref.noOfSticks=30;
//        ref.manifactureDate="23/04/2024";
//        ref.expireDate="31/01/2025";
//        ref.price=45;
//        ref.id=34;

        AgarbathiDao ref1=new AgarbathiDao();
        ref1.addDetails(ref);
        ref1.getDetails();


    }
}
