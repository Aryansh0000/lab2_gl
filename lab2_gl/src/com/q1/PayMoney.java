package com.q1;
import java.util.Scanner;

public class PayMoney {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] arr;
		int sum = 0;
		
		
		
		System.out.println("Enter the size of transaction array");
		int size=sc.nextInt();
		arr= new int[size];
		System.out.println("Enter the values of array");
		for(int i=0;i<size;i++)
			arr[i]=sc.nextInt();
		System.out.println("Enter the total no of targets that needs to be achieved");
		int target=sc.nextInt();
		for(int j=0;j<target;j++) {
		System.out.println("Enter the value of target");
		int value=sc.nextInt();
		
			for(int i=0;i<size;i++) {
				sum= sum+arr[i];
				if(sum>=value) {
					System.out.println("Target achieved after "+(i+1)+" transactions");
					break;}
			}
			if(sum<value)
				System.out.println("Target not achieved");
		}
		sc.close();
} }
