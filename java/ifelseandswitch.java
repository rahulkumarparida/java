// Online Java Compiler
// Use this editor to write, compile and run your Java code online
//satya was here         //sub-string:-to make a pariticular line stand out fromthe rest  of the string
         // Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.io.*;
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello!! Today i am learning java (aug 15 2024)");
  //if-else statements
  //for ex to check the amount of money
//   boolean sunup=true;
Scanner Sc=new Scanner(System.in);
System.out.println("The cost:");
System.out.println("1.pen= 10");
System.out.println("2.Copy= 40");
System.out.println("How much Money You have?");
int cash=Sc.nextInt();
if(cash>49)
   System.out.println("You can buy both pen and copy");
else if(cash>=40) 
   System.out.println("You can buy a copy or 4 pens");
else if(cash>=10)
System.out.println("You can buy pen");
else
System.out.println("You can buy nothing");
  //switch case
  System.out.println("give me a number from 1-7 and i will giye the day in which the number lies?");
  int day=Sc.nextInt();
  switch(day){
      case 1:
          System.out.println("1 is for Monday");
          break;
      case 2:
          System.out.println("2 is for Tuesday");
           break;
      case 3:
          System.out.println("3 is for Wednesday");
           break;
      case 4:
          System.out.println("4 is for Thursday");
           break;
      case 5:
          System.out.println("5 is for Friday");
           break;
      case 6:
          System.out.println("6 is for Saturday");
           break;
      case 7:
          System.out.println("7 is for Sunday");
           break;
      default:
          System.out.println("There are 7 days in a week idiot");
           break;
  }
  
    }
}

           