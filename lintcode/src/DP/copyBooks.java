package DP;

import java.util.Scanner;

 

/** 
 * Description:
 * 有n本书和k个抄写员。要求n本书必须连续的分配给这k个抄写员抄写。也就是说前a1本书分给第一个抄写员，
 * 接下来a2本书分给第二个抄写员，如此类推（a1,a2需要你的算法来决定）。
 * 给定n,k和每本书的页数p1,p2..pn，假定每个抄写员速度一样（每分钟1页），k个抄写员同时开始抄写，
 * 问最少需要多少时间能够将所有书全部抄写完工？
 * （提示：本题有很多种算法可以在不同的时间复杂度下解决，需要尽可能的想到所有的方法）
 * (1)DP (2)二分法
 * 
 * From: 九章算法面试题2抄书问题
 * 
 */
public class copyBooks {

	
	public static int shortestTime(int[] pages, int k) {
		if (pages.length==0) return 0;
		int[][] res=new int[k][pages.length];
		for(int i=0;i<k;i++){
			res[i][0]=pages[0];
		 
		} 
		for(int i=1;i<pages.length;i++){
			res[0][i]=res[0][i-1]+pages[i];
			System.out.print(", " + res[0][i]);
		}System.out.println("");
		for(int i=1;i<k;i++){
			int local=0; // local sum
			int pre=0; //find previous max value which need to be compared
			for(int j=i;j<pages.length;j++){
			  if (i==j){
					if  (Math.max(res[i-1][j-1],pages[j])>res[i-1][j]){
						local=0;
						pre=0;
					}else{
						local=pages[j];
						if (res[i-1][j-1]>pages[j]) pre=res[i-1][j-1];
					}
					res[i][j]=Math.min(Math.max(res[i-1][j-1],pages[j]),res[i-1][j]);
				
			  }else{
				  int tmp=0;
				  if (pre>0){ //need to compare 
					  local+=pages[j];
					  tmp=Math.max(pre, local);
					  res[i][j]=Math.min(Math.max(res[i-1][j-1],pages[j]),Math.min(tmp, res[i][j-1]+pages[j]));
				  }else{
					  res[i][j]=Math.min(Math.max(res[i-1][j-1],pages[j]),Math.min(res[i-1][j], res[i][j-1]+pages[j]));
				  }
				  if (res[i][j]==res[i-1][j]){
					  local=0; 
					  pre=0;
				  }else if (res[i][j]==Math.max(res[i-1][j-1],pages[j])){
					  if (res[i-1][j-1]>pages[j]){
						  pre=res[i-1][j-1];
						  local=pages[j];
					  }else{
						  pre=0;local=0;
					  }
				  }else{
					  if (res[i][j]==local) pre=0;
				  } 
				 
			  }
			  System.out.print(", " + res[i][j]);
			}
			System.out.println("");
		}
		return res[k-1][pages.length-1];
		 
		
	}
	
	public static void main(String[] args){
		int[] p={1,2,3,4,5,6,7,8,9};
		int[] p2={1,1,1,1,1};
		System.out.println(shortestTime(p,3));
		System.out.println("====================");
		System.out.println(shortestTime(p2,4));
	}
}