package isCentered;

import java.util.Scanner;

public class IsCentered {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int len = 1;
		Scanner sc = new Scanner(System.in);

		System.out.print(" Enter size of array ");
		len = sc.nextInt();
		// validation the array value at list has one value or not empty

		int a[] = new int[len];
		if (a.length > 0) {

			// user enter the value of array
			System.out.println("Enter all the array value: ");
			for (int i = 0; i < len; i++) {

				a[i] = sc.nextInt();

			}
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

		System.out.println(isCentered(a));
	}

	private static int isCentered(int[] a) {
		int rNum = 0;
		for (int i = 0; i < a.length; i++) {
			if (a.length == 0) {
				rNum = 0;
			} else if (a.length == 1) {
				rNum = 1;
			} else {
				if (a.length % 2 == 1) {
					int x = (a.length - 1) / 2;

					if (a[i] >= a[x]) {
					
						if ((i != x) & (a[i] == a[x])) {
							rNum = 0;

//						System.out.println(" ( the middle element " + a[x] + " is not strictly less than all other elements)");
							break;
						} else {
							rNum = 1;
							// System.out.println(" (the middle element " + a[x] + " is strictly less than
							// all other elements)");
							continue;
						}
						
					} else {
						rNum = 0;
//					System.out.println(0 + "( the middle element " + a[x] + " is not strictly less than all other elements)");
						break;
					}
				}

				else {
					rNum = 0;
//				System.out.println(0 + " (no middel element)");
					break;
				}
			}
		}
		return rNum;

	}

}
