import java.io.*;
import java.util.*;
class decitobinary {
    public static void decitobinum(int decinum){
      // int  quotient=2;
      // int binum=1;
      // while( binum > 0){
      //   int remiander = decinum%quotient;
      //   decinum=decinum/quotient;
      //   System.out.print(remiander+" ");
      //   binum=decinum;
            int pow=0;
            int binum=0;
            while(decinum>0){
              int remainder = binum%2;
              binum=binum+(remainder*(int)Math.pow(10,pow));
              pow++;

            }
        System.out.println(binum+" ");
              }
    
    public static void main(String[] args) {
        System.out.println("Learning Java 19 Aug 2024");
        decitobinum(4);
        System.out.println("");
    }
}