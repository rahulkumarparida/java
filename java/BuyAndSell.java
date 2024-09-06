import java.io.*;
import java.util.*;

public class BuyAndSell {
    public static int BuyorNot(int prices[]){
         int BP = Integer.MAX_VALUE;
         int profit = 0;
         for (int j = 0; j < prices.length; j++) {
            if (BP < prices[j]) {
                int ProfitToday = prices[j] - BP ;
                profit = Math.max(ProfitToday , profit) ;
            } else{
                BP = prices[j];
            }
         }
        return profit ;
    }
    public static void main(String[] args) {
        int prices[] = {7,1,5,3,6,4};
        System.out.println(BuyorNot(prices));

    }
}
