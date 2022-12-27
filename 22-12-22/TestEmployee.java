package com.exercise.pll;

import com.exercise.bll.*;

public class TestEmployee {

    public static void main(String[] args) {

        Employee e1 = new Employee(1280, "Arun", "Kumar", 30000);

        System.out.println("\nEmployee Id :" + e1.getSalary());
        System.out.println("First Name :" + e1.getFirstName());
        System.out.println("Last name :" + e1.getLastName());
        System.out.println("Full Name :" + e1.Name());
        System.out.println("Salary :" + e1.getSalary());
        System.out.println("Annual :" + e1.getAnnualSalary());

        e1.setSalary(50000);
        System.out.println("\nNew Salary :" + e1.getSalary());

        System.out.println("\nNew Salary after 10 percent raise is :" + e1.rasieSalary(10));

        System.out.println("\nAll Details-" + e1.toString());

    }

}