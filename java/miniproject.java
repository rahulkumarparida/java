/**
 * miniproject
 */
//create a mini project to ask user a random number btn 1-100 but when the user gives the input it will say its more or less the number you are thinking
// still trying to mkae it work
import java.io.*;
import java.util.*;

public class miniproject {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int mynum = (int) (Math.random() * 100);
        System.out.println(mynum);

        // int num = 0;
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        do {
            
            // num = unum;
            if (num == mynum) {
                System.out.println("U guessed it right!!");
                break;

            } else if (num > mynum) {
                System.out.println("My number is smaller than it");
                System.out.println("Try Again");

            } else {
                System.out.println("Think of a bigger number");
                System.out.println("Try Again");
            }

        } while (num >= 0);
        System.out.print("my number was ");
        System.out.println(mynum);
    }
}