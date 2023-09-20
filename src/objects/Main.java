package objects;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student[] students = new Student[2];

        Student student1 = new Student();
        student1.setName("Bhuvi");
        student1.setAge(20);
        student1.setDepartment("IT");
        students[0] = student1;

        Student student2 = new Student();
        student2.setName("Vignesh");
        student2.setAge(21);
        student2.setDepartment("IT");
        students[1] = student2;

        for (int i = 0; i < students.length; i++) {
            System.out.println("Student " + (i + 1) + ":");
            System.out.println("Name: " + students[i].getName());
            System.out.println("Age: " + students[i].getAge());
            System.out.println("Department: " + students[i].getDepartment());
        }

        Employee[] employees = new Employee[1];

        Employee employee = new Employee();
        employee.setEmpId(12);
        employee.setSalary(50000);
        employee.setPosition("Manager");
        employees[0] = employee;

        for (int i = 0; i < employees.length; i++) {
            System.out.println("Employee " + (i + 1) + ":");
            System.out.println("Employee ID: " + employees[i].getEmpId());
            System.out.println("Salary: " + employees[i].getSalary());
            System.out.println("Position: " + employees[i].getPosition());
        }
    }
}
