/*WAP to create a calculator class to add two numbers.
use constructor overloading.....
Name:Shaikh Faiza Noor Mohd Israr
uin:251P141/68
Class:S.E Comps Div:A */

public class Calculator {
    int a;
    int b;
    
    public Calculator() {
        a = 0;
        b = 0;
    } 
    
    public Calculator(int p,int q){
        a = p;
        b = q;

    }

    void add(int i,int j){
        int sum=i+j;
        System.out.println("Add Integer:"+sum);
    }
    void add(double i,double j){
        double sum=i+j;
        System.out.println("Add Double:"+sum );
    }
}
