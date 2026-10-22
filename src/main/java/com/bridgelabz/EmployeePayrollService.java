package com.bridgelabz;
import java.util.*;

class EmployeePayroll {
    int id;
    String name;
    double salary;

    EmployeePayroll(int id, String name, double salary){

        if(id<=0){
            throw new IllegalArgumentException("Employee ID must be greater than 0");
        }

        if(name==null || name.equals(" ") || name.equals("   ")){
            throw new IllegalArgumentException("Name should not be null or empty");
        }

        if(salary<=0.0){
            throw new IllegalArgumentException("Salary should be greater than 0");
        }

        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void displayDetails(){
        System.out.println("Employee id: "+id);
        System.out.println("Employee Name: "+name);
        System.out.println("Employee Salary: "+salary);
    }
}

public class EmployeePayrollService{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employee Id: ");
        int id = sc.nextInt();
        if(id<=0){
            System.out.println("Enter the Employee greater than 0");
            id = sc.nextInt();
        }
        System.out.println("Enter Employee Name: ");
        sc.nextLine();
        String name = sc.nextLine();
        System.out.println(("Enter Employee Salary: "));
        double salary = sc.nextDouble();

        EmployeePayroll employ = new EmployeePayroll(id, name, salary);

        employ.displayDetails();
    }
}