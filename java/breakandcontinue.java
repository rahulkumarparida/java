import java.util.Scanner;

/**
 * breakandcontinue
 */
public class breakandcontinue {

    public static void main(String[] args) {
        // to use break lets make program to print numbers upto what user has provided
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int n = 0;
        while (n <= num) {
            if (n==3) {
                n++;
                continue;
                
            }
            System.out.println(n);
            n++;
            // int k= n*n-num;
            //    System.out.println("The Factorial is "+k);
            if (n > num) {
                break;
            } else {
               
                continue;
            }
               
        }
        
    }
}