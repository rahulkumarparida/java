import java.util.*;
import java.io.*;

public class LargestinArray {
    public static int largestinArray(int num[]){
        int largest = Integer.MIN_VALUE; // shows -infinity
        int smallest = Integer.MAX_VALUE; // shows +infinity
        for (int i = 0; i < num.length; i++) {
            if (num[i] > largest) {
                largest = num[i];
                
             
            }
            if(num[i]<smallest){
                smallest = num[i];
             
                
            }
            
        }
       System.out.println("Smallest Number in this array is " + smallest);
 return largest;

    }
    public static void main(String[] args) {
        int num[] = {1,2,6,3,5 , 8 , 9 , 4};
        System.out.println("Largest in the array is " + largestinArray(num));
        

       
    }
}
