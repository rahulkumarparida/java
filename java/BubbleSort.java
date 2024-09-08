import java.io.*;
import java.util.*;
public class BubbleSort {
    public static void SortBubbleAscending(int arr[]){

        int i = 0;
       for (int turn = 0; turn < arr.length; turn++) {
          
         for ( i = 0; i < arr.length-1-turn; i++) {
             if (arr[i] < arr[i+1]) {
                int temp = 0;
             temp  =arr[i];
             arr[i] = arr[i+1];
             arr[i+1] = temp;
         
             }
         }
         System.out.print(arr[i] + "  ");
       }
           System.out.println();
        }
        public static void SortBubbleDescending(int arr[]){

            int i = 0;
           for (int turn = 0; turn < arr.length; turn++) {
             for ( i = 0; i < arr.length-1-turn; i++) {
                 if (arr[i] > arr[i+1]) {
                    int temp = 0;
                 temp  =arr[i];
                 arr[i] = arr[i+1];
                 arr[i+1] = temp;
                 }
             }
             System.out.print(arr[i] + "  ");
           }
               System.out.println();
            }
    public static void main(String[] args) {
        int arr[] = {8,4,5,6,2,1,3,7,9,0};
        SortBubbleAscending(arr);
        SortBubbleDescending(arr);
    }
}
