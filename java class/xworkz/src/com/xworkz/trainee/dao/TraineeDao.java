package com.xworkz.trainee.dao;

import com.xworkz.trainee.dto.TraineeDto;

public class TraineeDao {

    TraineeDto dto;


    public boolean getTraineeDetails(TraineeDto dto){
        boolean isTraineeDetailsValid=false;
        boolean isNameValid=false;
        boolean isLastNameValid=false;
        boolean isBatchValid=false;
        boolean isSelectedCsrValid=false;
        boolean isClgNameValid=false;

        if(dto !=null){
            if(dto.getName()!=null)
                isNameValid=true;
            else System.out.println("the name is not valid");
            if(dto.getLastName()!=null)
                isLastNameValid=true;
                else System.out.println("the last name is not valid");

                if(dto.getBatch()!=null)
                    isBatchValid=true;
                else System.out.println("the batch is valid");
                if(dto.getIsSelectedCsr()!=false)
                    isSelectedCsrValid=true;
                else System.out.println(" trainee isnot  selected csr ");
                if(dto.getClgName()!=null)
                    isClgNameValid=true;
                else System.out.println("the clg name not valid");

            }
        else System.out.println("provide the valid information");

        if(isTraineeDetailsValid==false) {
            this.dto = dto;
            isTraineeDetailsValid = true;
        }
            else System.out.println("provide tha valid details");
        return isTraineeDetailsValid;
        }
        public void readDetails(){
            System.out.println("the tarinee name is "+dto.getName());
            System.out.println("the last name is "+dto.getLastName());
            System.out.println("the batch start date is "+dto.getBatch());
            System.out.println("the is trainee selected csr "+dto.getIsSelectedCsr());
            System.out.println("the trainee clg name is "+dto.getClgName());
    }
}
