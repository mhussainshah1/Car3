package com.company;

public class Car extends Vehicle { //is -a
    private String make; // has -a
    private String model;
    private int speed;
    private Driver driver;

    public Car() {
        driver = new Driver();
    }

    public Car(String make) {
        this();
        this.make = make;
    }

    //getter and setters
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getSpeed() {
        return speed;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    //methods
    public String starting() {
        return "The " + color + " " + make + " is starting.";
    }

    public String accelerate() {
        return "The " + color + " " + make + " is accelerating.";
    }

    public String stopped() {
        return "The " + color + " " + make + " is stopped.";
    }

    public String setSpeed(int speed) {
        this.speed = speed;
        return "The " + color + " " + make + " is going " + speed + " mph";
    }

    public String emissionChecked(){
        return "The "+ color + " " + make + " has stopped to have its emissions checked";
    }

    public String passedEmissionTest(){
        return "The "+ color + " " + make + " passes its emission test";
    }

    public String passed(Car car1, Car car2){
        return "The " + car1.color + " " + car1.make +" just passed the " +
                        car2.color + " " + car2.make;
    }

    public String getDescription(){
        return "Car : " + color + " " + make + " " + getModel() + " ";
    }

    public String getDriverDetail(){
        return "the "+ color + " " + make + "  is being driven by " + driver.getName();
    }
}
