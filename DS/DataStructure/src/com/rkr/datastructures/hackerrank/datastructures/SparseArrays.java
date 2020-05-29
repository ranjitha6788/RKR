package com.rkr.datastructures.hackerrank.datastructures;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SparseArrays {

	static int[] matchingStrings(String[] strings, String[] queries) {
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		for(String query: queries){
			map.put(query, 0);
			for(String string: strings){
				if(query.equals(string)){
					map.put(query, (map.get(query))+1);
				}				
			}			
			
		}	
						
		
		int[] count = new int[queries.length];
		for(int i=0;i<queries.length;i++){
			count[i] = map.get(queries[i]);
		}
		
		return count;
    }

	public static void main(String[] args) {
		
		String[] strings = new String[]{"aba","baba","aba","xzxb"};
		
		String[] queries = new String[]{"aba","xzxb","ab"};
		
		int[] res = matchingStrings(strings, queries);
		
		System.out.println(Arrays.toString(res));
		

	}

}
