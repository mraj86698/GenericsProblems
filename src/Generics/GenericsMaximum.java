package Generics;

import java.util.Scanner;

public class GenericsMaximum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Maximum of Integers is "+Generics.printMax(10,20,18));
		System.out.println("Maximum of Float is " +Generics.printMax(10.7f,20.4f,17.7f));
		System.out.println("Maximum of Three Strings is " +Generics.printMax("Mango","Banana","Cherry"));



	}

}
