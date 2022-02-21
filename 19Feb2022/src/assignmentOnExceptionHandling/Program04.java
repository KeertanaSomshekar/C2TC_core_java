package assignmentOnExceptionHandling;

import java.util.Scanner;

public class Program04 {
	static void func(int a,int b) {
		System.out.println(10/a);
		int[] arr= {1, 2, 3};
		System.out.println(arr[b]);
	}
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		for(int i=0; i<3; i++) {
			try {
				func(scan.nextInt(),scan.nextInt());
			}
			catch(ArithmeticException ae){
				ae.printStackTrace();
			}
			catch(ArrayIndexOutOfBoundsException e) {
				e.printStackTrace();
			}
		}
	}
}
