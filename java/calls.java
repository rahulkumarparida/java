import java.io.*;
import java.util.*;

class calls {
    public static int swap(int a, int b){
            int temp = a;
            a=b;
            b=temp;
            return temp;
    }
    public static void main(String[] args) {
        System.out.println("Learning java 17 AUg 2024");
            // call by value
            int a=10;
            int b=15;
            //swap these two using call bby value
            int temp=swap(a , b);
            System.out.println(a + "=a , b= "+b);
            /* as you can see th values did not swap that'a because java always use call by value which means when the functtion is called 
            in java it  the original value does not pass instead it passes the copy of the variable to the  calling function/method temproryily 
            and restores back to it original value in the main function */
             
    }
}