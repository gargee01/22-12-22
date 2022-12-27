package com.exercise.bll;

public class Employee {

    private int Id;
    private String firstName;
    private String lastName;
    private double Salary;

    public Employee(int Id, String firstName, String lastName, double Salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.Id = Id;
        this.Salary = Salary;
    }

    public int getId() {
        return Id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getSalary() {
        return Salary;
    }

    public String Name() {
        return firstName + " " + lastName;
    }

    public void setSalary(int Salary) {
        this.Salary = Salary;
    }

    public double getAnnualSalary() {
        return Salary * 12;
    }

    public double rasieSalary(int percent) {
        Salary = Salary + ((percent * Salary) / 100);
        return Salary;
    }

    public String toString() {
        return " ID :" + Id + " \nName: " + firstName + " " + lastName + " \nSalary :" + Salary;

    }
}