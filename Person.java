public class Person {

    private String name;
    private int age;
    private String gender;
    private String mobile;

    Person(String name, int age, String gender, String mobile) {

        this.name = name;
        this.age = age;
        this.gender = gender;
        this.mobile = mobile;
    }

    void display() {

        System.out.println("Name : " + this.name);
        System.out.println("Age : " + this.age);
        System.out.println("Gender : " + this.gender);
        System.out.println("Mobile : " + this.mobile);
    }
}