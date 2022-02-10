import java.util.Scanner;

public class ScannerClassDemo {
	void method1() {
		System.out.println("inside method-1");
	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		ScannerClassDemo scd=new ScannerClassDemo();
		scd.method1();
		System.out.println("Enter a number");
		int n=scan.nextInt();
		System.out.println("Number entered is "+n);
	}
}
