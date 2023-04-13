package sample2;

import java.util.Scanner;

public class Sample3 {

	public static void main(String[] args) {
		int start; int len;
		int value = 1;
		Scanner sc = new Scanner(System.in);
		
		System.out.print(" Enter Number of array ");
		
		value = sc.nextInt();
		// validation the array value at list has one value or not empty
		
		char a[] = new char[value];

		// user enter the value of array
		System.out.println("Enter all the charater:");
		for (int i = 0; i < value; i++) {

			a[i] = sc.next().charAt(0);

		}

		// print the the array
		System.out.print("{");
		for (int i = 0; i < value - 1; i++) {

			System.out.print(a[i] + ",");

		}

		if (a.length > 0) {
			System.out.print(a[a.length - 1] + "} ");
		} else {
			System.out.print("}");
		}
		System.out.println("Enter a starting point");
		start=sc.nextInt();
		System.out.println("Enter a size of you would like to see from the arrray");
		len=sc.nextInt();
		
		System.out.print(f(a,  start,len));
	
		System.out.print("{");
		for (int i = start; i < len+1; i++) {

			System.out.print(a[i] + ",");

		}

		if (a.length > 0) {
			System.out.print(a[len+1] + "} ");
		} else {
			System.out.print("}");
		}
	}

	private static char[] f(char[] a, int start, int len) {
		char sp=',';
		char[] ret = new char[len+1];
		try {
			
		for (int i = start; i < len+1; i++) {
			ret[i]=a[i];
			
		}
		
		}
		catch (Exception e) {
			System.out.print("null");
		}
		System.out.print( start + " " + len+ " ");
		return ret;
	}

}
