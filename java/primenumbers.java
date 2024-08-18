import java.io.*;
import java.util.*;
class primenumbers {
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
    public static void primenum(int n){
       for(int i =2 ; i<=n;i++){ 
       if(primeornot(i)){
        System.out.print(i+" ");
       }
       
    }
    }
    public static void main(String[] args) {
        System.out.println("Learning Java 18 Aug 2024");
        primenum(100);
            
    }
}