package Generics;

public class Generics<T extends Comparable<T> >{

	/**
	 *
	 * @param x taking first Value
	 * @param y taking Second Value
	 * @param z taking Third Value
	 * @return returning the result which is maximum
	 */
	public static <T extends Comparable<T>> T printMax(T x,T y,T z) {

		T max = x;
		if (y.compareTo(max) > 0 && y.compareTo(z) > 0)
			max = y;
		else if (z.compareTo(max) > 0)
			max = z;
		return max;
	}

}
