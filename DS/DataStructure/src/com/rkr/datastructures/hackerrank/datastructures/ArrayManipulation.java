package com.rkr.datastructures.hackerrank.datastructures;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArrayManipulation {

	static long arrayManipulation(int n, int[][] queries) {
		long max = 0;
		long[] arr = new long[n];
		
		int R = queries.length;
		System.out.println(R);
		/*for(int i=0;i<R;i++){
			System.out.println(queries[i][0]+" "+queries[i][1]+" "+queries[i][2]);
			for(int j=queries[i][0]-1; j<queries[i][1];j++){
				arr[j]+=queries[i][2];
				max = arr[j] > max? arr[j]:max; 
			}
			System.out.println(Arrays.toString(arr));
		}*/
		
		/*Map<Integer, Long> map = new HashMap<Integer,Long>();
		
		for(int i=0;i<R;i++){
			for(Integer j=queries[i][0]-1; j<queries[i][1];j++){
				if(map.containsKey(j))
					map.put(j, map.get(j)+queries[i][2]);
				else
					map.put(j, new Long(0)+queries[i][2]);
			}
		}
		
		max=(Collections.max(map.values()));*/
		
		for(int i=0;i<R;i++){
			int lower = queries[i][0];
			int upper = queries[i][1];
			int sum = queries[i][2];
			
			arr[lower-1] += sum;
			if(upper < n) arr[upper] -= sum;
		}
		
		System.out.println(Arrays.toString(arr));
		
		long temp=0;

		for(int i=0;i<n;i++){
		    temp += arr[i];
		    if(temp> max) max=temp;
		}
		
		return max;

    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 8;
		int[][] queries = new int[][]{{1,2,150},{2,5,275},{3,4,325}};
		long result = arrayManipulation(n, queries);
		System.out.println(result);
	}

}


/*
 * 8 3
1 2 150
2 5 275
3 4 325

After thinking like that i also understood the logic the solution.

Let's think our summing part input like that {A B S} = {1 3 100} {2 5 150} {3 4 110} {2 4 160}

Instead of writing all elements of array we can write maximum value at just starting and ending indexes to have less writing operation. 
So, after first input row, array can be something like that.

0 100 0 100 0 0 0 0 0

But the problem is here that even we didn't write anything, value of index 2 is also 100. When we wanted to continue with second step we have to check whether 
index 2 is between indexes of first row operation or not.

Instead of doing like that we can write S value to index A and -S value to B+1, so it is still similar logic. Starting from A to B all indexes have S value and 
rest of them have less than these indexes as S as. Now the array is like that:

0 100 0 0 -100 0 0 0 0

While calculating second row, we are writing 150 to index 2 and -150 to index 6. It will be like that: 0 100 150 0 -100 0 -150 0 0

If we write array with old method, which means that all numbers calculated one, it will be: 0 100 250 250 150 150 0 0 0

It shows that value of index 2 is : 100+150 = 250. Value of index 5: 100 + 150 + (-100) = 150. So by calculating with the solution written above, 
instead of writing all numbers, we are writing changes at edge indexes.

102
 * */
