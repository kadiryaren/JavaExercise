package com.company;
// coded by Kadir Yaren
public class Employee {
    private String name;
    private int salary;
    private String department;

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }

    public Employee(String name, int salary, String department){
        this.name = name;
        this.salary = salary;
        this.department = department;
    }
    public void Work(){
        System.out.println("Employee is working.");
    }

    public void Service(){
        System.out.println("Bus.");
    }



}
