public class Array {
        public static void update(int mark[]) {
            for (int i = 0; i < mark.length; i++) {
                mark[i]= mark[i]+1;
            }
        }
    public static void main(String[] args) {
        //syntax of array :-    datatype  name[] = new datatype[];
      
        // int marks[]= new int[50];
       
        int mark[]={95,98,96};
    
        update(mark);
        
        for (int i = 0; i < mark.length; i++) {
            System.out.println(mark[i]);
        }
       

    }
}
