public class SubArray {
    public static void subarray(int num[]){
        
        int count= 0;
        
        int Maxsum = Integer.MIN_VALUE;
        int Minsum = Integer.MAX_VALUE;
        // int TotalofSubarrays[]={};
        int sum = 0;
        for (int i = 0; i < num.length; i++) {
            for(int j= i ; j< num.length ; j++){
                sum=0;
                 for (int k = i; k<= j ; k++) {

                    //  System.out.print(num[k]+" " );
                     sum += num[k];    
                 }
                 count++;
                 //sum of sub arrays
                
                System.out.print("  " + sum);
                if(Maxsum < sum){
                    Maxsum=sum;
                }
                if(Minsum > sum){
                    Minsum = sum;
                }
        
                // total.add()=TotalofSubarrays[];
                //  System.out.print(" , ");
               
               

            }
          
            System.out.println(); 
         
            
        }
        System.out.println("Max NUmmber is " + Maxsum);
        System.out.println("Min Nummber is " + Minsum);
       System.out.println("Total Sub arrays is  "+ count);
       
      

    }
     public static void prefixsubarray(int num[]){
        int Maxsum = Integer.MIN_VALUE;
        int Minsum = Integer.MAX_VALUE;
     int count= 0;
     int arr[]=new int[num.length];
     int sum = 0;
     arr[0] = num[0];
     for (int i = 1; i < arr.length; i++) {
        arr[i] = arr[i-1]+num[i];
     }
     
     for (int i = 0; i < num.length; i++) {
         for(int j= i ; j< num.length ; j++){
             sum = i == 0 ? arr[j] : arr[j] - arr[i-1]; 
              
              count++;
              if(Maxsum < sum){
                Maxsum=sum;
            }
            if(Minsum > sum){
                Minsum = sum;
            }
             System.out.print("  " + sum);
            
               
             
            
            

         }
       
         System.out.println(); 
      
         
     }
     System.out.println("Max NUmmber is " + Maxsum);
     System.out.println("Min Nummber is " + Minsum);
    System.out.println("Total Sub arrays is  "+ count);
    
   


    }
    public static void main(String[] args) {
        int num[]= {2,4,6,8,10};
        subarray(num);
        prefixsubarray(num);
    }
}
