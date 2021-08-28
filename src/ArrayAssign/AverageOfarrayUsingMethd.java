package ArrayAssign;

public class AverageOfarrayUsingMethd {
	public static int average(int a[], int n) {
		int sum = 0;

		for (int i = 0; i < n; i++)
			sum = sum + a[i];

		return (int) sum / n;

	}

	public static double average(double b[], int n) {
		int sum = 0;

		for (int i = 0; i < n; i++)
			sum = (int) (sum + b[i]);

		return (double) sum / n;

	}

	public static void main(String[] args) {

		int arr[] = { 10, 2, 3, 4, 5, 6, 7, 8, 9 };
		int n = arr.length;
		System.out.println(n);
	}
}
