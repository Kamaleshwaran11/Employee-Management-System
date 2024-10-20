package org.example;

import java.util.ArrayList;
import java.util.Scanner;
class EmployeeManagement {
    private ArrayList<Employee> employeeList = new ArrayList<>();

    // Method to add a new employee
    public void addEmployee(Employee emp) {
        employeeList.add(emp);
        System.out.println("Employee added successfully!");
    }

    // Method to view all employees
    public void viewEmployees() {
        if (employeeList.isEmpty()) {
            System.out.println("No employees to display.");
        } else {
            for (Employee emp : employeeList) {
                System.out.println(emp);
            }
        }
    }

    // Method to update an employee by ID
    public void updateEmployee(int id) {
        for (Employee emp : employeeList) {
            if (emp.getId() == id) {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter new name: ");
                emp.setName(scanner.nextLine());
                System.out.print("Enter new designation: ");
                emp.setDesignation(scanner.nextLine());
                System.out.print("Enter new salary: ");
                emp.setSalary(scanner.nextDouble());
                System.out.println("Employee updated successfully!");
                return;
            }
        }
        System.out.println("Employee with ID " + id + " not found.");
    }

    // Method to delete an employee by ID
    public void deleteEmployee(int id) {
        for (Employee emp : employeeList) {
            if (emp.getId() == id) {
                employeeList.remove(emp);
                System.out.println("Employee deleted successfully!");
                return;
            }
        }
        System.out.println("Employee with ID " + id + " not found.");
    }
}

