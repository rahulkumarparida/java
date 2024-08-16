/**
 * methods
 */
//in this we will learn about methods to make it easier to repeat a thing

public class methods {
    public static void print() {
     System.out.println("hello there");
    }
    public static void name(String naa){
        System.out.println(naa);
    }
    public static void sum(int a , int b){
             int add=a+b;
             System.out.println(add);
    }
    public static void multiply(int a ,int b){
         int mul=a*b;
         System.out.println(mul);
    }
    public static void main(String[] args) {
     print();
     name("Rahul");
     sum(10, 15);
     multiply(10 , 12);
    
    }
    
}