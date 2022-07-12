package Generics;

import java.util.Scanner;

public class GenericsMaximum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Maximum of Integers is "+Generics.toPrintMax(32,10,20,18));
		System.out.println("Maximum of Float is " +Generics.toPrintMax(20.3f,10.7f,20.4f,17.7f));
		System.out.println("Maximum of Strings is " +Generics.toPrintMax("JackFruit","Banana","Mango","Cherry"));



	}

}
