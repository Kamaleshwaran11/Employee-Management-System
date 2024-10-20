package org.example;
import java.util.*;
public class Main{
    public static void main(String[] args) {
            EmployeeManagement management = new EmployeeManagement();
            Scanner scanner = new Scanner(System.in);
            int choice;

            do {
                System.out.println("\nEmployee Management Application");
                System.out.println("1. Add Employee");
                System.out.println("2. View All Employees");
                System.out.println("3. Update Employee");
                System.out.println("4. Delete Employee");
                System.out.println("5. Exit");
                System.out.print("Enter your choice: ");
                choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        // Add Employee
                        System.out.print("Enter ID: ");
                        int id = scanner.nextInt();
                        scanner.nextLine(); // consume newline
                        System.out.print("Enter Name: ");
                        String name = scanner.nextLine();
                        System.out.print("Enter Designation: ");
                        String designation = scanner.nextLine();
                        System.out.print("Enter Salary: ");
                        double salary = scanner.nextDouble();

                        Employee emp = new Employee(id, name, designation, salary);
                        management.addEmployee(emp);
                        break;

                    case 2:
                        // View Employees
                        management.viewEmployees();
                        break;

                    case 3:
                        // Update Employee
                        System.out.print("Enter Employee ID to update: ");
                        int updateId = scanner.nextInt();
                        management.updateEmployee(updateId);
                        break;

                    case 4:
                        // Delete Employee
                        System.out.print("Enter Employee ID to delete: ");
                        int deleteId = scanner.nextInt();
                        management.deleteEmployee(deleteId);
                        break;

                    case 5:
                        // Exit
                        System.out.println("Exiting application...");
                        break;

                    default:
                        System.out.println("Invalid choice, please try again.");
                }
            } while (choice != 5);

            scanner.close();
        }
    }