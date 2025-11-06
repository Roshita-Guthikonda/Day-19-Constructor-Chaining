package com.codegnan.oopexamples;

import java.util.Scanner;

public class EmployeeBonus {
	int empId;
	String name;
	int salary;
	int experience;
	double bonus;
	


    public EmployeeBonus(int empId, String name, int salary) {
        this(empId, name, salary, 0);
    }

    
    public EmployeeBonus(int empId, String name, int salary, int experience) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
        this.experience = experience;
        this.bonus = calculateBonus();
    }

  
    public double calculateBonus() {
        if (experience < 3)
            return 0.05 * salary;
        else if (experience <= 7)
            return 0.10 * salary;
        else
            return 0.15 * salary;
    }

   
    public void displayInfo() {
        System.out.println("Employee Details:");
        System.out.println("ID: " + empId);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Experience: " + experience);
        System.out.println("Bonus: " + bonus);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        int empId = sc.nextInt();

        System.out.print("Enter Employee Name: ");
        String name = sc.next();

        System.out.print("Enter Employee Salary: ");
        int salary = sc.nextInt();

        System.out.print("Enter Employee Experience (in years): ");
        int experience = sc.nextInt();

        EmployeeBonus e1 = new EmployeeBonus(empId, name, salary, experience);

        e1.displayInfo();

        sc.close();
    }

}
