package sample2;

import java.util.Scanner;

public class Sample1 {

	public static void main(String[] args) {

		int len = 1;
		Scanner sc = new Scanner(System.in);

		System.out.print(" Enter Number of array ");
		
		len = sc.nextInt();
		// validation the array value at list has one value or not empty
		
		int a[] = new int[len];

		// user enter the value of array
		System.out.println("Enter all the numbers:");
		for (int i = 0; i < len; i++) {

			a[i] = sc.nextInt();

		}

		// print the the array
		System.out.print("{");
		for (int i = 0; i < len - 1; i++) {

			System.out.print(a[i] + ",");

		}

		if (a.length > 0) {
			System.out.print(a[a.length - 1] + "} ");
		} else {
			System.out.print("}");
		}
		System.out.println(f(a));
	}

	private static int f(int[] a) {
		try{
			int r=0;
		
		int temp=a[0];
		int temp1=a[1];
		
		 
			
			for (int j = 1; j < a.length; j++) {
			if(temp<a[j]) {
				temp=a[j];
				
				continue;
				
			}
				
		
		}
		
		
			for (int j = 0; j < a.length; j++) {
			if(temp1<a[j] && a[j]<temp) {
				temp1=a[j];
				
				continue;
				
			}else if(temp1==temp) {
				temp1= a[0];
				continue;
			}
		
		}
			if(temp==temp1) {
				r=-1;
			}
			else {
				r = temp1;
			}
		
		//System.out.println(temp + " "+ temp1 ) ;
		return r;
		}catch (Exception e) {
			return -1;
		}
	}

}
