import java.io.*;
import java.util.*;
//lets learn methods/functions
class function {
    //functioin without parameters
    public static void printhello(){
        System.out.println("Hello World");
        System.out.println("This is my first Function");
    }
    //function with parameters
    //sum function
public static int sum(int a , int b){
    int sum=a+b;
    System.out.println("The Sum is " +sum);
    return sum;
}
//multiply function
public static int mul(int a , int b){
    int mul=a*b;
    System.out.println("The Multiplacation is " +mul);
    return mul;
}
//division function
public static int div(int a , int b){
    int div=a/b;
    System.out.println("The Division is " +div);
    return div;
}
//substraction function
public static int sub(int a , int b){
    int sub=a-b;
    System.out.println("The Substraction is " +sub);
    return sub;
}
//main class
    public static void main(String[] args) {
        System.out.println("Learning java 17 Aug 2024");
        printhello();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Two Numbers: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
       int sum= sum(a ,b);
       int mul= mul(a ,b);
       int div= div(a ,b);   
       int sub= sub(a ,b);



    }
}