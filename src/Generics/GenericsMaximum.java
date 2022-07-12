package Generics;

import java.util.Scanner;

public class GenericsMaximum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Finding the Maximum number from given numbers:");
		System.out.println("Enter 3 numbers: ");
		Integer x = sc.nextInt();
		Integer y = sc.nextInt();
		Integer z = sc.nextInt();
		Generics findMax=new Generics();
		System.out.println("Maxmum Number: " + findMax.maximum(x, y, z));

	}

}
