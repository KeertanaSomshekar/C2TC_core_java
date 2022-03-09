import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		int x = 0, i = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter number of elements: ");
		int n = scan.nextInt();
		int a[] = new int[n];
		System.out.println("Enter all the elements:");
		for (i = 0; i < n; i++) {
			a[i] = scan.nextInt();
		}

		System.out.print("Enter the element to find:");
		int elem = scan.nextInt();
		for (i = 0; i < n; i++) {
			if (a[i] == elem) {
				x = 1;
				break;
			} else {
				x = 0;
			}
		}
		if (x == 1) {
			System.out.println("Element found at position:" + (i + 1));
		} else {
			System.out.println("Element not found");
		}
	}
}
