package com.rkr.datastructures.hackerrank.datastructures;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ArrayReverse {

    // Complete the reverseArray function below.
    static int[] reverseArray(int[] a) {
    	int[] revArray = new int[a.length];
    	int j=0;
    	for(int i=a.length-1;i>=0;i--){
    		revArray[j++] = a[i];
    	}
    	return revArray;

    }

   
    public static void main(String[] args) throws IOException {
        
        int arrCount = 5;

        int[] arr = new int[]{1,2,3,4,5};

        

        int[] res = reverseArray(arr);

        for (int i = 0; i < res.length; i++) {
           System.out.println(res[i]+" ");
        }

      
    }
}
