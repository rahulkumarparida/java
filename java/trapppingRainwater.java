public class trapppingRainwater {
    public static int  trappedRainwater(int buildings[]){
     System.out.println(buildings);
     // maximum number in left
       int MaxNumLeft[]=new int[buildings.length];
       MaxNumLeft[0]= buildings[0];
       for (int i = 1; i < buildings.length; i++) {
        MaxNumLeft[i]=Math.max(buildings[i], MaxNumLeft[i-1]);
        
      }
      // maximum number in right
       int MaxNumRight[]=new int[buildings.length];
       MaxNumRight[buildings.length-1] = buildings[buildings.length -1 ];     
       for (int i = buildings.length-2; i >= 0; i--) {
        MaxNumRight[i] = Math.max(buildings[i], MaxNumRight[i+1]);

       }
       // compare the values and fond the answer
       int count = 0;
       for (int i = 0; i < buildings.length; i++) {
         int waterlevel = Math.min(MaxNumLeft[i], MaxNumRight[i]);
         count += waterlevel - buildings[i];
       }
      
      return count;
    }
    public static void main(String[] args) {
        int buildings[]={4,2,0,6,3,2,5};
        System.out.println(trappedRainwater(buildings));
    }
}
