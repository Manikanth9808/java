package com.xworkz.hospital.dao;

import com.xworkz.hospital.dto.HospitalDto;

public class HospitalDao {

    HospitalDto ref;

        public boolean addMobileShopDetails( HospitalDto ref){
            boolean isHospitalNameValid=false;
            boolean isName1Valid=false;
            boolean isName2Valid=false;
            boolean isName3Valid=false;
            boolean isName4Valid=false;
            boolean isName5Valid=false;


            if(ref!=null){
                if(ref.getPatientName1()!=null)
                    isName1Valid=true;
                else System.out.println("the name 1 is invalid");
                if(ref.getPatientName2()!=null)
                    isName2Valid=true;
                else System.out.println("the name 2 is invalid");
                if(ref.getPatientName3()!=null)
                    isName3Valid=true;
                else System.out.println("the name 3 is invalid");
                if(ref.getPatientName4()!=null)
                    isName4Valid=true;
                else System.out.println("the name 4 is not valid");
                if(ref.getPatientName5()!=null)
                    isName5Valid=true;
                else System.out.println("the name 4 is not valid");
            }
            else System.out.println("the all value invalid");
            if(isHospitalNameValid==false) {
                this.ref = ref;
                isHospitalNameValid= true;
            }
            return isHospitalNameValid;
        }
        public void getDetails(){
            System.out.println("the name 1 is :"+ref.getPatientName1());
            System.out.println("the name 2 is :"+ref.getPatientName2());
            System.out.println("the name 3 is :"+ref.getPatientName3());
            System.out.println("the name 4 is :"+ref.getPatientName4());
            System.out.println("the name 4 is :"+ref.getPatientName5());

        }


    }

