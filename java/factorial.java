import java.io.*;
import java.util.*;
class factorial {
    public static int factorial(int a){

        int fact=1; 
        for(int i=1;i<=a;i++){
            fact=fact*i; 
        
        }
    return fact;
    }
    public static void main(String[] args) {
        System.out.println("^..........Learning java 17 aug 2024.........^");
        Scanner sc=new Scanner(System.in);
        System.out.print("Enetr to number to fimnd the factorial---------> ");
        int a=sc.nextInt(); 
        System.out.println(factorial(a));

    }
}