public class trapppingRainwater {
    public static void trappedRainwater(int buildings[]){
     System.out.println(buildings);
       int MaxNumLeft[]={};
       int MaxNumRight[]={};
       int i =0;
       for ( i = 0; i < buildings.length; i++) {
          if (buildings[i]>buildings[i+1]) {
            buildings[i] = MaxNumLeft[i];
           
          }
       }
       System.out.println(MaxNumLeft[i]);
    }
    public static void main(String[] args) {
        int buildings[]={4,2,0,6,3,2,5};
        trappedRainwater(buildings);
    }
}
