/**
 * Linearsearch
 */
public class Linearsearch {
    public static int linearsearch(int num[] , int search){
        for ( int i = 0; i < num.length; i++) {
            if (num[i] == search) {
                return i;
            }
        }
        return -1;
    }
    // do a linear search operation using string
    public static String linearinString(String fruits[] , String eat){
        for (int i = 0; i < fruits.length; i++) {
             if (fruits[i] == eat) {
                System.out.println(i + " is the index number of the element searched " + eat);          
                System.out.println((i+1) + " is the Position number of the element searched "  + eat);

                 return "yes";   
             }
        }

        return "No";
    }
    public static void main(String[] args) {
        int num[]={2,4,6,8,10,12,14,16};
        int search = 10;
        int index = linearsearch(num, search);
        if (index == -1) {
            System.out.println("NUmber Does not exist");
        }
        else{
        System.out.println("Number is at Index " + index);
        System.out.println(" And in Position " + (index+1) );
        }
 // do a linear search operation using string
        String fruits[] = {"Mango" , "Apple" ,"Pineapple" , "Avacado" , "Lichhi"};
        String eat = "Pineapple";

        linearinString(fruits, eat);


    }
}