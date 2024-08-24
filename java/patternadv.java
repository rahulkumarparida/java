import java.io.*;
import java.util.*;
class patternadv {
    public static void hollowrect(int row ,int columns){
        
        for(int i=1;i<=row;i++){
            for(int j=1;j<=columns;j++){
                if(i==1||i==row||j==1||j==columns){
                    System.out.print("*");

            }

                else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
    public static void invrtdpyramid(int n){
                for(int i=1;i<=n;i++){
                    for(int j=1;j<=n-i;j++){
                        
                            System.out.print(" ");                   
                    }
                        for(int j=1;j<=i;j++){
                            System.out.print(j);
                        }
                      System.out.println("");
                }

    }
    public static void haflpyramidopp(int m){
        for(int i=1;i<=m;i++){
            for(int j=1;j<=m-i+1;j++){
                System.out.print(j+" ");

            }
            System.out.println();
            
        }
    }
    public static void floydtriangle(int m){
        int count=1;
        for(int i=1;i<=m;i++){
            for(int j=1;j<=i;j++){
               System.out.print(count+" ");
               count++;
            }
    
            System.out.println();
        }
    }
     public static void onezerotriangle(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){

                if((j+i)%2==0){
                    System.out.print("1 ");
                }
                else{
                    System.out.print("0 ");
                }

            }
        System.out.println();
        }
     }
     public static void butterflypattern(int n){
     // first half
       for(int i=1;i<=n;i++){
         for(int j=1;j<=i;j++){
            System.out.print("*");
         }
         for(int j=1;j<=2*(n-i);j++){
            System.out.print(" ");

         }
         for (int j=1; j<=i; j++) {
            System.out.print("*");
         }
         System.out.println("");
       }
       //second half 
       for (int i = n; i>=1; i--) {
        for(int j=1;j<=i;j++){
           System.out.print("*");
        }
        for(int j=1;j<=2*(n-i);j++){
           System.out.print(" ");

        }
        for (int j = 1; j<=i; j++) {
           System.out.print("*");
        }
        System.out.println("");
        
       }

    }
    public static void solid_rhombus(int n) {
        
        for(int i=1;i<=n;i++){
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
          for(int j=1;j<=n;j++){
            System.out.print("*");
          }
            System.out.println();
        }
    }
    public static void hollow_rhombus(int row){
        for(int i=1;i<=row;i++){
            //for spaces outsidde the rhombus
            for(int j=1;j<=(row-i);j++){
                System.out.print(" ");
            }
            //for * and spaces inside the rhombus
          for(int j=1;j<=row;j++){
            //for *
            if (i==1||i==row||j==1||j==row) {
                System.out.print("* ");
            }
            //for spaces
           else{
            System.out.print("  ");
           }
          }
            System.out.println();
        }
    }
    public static void diamond_pattern(int m) {
        // first half (full pyramid)
        for(int i=1;i<=m;i++){      
            for(int j=1;j<=(m-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i-1);j++){
                
                    System.out.print("*");
                
                
            }
            
                System.out.println("");
        }
        // second half
        for(int k=m;k>=1;k--){      
            for(int j=1;j<=(m-k);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=(2*k)-1;j++){
            
                    System.out.print("*");
                
                
            }
            
                System.out.println("");
        }

    }
        
    public static void number_pyyramid(int n) {
        for (int i = 1; i <=n; i++) {
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(i + " ");
            }
            System.out.println("");
        }
    }
        
    public static void palindromic_pyramid(int n) {
        for(int i=1;i<=n;i++){
        
            

        }

    }
    public static void main(String[] args) {
        System.out.println("Learning Java 24 Aug 2024 ");
//         hollowrect(5,8);
//         System.out.println("");
//         invrtdpyramid(4);
//         System.out.println("");
//        haflpyramidopp(5);
//        System.out.println("");
//        floydtriangle(4);
//        System.out.println("");
//        onezerotriangle(5);
//        System.out.println(""); 
//        butterflypattern(5);
//     System.out.println("");
//     solid_rhombus(6);
// System.out.println("");
// hollow_rhombus(7);
// System.out.println("");
// diamond_pattern(5);
// System.out.println("");
// number_pyyramid(5);
System.out.println("");
palindromic_pyramid(5);
    }
}