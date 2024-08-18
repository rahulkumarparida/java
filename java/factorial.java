//factorial and binomiaal factorial
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
    public static int binomial(int m , int n){
         int   fact_m= factorial(m);
            int fact_n=factorial(n);
          int  fcat_o=factorial(m-n);
        int bino= fact_m/(fact_n*fcat_o);
    
        return bino;
    }
    public static void main(String[] args) {
        System.out.println("^..........Learning java 18 aug 2024.........^");
        Scanner sc=new Scanner(System.in);
        System.out.print("Enetr to number to find the factorial---------> ");
        int m=sc.nextInt(); 
        int n=sc.nextInt();
        
        System.out.println(binomial(m,n));

    }
}