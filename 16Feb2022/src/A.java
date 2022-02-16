import java.util.Scanner;

public class A {
	int a=10;
	final int b=20;
	void m1() {
		a=50; 
		b=100; //value of b can't be changed because a is declared as final
		System.out.println("inside method 1");
		System.out.println("Value of a is "+a);
		System.out.println("Value of b is "+b);
	}
	
	final void m2() {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter 2 numbers");
		int x=scan.nextInt();
		int y=scan.nextInt();
		int z=x*y;
		System.out.println(z);
	}
}
