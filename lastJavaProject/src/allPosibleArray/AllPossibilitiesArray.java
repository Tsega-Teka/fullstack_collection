package allPosibleArray;

import java.util.Arrays;
import java.util.Scanner;

public class AllPossibilitiesArray {

	public static void main(String[] args) {
		int value = 1;

		Scanner sc = new Scanner(System.in);

		System.out.print(" Enter Number of array ");
		value = sc.nextInt();
		// validation the array value at list has one value or not empty
		if (value != 0) {
			int a[] = new int[value];

			// user enter the value of array
			System.out.println("Enter all the numbers:");
			for (int i = 0; i < value; i++) {
				a[i] = sc.nextInt();

			}

			System.out.println(isAllPossibilities(a));
			
		} else {
			System.out.println(0);
		}

	}

	private static int isAllPossibilities(int[] a) {
		int rNum=0;
		System.out.print("{");
		for (int j = 0; j < a.length-1; j++) {
			System.out.print(a[j] + ",");
		}
		System.out.print(a[a.length-1] + "}");
		
		if (a.length > 1) {
			// sort the array to make check easily//{21034}
			Arrays.sort(a);
			// validate  the all array values are less than//01233     //01236
			// from array length
			if ( a[a.length - 1] < a.length) {
				int k = 1;
				do //{01234}  s=5
					for (int j = 0; j < a.length - 1; j++) {
						if (a[k] == a[j] + 1 & a[a.length - 1] == a[a.length - 2] + 1 ) {
							rNum=1;

						} else {
							//System.out.println("not +1");
							rNum=0;
							break;
						}

						k++;
					}
				while (k < a.length-2);
//01223

			} else {
				rNum=0;
//				System.out.println(0);
//				System.out.println("index not 0 or the array value is greaterthan length of the array");
				
			}
		} else if (a.length == 1 & a[0] == 0) {
			//System.out.println(1);
			rNum=1;

		} else {
			rNum=0;
			//System.out.println(0);
		}
		return rNum;

	}

}
