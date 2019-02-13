package com.company;

public class Vehicle {

    protected String color;
    protected String name;

    //constructors
    public Vehicle(){

    }

    public Vehicle(String color, String name) {
        this.color = color;
        this.name = name;
    }

    //getter and setters
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
