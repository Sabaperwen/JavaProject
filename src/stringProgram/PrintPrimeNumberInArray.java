package stringProgram;

public class PrintPrimeNumberInArray {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		for (int i = 0; i < a.length; i++) {
			int count = 0;
			if (a[i] == 1) {
				System.out.println(a[i]);
			}
			for (int j = 1; j <= a.length; j++) {
				if (a[i] % j == 0) {
					count++;
				}
				if (count > 2) {
					break;
				}
			}
			if (count == 2) {
				System.out.println(a[i]);
			}
		}

	}
}
