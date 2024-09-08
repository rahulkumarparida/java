public class CountingSort {
    public static void CountingSortAscending(int arr[]){
        int large = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            large = Math.max(large, arr[i]);

        }
        int count[] = new int[large+1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }
        int j = 0;
        for (int i = 0; i < count.length; i++) {
            arr[j] =i;
            j++;
            count[i]--;
           System.out.print(count[j] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {1,4,1,3,2,4,3,7};
        CountingSortAscending(arr);
    }
}
