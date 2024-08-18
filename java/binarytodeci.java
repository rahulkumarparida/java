import java.io.*;
import java.util.*;
class binarytodeci {
    public static void binarytodecimal(int binum){
        int pow=0;
        int deci=0;
        while(binum>0){
         int lastdigit = binum %10;
         deci=deci+(lastdigit*(int)Math.pow(2,pow));
         pow++;
         binum=binum/10;
        }
           System.out.println("The decimal of "+binum+" = "+deci);
    
    }
    public static void main(String[] args) {
        System.out.println("Learning Java 18 Aug 2024");
       binarytodecimal(101);
    }
}