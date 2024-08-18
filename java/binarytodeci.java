import java.io.*;
import java.util.*;
class binarytodeci {
    public static int binarytodecimal(int binum){
        int pow=0;
        int deci=0;
        while(binum>0){
         int lastdigit = binum %10;
         deci=deci+(lastdigit*(int)Math.pow(2,0));
         pow++;
         binum=binum/10;
        }
        return binum;
    }
    public static void main(String[] args) {
        System.out.println("Learning Java 18 Aug 2024");
       System.out.println(binarytodecimal(101));
    }
}