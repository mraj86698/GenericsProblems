package Generics;

public class Generics<T extends Comparable> {

	/**
	 * @param w taking first value
	 * @param x taking Second Value
	 * @param y taking Third Value
	 * @param z taking Fourth Value
	 * @return returning the result which is maximum
	 */
	public static <T extends Comparable<T>> T toPrintMax(T w, T x, T y, T z) {

		T max = w;
		if (x.compareTo(max) > 0)
			max = x;
		if (y.compareTo(max) > 0)
			max = y;
		if (z.compareTo(max) > 0)
			max = z;
		return max;
	}

	public static <T> void printMax(T w, T x, T y, T z, T max) {
		System.out.println(max);
	}

}
