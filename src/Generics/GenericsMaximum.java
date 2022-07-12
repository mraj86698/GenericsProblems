package Generics;

import java.util.Scanner;

public class GenericsMaximum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Finding the Maximum String from given Strings:");
		System.out.println("Enter the Three Strings: ");
		String x = sc.next();
		String y = sc.next();
		String z = sc.next();
		Generics findMax=new Generics();
		System.out.println("Maximum Number: " + findMax.maximum(x, y, z));

	}

}
