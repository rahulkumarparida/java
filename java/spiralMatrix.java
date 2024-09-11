public class spiralMatrix {
    public static void spiral(int matrix[][]){
        int start_row = 0 ;
        int start_column= 0;
        int end_row = matrix.length -1;
        int end_column = matrix[0].length-1;
        while (start_row <= end_row && start_column <= end_column) {
            //top
            for (int i = start_column; i <= end_column; i++) {
                System.out.print(matrix[start_row][i]+" ");
            }
    
            //right
            for (int j = start_row+1 ; j <=end_row ; j++) {
                System.out.print(matrix[j][end_column]+" ");

            }
    
            //bottom
            for (int i = end_column-1; i >= start_column; i--) {
                System.out.print(matrix[end_row][i]+" ");
            }
    
            for (int j = end_row-1; j >= start_row; j--) {
                System.out.print(matrix[j][start_column]+" ");
            }
    
            start_row++;
            start_column++;
            end_row--;
            end_column--;             
        }
System.out.println();


    }
    public static void main(String[] args) {
        int matrix[][]= {{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};
                        spiral(matrix);
        


    }
}