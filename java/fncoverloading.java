import java.io.*;
import java.util.*;
class fncoverloading {
    //functioon overloading using parmeters
    public static int sum(int a , int b){
        return a+b;
    }
    public static int sum(int a, int b , int  c){
        return a+b+c;
    }
    //function overloading using data types
    public static int sub(int e , int f){
        return e-f;
    }
    public static float sub(float e ,float f){
        return e-f;
    } 
    public static void main(String[] args) {
        System.out.println("Learning Java 18 Aug 2024");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter TWo numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();
            System.out.println("The Sum of Two NUmbers is "+sum(a,b));
            System.out.println("Enter Another number to find the sum of three : ");
        int c=sc.nextInt();
            System.out.println("Sum of three numbers are "+sum(a,b,c));
        // function ovrelloading using data types
        System.out.println("Function Overloading with diff data types but same variables");
        
        System.out.println(sub(4,3));
        System.out.println( sub(5f,3f));

    }
}