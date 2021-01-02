
package com.company;
// coded by Kadir Yaren
public class Main{

    public static void main(String[] args) {
    Employee employee = new Employee("kadir",5000,"IT");
    employee.Work();
    System.out.println("--------------------------");
    Manager manager_1 = new Manager("Ali",8000,"IT",10);
    manager_1.Work();
    System.out.println("--------------------------");
    System.out.println("Manager name: " + manager_1.getName());
    System.out.println("Manager Salary: " + manager_1.getSalary());
    System.out.println("Manager Department: " + manager_1.getDepartment());
    System.out.println("Manager member: " + manager_1.getMember());
    manager_1.raiseSalary();
    manager_1.Service();



    }
}
