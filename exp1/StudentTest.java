/*WAP to store and display student information of few students. 
Information like name,uin,cgpa.
Name:Shaikh Faiza Noor Mohd Israr
Class:SE.Comps Div:A
UIN:251P141/68 */
public class StudentTest { 
    public static void main(String[] args) {
        //Student 1 detail
        Student s1 = new Student();
        s1.name = "Faiza";
        s1.uin = "251P141";
        s1.cgpa = 8.7; 
        s1.display();

        //Student 2 details

        Student s2 = new Student();
        s2.name = "Swaleha";
        s2.uin = "251S038";
        s2.cgpa = 9.0;
        s2.display();
    
    
        //Student 3 details
        Student s3 = new Student();
        s3.name = "Asifa";
        s3.uin = "251S039";
        s3.cgpa = 9.9;
        s3.display(); 


    }
    
}
class Student{
    String name;
    String uin;
    double cgpa;

    void display() {
        System.out.println("-----------");
        System.out.println("Name:"+name);
        System.out.println("UIN:"+uin);
        System.out.println("CGPA:"+cgpa);
        System.out.println("=========");
    }
}
