package com.rkr.datastructures.hackerrank.java;

import java.util.Scanner;

public class Basic {
	
	
	private static final Scanner scanner = new Scanner(System.in);
	
	private static void printScanner(){
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		scanner.close();
	}
	
	private static void ifelse(){
		int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        
        if(N%2!=0)
        	System.out.println("Weird");
        
        else if(N%2==0){
        	if((N>=2 && N<=5) || (N>20))
        		System.out.println("Not Weird");
        	else
        		System.out.println("Weird");
        }

        scanner.close();
	}
	
	private static void printScannerII(){
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		int i = scanner.nextInt();
		double d = scanner.nextDouble();
		scanner.nextLine();
		String s = scanner.nextLine();
		
		System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
		
		scanner.close();
	}

	private static void printFormatting(){
		System.out.println("================================");
        for(int i=0;i<3;i++){
            String s1=scanner.next();
            int x=scanner.nextInt();
            System.out.printf("%-15s%03d%n", s1, x);
        }
        System.out.println("================================");
	}
	
	private static void loopsI(){
		int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        
        for(int i=1;i<=10;i++){
        	System.out.println(N+" x "+i+" = "+N*i);
        }
	}
	
	public static void main(String[] args) {

		//printScanner();
		//ifelse();
		
		//printScannerII();
		//printFormatting();
		loopsI();
		
	}
		
	

}
