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
    public static void main(String[] args) {
        System.out.println("Learning Java 20 AUg 2024 ");
        hollowrect(5,8);
        System.out.println("");
        invrtdpyramid(4);
        System.out.println("");
       haflpyramidopp(5);
       System.out.println("");
       floydtriangle(4);

    }
}