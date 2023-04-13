package sorted;

import java.util.Arrays;
import java.util.Scanner;

public class IsSorted {

	public static void main(String[] args) {

		int len = 0;
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

		System.out.println(isSorted(a));
	}

	private static int isSorted(int[] a) {
		int tem = 0;
		
		try {
			if (a.length <= 1) {
				tem = 1;
			} else {

				for (int i = 0; i < a.length - 1; i++) {

					for (int j = i + 1; j < a.length; j++) {
						if (a[i] < a[j]) {
							//System.out.println("assending");

							tem=  1;
							 

						} else {
							// System.out.println("0");
							tem= 0;
							 break ;
						}
					}
					
					
				}
			
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return tem;
	}
}
