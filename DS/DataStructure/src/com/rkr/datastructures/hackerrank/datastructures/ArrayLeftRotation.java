package com.rkr.datastructures.hackerrank.datastructures;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayLeftRotation {

    
    static void leftRotate(int[] a, int d) {
    	System.out.println(Arrays.toString(a));
    	for(int i=0; i<d;i++){
    		int temp = a[0]; 
    		for(int j=1; j< a.length; j++){
    			a[j-1] = a[j];
    		}
    		a[a.length-1] = temp;
    		System.out.println(Arrays.toString(a));
    	}
    	
    	

    }

   
    public static void main(String[] args) throws IOException {
        
        int arrCount = 5;

        int[] arr = new int[]{41, 73, 89, 7, 10, 1, 59, 58, 84, 77, 77, 97, 58 ,1, 86, 58, 26, 10, 86, 51};

        

        leftRotate(arr, 10);
        
        for(int i=0; i<arr.length;i++){
        	System.out.print(arr[i]);
        	if(i!=arr.length-1) System.out.print(" ");
        	
        }
        System.out.println();
        System.out.println("77 97 58 1 86 58 26 10 86 51 41 73 89 7 10 1 59 58 84 77");
      
    }
}
