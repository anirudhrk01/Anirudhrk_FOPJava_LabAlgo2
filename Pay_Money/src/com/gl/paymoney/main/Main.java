package com.gl.paymoney.main;

import java.util.Scanner;

import com.gl.paymoney.transaction.Transaction;

public class Main {

	public static void main(String[] args) {
		
		Transaction transaction=new Transaction();
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the size of transaction array");
		
			int sizeOfArray=scanner.nextInt();
		
		System.out.println("enter the values of array");
		int array[]=new int[sizeOfArray];
				for(int i=0;i<sizeOfArray;i++) {
				array[i]=scanner.nextInt();
				}
		
		System.out.println("enter the total no of targets that needs to be achieved");
		int target=scanner.nextInt();
		
			for(int i=0;i<target;i++) {
				System.out.println("enter the value of target");
				int value = scanner.nextInt();
				transaction.isTargetAchievable(value,array);
			
				
			}
			
	}

}
