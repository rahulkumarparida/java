public class Binarysearch {
    
    public static int binarysearch(int num[],int search){
        int start = 0 , end = num.length - 1 ;
        
        while (start<= end) {
            int mid = (start +end)/2;
            if(num[mid]==search){
                return mid+1; 
            }
            if(num[mid] < search){
                start = mid +1;
            }
            else{
                end = mid -1;
            }

        }
        return -1;
    
    }

    public static void main(String[] args) {
        int num[]= {1,3,2,5,7,9,11,13,15,17,19};
        int search= 15;
        System.out.println("Th position of the number is "+binarysearch(num, search));

    }
    
}
