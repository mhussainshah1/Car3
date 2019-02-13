package com.company;

public class Employee extends Person{
    private String Department;
    private String JobTitle;
    private String PayRate;

    //constructor
    public Employee(){

    }

    public Employee(String name, String gender, int age, String department, String jobTitle, String payRate) {
        super(name, gender, age);
        Department = department;
        JobTitle = jobTitle;
        PayRate = payRate;
    }

    //getter and setter
    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    public String getJobTitle() {
        return JobTitle;
    }

    public void setJobTitle(String jobTitle) {
        JobTitle = jobTitle;
    }

    public String getPayRate() {
        return PayRate;
    }

    public void setPayRate(String payRate) {
        PayRate = payRate;
    }
}
