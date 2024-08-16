/**
 * javaj
 */
import java.io.*;
import java.util.Scanner;


public class javaj {

    public static void main(String[] args) {
        // int a=10;
        // int b=16;
        // int c= a+b;
        // System.out.println(c);
        //using scanner class
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number: ");
        int a=sc.nextInt();
        // int b=sc.nextInt();
        // int c=sc.nextInt();
        System.out.println("Loading...");
        //  System.out.println("The addition of "+a+" and "+b+" is "+(a+b));
              //codnitional statement
            //   if(a>=18){
            //     System.out.println("you can vote");
            //   }
            //   else{
            //      System.out.println("you are under 18 you cannot vote");
            //   }
            //nested conditional statement
            // if(a>b){    
            //      if (a>c) {
            //             System.out.println(a+" is the greatest");
            //      }
            //      else{
            //         System.out.println(c+" is the greatest");
            //      }
            // }
            // else{
            //     if(b>c){
            //         System.out.println(b+" is the greatest");
            //     }
            //     else{
            //         System.out.println(c+" is the greatest");
            //     }
            // }
            // System.out.println("The Table of "+a+"is ");
            //     //input a
            //     for(int i=0;i<=10;i++){
            //         int j=i*a;

                   
            //         System.out.println(a+" * "+i+" = "+j);

            //     }
            //inpuut a=5
            
                // for(int i=1;i<=a;i++){
                  
                //     for(int j=1;j<=i;j++){

                //             System.out.print(i);
                        
                //     }
                //     System.out.println(" ");
                // }
         int i=0;
         while (i<=a) {
            System.out.print(i+" ");
            i++;
         }
        }
}