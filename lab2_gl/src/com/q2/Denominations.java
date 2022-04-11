package com.q2;

import java.util.Scanner;

import com.q2.service.MergeSort;
import com.q2.service.Notes;

public class Denominations {
	
	public static void main(String args[]) {
		MergeSort mergesort = new MergeSort();
		Notes notescount = new Notes();
		System.out.println("enter the size of currency denominations ");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] notes = new int[size];
		System.out.println("enter the denominations value");
		for(int i=0; i<size ;i++) {
			notes[i]=sc.nextInt();
		}
		System.out.println("enter the amount you want to pay");
		int amount = sc.nextInt();
		mergesort.sort(notes,0,notes.length-1);
		notescount.notescountimplementation(notes,amount);
		sc.close();
		
	}

}
