package Recursive;

import java.util.ArrayList;

public class NQueens2 {
    static int res=0;
    public static int totalNQueens(int n) {
        if (n<=1) return n;
        
         helper(0,n, new ArrayList<Integer>());
        return res;
    }
    
    public static void helper(int row,int len,  ArrayList<Integer> sol){
        if (row==len){
        	System.out.println(sol);
             res++;
            return;
        }else{
        for(int i=0;i<len;i++){
            if (isValid(row,i,sol)){
                sol.add(i);
                helper(row+1,len, sol);
                sol.remove(sol.size()-1);
            }
        }
        }
        
    }
    
    public static boolean isValid(int row, int col, ArrayList<Integer> sol){
        if (sol.size()==0) return true;
        for(int i=0;i<sol.size();i++){
            int pos=sol.get(i);
            if (Math.abs(pos-col)==(row-i)||col==pos){
                return false;
            } 
        }
        return true;
    }
    
    public static void main(String[] args){
    	System.out.println(totalNQueens(5));
    }
}
