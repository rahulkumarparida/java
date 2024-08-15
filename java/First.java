//satya was here         //sub-string:-to make a pariticular line stand out fromthe rest  of the string
         // Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.io.*;
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello!! Today i am learning java (aug 15 2024)");
        System.out.println("gonna learn diffrent data types");
       //primitive data types
         System.out.println("all the primitive data types");
        byte number=11;
        int max=123456789;
        long phone=104683788694646L;
        float pi=3.14F;
        char hash='#';
        boolean isgood=true;
        System.out.println(number+" byte");
        System.out.println(max+" int");
        System.out.println(phone+" long");
        System.out.println(pi+" float");
        System.out.println(hash+" char");
        System.out.println(isgood+" boolean");
        //non-primitive data types
        System.out.println(" all the non-primitive data types");
         String name="rahul";
           System.out.println(name+" string");
            System.out.println(name.length()+" string length");
                             //concatenate:-to join two strings
            String title=" kumar parida";
            String fullname=name+title +" is my name ";
             System.out.println(fullname);
           //charAt :- which char is present in the location
           System.out.println(name.charAt(4)+" this is the charAT location of 4");
           //replace :- to replace the char to something new
           String name4=name.replace('r','b');
           System.out.println(name4);
           //substring:-to make a part of the bigger string stand out
            System.out.println(name4.substring(0, 4)+"bali");
            //arrays:- it is a type of container of elements of similar datatype
            //datatyp[] name=new dataytpe[length]
            int[] marks=new int[4];
            marks[0]=85 ;
            marks[1]=65 ;
            marks[2]=95 ;
            marks[3]=105 ;
            System.out.println(marks[0]+marks[1]+marks[2]+marks[3] + "is the total mark scored");
            //another way of writing arrays if you have less data is
            int[] num={12,45,78,96,32,21};
            System.out.println(num[5]);
            //lenght of the array
            System.out.println(marks.length);
            //sort
             System.out.println("before sorting"+marks[0]);
            Arrays.sort(marks);
            System.out.println("After sorting"+marks[0]);
            //2-d arrrays
            int[][] arr2d={{15,16,18},{19,20,21}};
            System.out.println(arr2d[0][0]);
            //casting:- converting one datatype to another fi they are compaatiable with each other
            //examplx 
            System.out.println("explicit casting");
            double price=100.00;
            double fp= price +18.5;
            System.out.println(fp);
            System.out.println("implicit casting");
            int pricet=100;
            double fpt=pricet+(int)18.5;
             System.out.println(fpt);
             //noticed how if we add int the value after . is 0 and if we add double the value appears
             double fptt=pricet+(double)18.5;
            System.out.println(fptt);
            //final :- used to set the value of a variable as constant
            final double G=9.8;
            System.out.println(G+" the variable G in this is now constant and cannot be changed later in this code");
        //operators
        System.out.println("Operator test v");
        //arithmetic-operator
        int a=12;
        int b=5;
        int sum=a+b;
        int sub=a-b;
        int mul=a*b;
        int div=a/b;
        int mod=a%b;
        System.out.println("Sum of "+a+" and "+b+"= "+sum);
        System.out.println("Substraction of "+a+" and "+b+" ="+sub);
        System.out.println("Multiplacation of "+a+" and "+b+"= "+mul);
        System.out.println("Division of "+a+" and "+b+"= "+div);
        System.out.println("Modulo of "+a+" and "+b+"= "+mod);
        //math class
        System.out.println(Math.max(5,6));//math functioncan be used later
        System.out.println(Math.min(5,6));
        System.out.println(Math.random());//prints random number from 0.0 to 1.0
        
        //now if we want only integer to be printed randomly we can do that by using implicit casting
        //but the answer will always be 0 because it has fixed values from 0 to 1
          System.out.println((int)Math.random());
        // so we mul 100 in the with random value
        System.out.println((int)(Math.random()*100));
        
    //lets learn about scanner class now :- How do we get input?
    //first we nee to write
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Your age:- ");
    int gen=sc.nextInt();
    System.out.println("Your age is "+gen);
    //for string
      System.out.println("Enter Your name:- ");
      String nm=sc.next();
      System.out.println("Your name is "+nm);
    }
}

           


