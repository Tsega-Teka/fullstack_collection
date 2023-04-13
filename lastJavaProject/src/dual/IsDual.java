package dual;

import java.util.Scanner;

public class IsDual {

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
		System.out.println(isDual(a));
	}

	private static int isDual(int[] a) {
		int rNum = 0;
		int sum[] = new int[a.length / 2];
		int i = 0;
		int x = a.length;

		if (x % 2 == 0) {

			for (int j = 0; j < sum.length; j++) {
				sum[j] = a[i] + a[i + 1];
				i += 2;

			}

			if (sum.length == 0) {

				rNum = 1;

			} else {
				for (int k = 0; k < sum.length; k++) {
					if (sum[0] == sum[k]) {

						rNum = 1;

					} else {
						rNum = 0;
					}
				}
			}
		} else {
			rNum = 0;
		}

		return rNum;

	}

}
