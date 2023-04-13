package cumulative;

import java.util.Scanner;

public class IsCumulative {

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

		System.out.println(isCumulative(a));

	}

	private static int isCumulative(int[] a) {
		// TODO Auto-generated method stub
		int sum = a[0];
		int x = 0;
		if (a.length > 1) {
			for (int i = 0; i < a.length; i++) {

				if (sum == a[i]) {

					sum += a[i];
					x = 1;

				} else {
					x = 0;

				}
			}
		} else {
			x = 0;
		}

		return x;
	}

}
