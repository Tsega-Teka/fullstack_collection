package sample2;

import java.util.Scanner;

public class Sample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
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

		
		
		System.out.print(f(a));
	}

	private static int f(int[] a) {
	
		int x=0;
		int y=0;
		
		
		for (int i = 0; i < a.length; i++) {

			if(a[i]%2==1) {
				x +=a[i];
				
			}
			else if(a[i]%2==0) {
				y += a[i];
				
			}

		}
		return x-y;
		
		
		
	}

}
