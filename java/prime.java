import java.io.*;
import java.util.*;
class prime {
   public static boolean primeornot(int n){
      if(n==2){
         return true;
      }
      for(int i=2 ; i<=Math.sqrt(n);i++){
         if(n%i==0){
            return false;

         }
        
      }
       return true;
   }
    public static void main(String[] args) {
        System.out.println("Learning Java 18 Aug 2024");
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter a number: ");
       int n= sc.nextInt();//number to check
      //  int c=1;//count
        System.out.println(primeornot(n));
           
            
   }
   
     
 }
