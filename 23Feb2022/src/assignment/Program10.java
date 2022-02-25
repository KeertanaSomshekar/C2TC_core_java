package assignment;

public class Program10 {
	public static void main(String[] args) {
		try {
			try {
				int[] a= {1,2,3};
				System.out.println(a[2]);
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("Out of bounds");
			}
			System.out.println(4/0);
		}
		catch(ArithmeticException ae) {
			System.out.println("Arithmetic Exception: divide by zero");
		}
	}
}

