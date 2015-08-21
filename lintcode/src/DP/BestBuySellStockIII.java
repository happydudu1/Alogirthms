package DP;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

 

public class BestBuySellStockIII {
    public static int maxProfit(int[] prices) {
        if (prices.length==0) return 0;
        int len=prices.length;
        int[] left=new int[len];
        int min=prices[0];
       // int[] right=new int[len];
        for(int i=1;i<len;i++){
            min=Math.min(min,prices[i]);
            left[i]=Math.max(prices[i]-min,left[i-1]);
        }  
        int max=prices[len-1];
        int diff=0;
        int res=0;
        for(int i=len-2;i>=0;i--){
            max=Math.max(prices[i],max);
            diff=Math.max(max-prices[i],diff);
            res=Math.max(left[i]+diff,res);
        }
        return res; 
   } 
   
    public static void main(String args[]){
    	int[] prices={1,2};
    	System.out.println(maxProfit(prices));
    }
}
