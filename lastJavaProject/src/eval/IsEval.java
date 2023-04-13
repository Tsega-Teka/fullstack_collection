package eval;

import java.util.Scanner;

public class IsEval {

	public static void main(String[] args) {
		double x=0.0;
		
		int len = 1;
		Scanner sc = new Scanner(System.in);

		//enter x value
		System.out.print(" Enter x value ");
		x=sc.nextDouble();
		
		//enter array size
		System.out.print(" Enter Number of array ");
		len = sc.nextInt();
		
		// create array with user size
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
		
		System.out.print(eval(x, a));

	}

	private static double eval(double x, int[] a) {
		double result=0.0;
		
		for (int i = 0; i < a.length; i++) {

			result +=a[i] *( Math.pow(x, i));
	
		}
	
		return result;
		
		
	}

}
