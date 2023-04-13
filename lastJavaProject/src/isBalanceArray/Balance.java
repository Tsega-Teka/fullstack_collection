package isBalanceArray;

import java.util.Scanner;

public class Balance {

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
		//print the the array
		System.out.print("{");
		for (int i = 0; i < len - 1; i++) {

			System.out.print(a[i] + ",");

		}if(a.length>0) {
		System.out.print(a[a.length - 1] + "} ");
		} else {
			System.out.print("}");
		}
		//call the isBalance method
		System.out.print(isBalanced(a ));

	}

	private static int isBalanced(int a[]) {
        int len= a.length;
		int ev[] = new int[len];
		int od[] = new int[len];
		int x = 0; // even length
		int y = 0; // odd length

		for (int k = 0; k < len; k++) {

			if (a[k] % 2 == 0) {
				ev[k] = a[k];
				x++;
				System.out.print("a[" + k + "]" + ", ");
				continue;
			}
		}
		if (x > 1) {
			System.out.print("are even, ");
		} else if (x == 1) {
			System.out.print(" is even.");
		}

		for (int i = 0; i < len; i++) {

			// System.out.print(a[i] + " ");
			if (a[i] % 2 == 1) {
				od[i] = a[i];
				y++;
				System.out.print("a[" + i + "]" + ",");
				continue;
			}
		}
		if (y > 1) {
			System.out.print("are odd. ");
		} else if (y == 1) {
			System.out.print(" is odd.");
		}else {
			System.out.print(" true vacuously ");
		}

		if (x == y) {
			return 1;
		} else {
			return 0;
		}

	}

}
