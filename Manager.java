public class Manager extends Employee {

    private String department;
    private int projects;

    Manager(String name, int age, String gender, String mobile,
            String designation, int employeeId, int salary,
            int experience, String department, int projects) {

        super(name, age, gender, mobile, designation, employeeId,
              salary, experience);

        this.department = department;
        this.projects = projects;
    }

    void display() {

        super.display();

        System.out.println("Department : " + this.department);
        System.out.println("Projects : " + this.projects);
    }
}