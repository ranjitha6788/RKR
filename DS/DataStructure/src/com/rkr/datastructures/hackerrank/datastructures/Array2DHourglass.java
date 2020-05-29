package com.rkr.datastructures.hackerrank.datastructures;

import java.util.Arrays;

public class Array2DHourglass {

	static int hourglassSum(int[][] arr) {

		int R = arr.length;
		int C = arr[0].length;

		int max_sum = 0;

		for (int i = 0; i < (R - 2); i++) {
			for (int j = 0; j < (C - 2); j++) {
				int sum = (arr[i][j] + arr[i][j + 1] + arr[i][j + 2] + arr[i + 1][j + 1] + arr[i + 2][j]
						+ arr[i + 2][j + 1] + arr[i + 2][j + 2]);
				
				if(i==0 && j==0) max_sum = sum;
				else
					max_sum = sum >= max_sum?sum:max_sum;
				
				System.out.println(arr[i][j] +" "+ arr[i][j + 1] + " "+
						arr[i][j + 2] +" "+ arr[i + 1][j + 1] +" "+ arr[i + 2][j]
						+" "+ arr[i + 2][j + 1] +" "+ arr[i + 2][j + 2]+" sum: "+
						sum+"  "+max_sum);
			}
		}

		return max_sum;

	}

	public static void main(String[] args) {
		//

		int[][] arr = new int[][] { { 1, 1, 1, 0, 0, 0 }, { 0, 1, 0, 0, 0, 0 }, { 1, 1, 1, 0, 0, 0 },
				{ 0, 0, 2, 4, 4, 0 }, { 0, 0, 0, 2, 0, 0 }, { 0, 0, 1, 2, 4, 0 } };

		System.out.println(Arrays.deepToString(arr));
		System.out.println(hourglassSum(arr));

		arr = new int[][] { { -1, -1, 0, -9, -2, -2 }, { -2, -1, -6, -8, -2, -5 }, { -1, -1, -1, -2, -3, -4 },
				{ -1, -9, -2, -4, -4, -5 }, { -7, -3, -3, -2, -9, -9 }, { -1, -3, -1, -2, -4, -5 } };
		System.out.println(Arrays.deepToString(arr));
		System.out.println(hourglassSum(arr));
		
		arr=new int[][]{{-1, 1, -1, 0, 0, 0},
			{0, -1, 0, 0, 0, 0},
			{-1, -1, -1, 0, 0, 0},
			{0, -9, 2, -4, -4, 0},
			{-7, 0, 0, -2, 0, 0},
			{0, 0, -1, -2, -4, 0}};
			System.out.println(Arrays.deepToString(arr));
			System.out.println(hourglassSum(arr));
		
	}

}
