import java.util.Scanner;

public class Company {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter age: ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter gender: ");
        String gender = sc.nextLine();

        System.out.print("Enter mobile: ");
        String mobile = sc.nextLine();

        System.out.print("Enter designation: ");
        String designation = sc.nextLine();

        System.out.print("Enter employee id: ");
        int employeeId = sc.nextInt();

        System.out.print("Salary: ");
        int salary = sc.nextInt();

        System.out.print("experience: ");
        int experience = sc.nextInt();
        sc.nextLine();

        System.out.print("Department: ");
        String department = sc.nextLine();

        System.out.print("Projects: ");
        int projects = sc.nextInt();

        Manager m1 = new Manager(name, age, gender, mobile,
                designation, employeeId, salary, experience,
                department, projects);

        System.out.println("=====Manager Details=====");

        m1.display();
    }
}