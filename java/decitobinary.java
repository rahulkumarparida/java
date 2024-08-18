import java.io.*;
import java.util.*;
class decitobinary {
    public static void decitobinum(int decinum){
      int  quotient=2;
      int binum=1;
      while( binum > 0){
        int remiander = decinum%quotient;
        
        decinum=decinum/quotient;
        System.out.print(remiander+" ");
      
        binum=decinum;
              }
    }
    public static void main(String[] args) {
        System.out.println("Learning Java 18 Aug 2024");
        decitobinum(4);
        System.out.println("");
    }
}