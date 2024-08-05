package com.xworkz.trainee.dto;

public class TraineeDto {
    private String name;
    private String lastName;
    private String batch;
    private boolean isSelectedCsr;
    private String clgName;

    public TraineeDto(){
        System.out.println("default constructor invoked");
    }

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setLastName(String lastName){
        this.lastName=lastName;
    }
    public String getLastName(){
        return lastName;
    }
    public void setBatch(String batch){
        this.batch=batch;
    }
    public String getBatch(){
        return batch;
    }
    public void setIsSelectedCsr(boolean isSelectedCsr){
        this.isSelectedCsr=isSelectedCsr;
    }
    public boolean getIsSelectedCsr(){
        return isSelectedCsr;

    }
    public void setClgName(String clgName){
        this.clgName=clgName;
    }
    public String getClgName(){
        return clgName;
    }
}
