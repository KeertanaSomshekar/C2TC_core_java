package assignment;

import java.util.Scanner;

public class Program16 {
	static void func(int a,int b) throws ArithmeticException,ArrayIndexOutOfBoundsException{
		System.out.println(10/a);
		int[] arr={1,2,3};
		System.out.println(arr[b]);
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		for(int i=0;i<3;i++) {
			try {
				func(scan.nextInt(),scan.nextInt());
			}catch(ArithmeticException ae) {
				System.out.println("can't divide by 0");
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("out of bounds");
			}
		}
	}
}
