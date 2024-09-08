public class SelectionSort {

    public static void SelectionSortAscending(int arr[]){
      
        for (int j = 0; j < arr.length-1; j++) {
            int Min_postion = j;
            for (int i = j +1; i < arr.length; i++) {
                if (Min_postion < arr[i]) {
                    Min_postion = i;

                }
            
        }
        int temp = 0;
        temp  =arr[Min_postion];
        arr[Min_postion] = arr[j];
        arr[j] = temp;
     System.out.print(arr[j]+" ");
       
    }
    System.out.println();

}
    public static void main(String[] args) {
        int arr[] = {5,7,8,4,6,9,3,2,1,0};
        SelectionSortAscending(arr);
    }
}
