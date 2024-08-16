
// Online Java Compiler
// Use this editor to write, compile and run your Java code online
//satya was here         //sub-string:-to make a pariticular line stand out fromthe rest  of the string
// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.io.*;
import java.util.*;

class loops {
    public static void main(String[] args) {
        System.out.println("Hello!! Today i am learning java (aug 15 2024)");
        // loops
        Scanner Sc = new Scanner(System.in);
        // lets understand by a ex
        // program to print all the numbers till givern by user
        System.out.println("Enter the number till which you want to print");
        int n = Sc.nextInt();
        // for(intalize,conditioin,update)
        for (int m = 0; m <= n; m++) {
            System.out.println(m);
        }
        // while loop
        // same example in while loop
        System.out.println("Enter the number till which you want to print:-");
        int num = Sc.nextInt();
        int p = 0;
        while (p <= num) {
            System.out.println(p);
            p++;
        }
       // Hello!! Today is Day 2 of learning java (16 Aug 2024)
      //do-while
        System.out.println("enter a number:-");
        int o =Sc.nextInt();
        int u=0;
       do {
        System.out.println(u);
        u++;
       } while (u<=o);
 
    }
}