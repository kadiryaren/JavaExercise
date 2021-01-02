package com.company;
// coded by Kadir Yaren
public class Manager extends Employee {
    private int member;

    public Manager(String name, int salary, String department, int member){
        super(name,salary,department);
        this.member = member;
    }
    public void Work(){
        System.out.println("Manager is working.");
    }
    public void raiseSalary(){
        System.out.println("500TL zam yapildi!");
    }

    @Override
    public void Service(){
        System.out.println("Personal car.");

    }
    // super getter setter functions
    public int getMember() {
        return member;
    }
    public String getName(){
        return super.getName();
    }
    public int getSalary(){
        return super.getSalary();
    }
    public String getDepartment(){
        return super.getDepartment();
    }
}

