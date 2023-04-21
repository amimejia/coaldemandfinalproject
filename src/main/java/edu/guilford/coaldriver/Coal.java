package edu.guilford.coaldriver;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author amyme
 */
public class Coal {
    private int year;
    private double coalDemand;

    //constructors
    public Coal(int year, double coalDemand) {
        this.year = year;
        this.coalDemand = coalDemand;
    }
    
    //getters & setters

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getCoalDemand() {
        return coalDemand;
    }

    public void setCoalDemand(double coalDemand) {
        this.coalDemand = coalDemand;
    }
    
}
