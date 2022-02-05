import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter two numbers to add");
		int a=scan.nextInt();
		int b=scan.nextInt();
		int sum=a+b;
		System.out.println("Addition of "+a+" and "+b+" is "+sum);
	}
}
