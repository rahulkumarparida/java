public class InsertionSort {
   public static void insertionSortAscensding(int arr[]){
     
        for (int i = 0; i <= arr.length-1; i++) {
          int curr = i; 
          int  prev = i-1;
          while (prev >=0 && arr[prev] > arr[curr] ) {
             arr[prev+1] = arr[prev];
             prev--;
          }
          System.out.print(curr + " ");
           
        }
        System.out.println();
   }
    public static void main(String[] args) {
        int arr[]= {1,9,2,8,3,7,4,6,5,0};
        insertionSortAscensding(arr);
    }
}
