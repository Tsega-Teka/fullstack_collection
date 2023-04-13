package layered;

import java.util.Arrays;
import java.util.Scanner;

public class IsLayered {

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

		System.out.println(isLayered(a));

	}

	private static int isLayered(int[] a) {
		int rNum = 0; 

		for (int i = 0; i < a.length - 1; i++) {
			int j = 1;
			while( j < a.length) {

				if ( a[j] >= a[i]){
					
					rNum = 1;
					
	
				} else{
					rNum = 0;
					break;
					
				}
				j++;
		
			}
		
		}

		return rNum;

	}

}
