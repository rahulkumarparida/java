
/**
 * program
 */
import java.io.*;
     import java.util.*;
    
  public class  dowhile {

 public static void main(String[] args) {
    
    Scanner sc= new Scanner(System.in);
    int num;
    do {
        System.out.println("Enter a number");
        num = sc.nextInt();
        System.out.println("here is your number: "+num);
    } while (num>=0);
    System.out.println("THE END");
 }
    
}