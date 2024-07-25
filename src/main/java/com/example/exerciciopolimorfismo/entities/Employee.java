package com.example.exerciciopolimorfismo.entities;

public class Employee {
    private String name;
    private Integer hours;
    private double valuehour;

    public Employee(){

    }

    public Employee(String name, Integer hours, double valuehour){
        this.name = name;
        this.hours = hours;
        this.valuehour = valuehour;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public Integer getHour(){
        return hours;
    }

    public void setHour(Integer hour){
        this.hours = hour;
    }

    public double getValuehour(){
        return valuehour;
    }

    public void setValuehour(double valuehour){
        this.valuehour = valuehour;
    }

    public double payment(){
        return hours * valuehour;
    }
}
