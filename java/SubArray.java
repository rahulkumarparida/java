public class SubArray {
    public static void subarray(int num[]){

        int count= 0;
        int n = 0;
        int total = 0;
        int TotalofSubarrays[]={};
        int sum = 0;
        for (int i = 0; i < num.length; i++) {
            for(int j= i ; j< num.length ; j++){
                 for (int k = i; k<= j ; k++) {

                     System.out.print(num[k]+" " );
                    
                 }
                 count++;
                 //sum of sub arrays
                 sum += num[j];
                System.out.print("  " + sum);
                total = sum;
                
                 System.out.print(" , ");
             
               

            }
            sum=0;
            System.out.println(); 
         
            
        }
        System.out.println( count +" are the total numbers of subarrays");
       for (int i = 0; i < TotalofSubarrays.length; i++) {
            
        TotalofSubarrays[n]=sum;
        System.out.println(TotalofSubarrays[n]);
       }

    }
    public static void main(String[] args) {
        int num[]= {2,4,6,8,10};
        subarray(num);
    }
}
