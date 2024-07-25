package com.example.exerciciopolimorfismo.entities;

public class OutsourceEmployee extends Employee {
    private double additionalCharge;

    public OutsourceEmployee(String name, Integer hours, double valueHours, double additionalCharge){
        super(name, hours, valueHours);
        this.additionalCharge = additionalCharge;
    }

    @Override
    public double payment(){
        return super.payment() + additionalCharge * 1.1;
    }
}
