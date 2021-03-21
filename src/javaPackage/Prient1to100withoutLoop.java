package javaPackage;

public class Prient1to100withoutLoop {

	public static void main(String[] args) {

		printNos(100);

	}

	private static void printNos(int n) {

		if (n > 0) {
			printNos(n - 1);
			System.out.println(n + " ");
		}
		return;
	}
}
