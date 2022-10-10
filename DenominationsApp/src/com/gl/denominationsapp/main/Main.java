package com.gl.denominationsapp.main;

import java.util.Scanner;

import com.gl.denominationsapp.transaction.Transaction;

public class Main {

	public static void main(String[] args) {
		
		Transaction transaction = new Transaction();
		Scanner scanner = new Scanner(System.in);
		int noOfDenominations;
		
		System.out.println("enter the size of currency denominations");
		noOfDenominations = scanner.nextInt();
		
		System.out.println("enter the currency denominations value");
		int array[] = new int[noOfDenominations];
		int valueOfDenominations;
		
			for(int i=0;i<noOfDenominations;i++) {
				array[i] = scanner.nextInt();
			}
		
		System.out.println("enter the amount you want to pay");
		int amount = scanner.nextInt();
			transaction.bubbleSort(array);
			transaction.noOfNotes(array,amount);

	
	
	}

}
