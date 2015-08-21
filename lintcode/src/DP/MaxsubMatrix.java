package DP;

/*
 * http://www.jiuzhang.com/problem/12/#
 * 初阶：数组A中有N个数，需要找到A的最大子区间，使得区间内的数和最大。即找到0<=i<=j<N，使得A[i]+A[i+1] … + A[j]最大。A中元素有正有负。

    进阶：矩阵A中有N*N个数，求A的最大的子矩阵。
    进阶：枚举最大子矩阵的上下边界x和y，将第x行到第y行每一列的数叠加成为一个数。然后就成为了一个初阶的问题。时间复杂度O(n^3)。
 */
public class MaxsubMatrix {
	
	public int maxSubMatrix(int[][] m){
		int[][] tmp=new int[m.length][m[0].length];
		//for to get sum of colum from 0-i
		
		//for loop for each row i, get all sum max for line 0-i
		
		 
	}
}
