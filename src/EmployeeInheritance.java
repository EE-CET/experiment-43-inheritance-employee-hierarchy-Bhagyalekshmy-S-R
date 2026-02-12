import java.util.Scanner;

// Parent class
class Employee {
    String name;
    int age;
    long phoneNumber;
    String address;
    float salary;

    void printSalary() {
        System.out.println(salary);
    }
}

// Child class Officer
class Officer extends Employee {
    String specialization;
}

// Child class Manager
class Manager extends Employee {
    String department;
}

public class EmployeeInheritance {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Officer object
        Officer officer = new Officer();

        officer.name = sc.nextLine();
        officer.age = sc.nextInt();
        officer.phoneNumber = sc.nextLong();
        sc.nextLine(); // consume leftover newline
        officer.address = sc.nextLine();
        officer.salary = sc.nextFloat();
        sc.nextLine(); // consume leftover newline
        officer.specialization = sc.nextLine();

        // Manager object
        Manager manager = new Manager();

        manager.name = sc.nextLine();
        manager.age = sc.nextInt();
        manager.phoneNumber = sc.nextLong();
        sc.nextLine(); // consume leftover newline
        manager.address = sc.nextLine();
        manager.salary = sc.nextFloat();
        sc.nextLine(); // consume leftover newline
        manager.department = sc.nextLine();

        // Output
        System.out.println("Officer:");
        System.out.println(officer.name);
        System.out.println(officer.age);
        System.out.println(officer.phoneNumber);
        System.out.println(officer.address);
        officer.printSalary();
        System.out.println(officer.specialization);

        System.out.println("Manager:");
        System.out.println(manager.name);
        System.out.println(manager.age);
        System.out.println(manager.phoneNumber);
        System.out.println(manager.address);
        manager.printSalary();
        System.out.println(manager.department);

        sc.close();
    }
}

