import java.util.*;
import java.io.*;

public class Arrays2D {
    public static void createMatrix(int array[][] , int key ){
     // to create a 2-d array the syntax will be 
   
      int m = array.length; int n = array[0].length;
        
     Scanner sc = new Scanner(System.in);
     for (int i = 0; i < m; i++) {
        for (int j = 0; j < n; j++) {
            System.out.println("Enter elements in(" + i + ", " + j+")");
            array[i][j] = sc.nextInt();

        }
        
     }
        System.out.println("Enter the number you want to search : " );
      key = sc.nextInt();
     for (int i = 0; i < m; i++) {
        for (int j = 0; j < n; j++) {
        System.out.print(array[i][j]+" "); 
     
        }
        System.out.println();
      }  
      int  large = Integer.MIN_VALUE;
      int small = Integer.MAX_VALUE;
      for (int i = 0; i < m; i++) {
        for (int j = 0; j < n; j++) {
            if (key == array[i][j]) {
                System.out.println("This is the located at "+"ROW  [" + (i+1) +  "] and COLUMN [" + (j+1) +"] ");
            } 
         
            large = Math.max(large, array[i][j]);
            small = Math.min(small, array[i][j]);
        }
      } 
      System.out.println(large + " is the largest number in the array");
      System.out.println(small + " is the smallest number in the array");

    }

    public static void main(String[] args)  {
     int array[][] = new int[3][3];
     createMatrix(array , 5);
    }
}
