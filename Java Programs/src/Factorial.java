import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number to find the factorial");
		int n=scan.nextInt();
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact=i*fact;
		}
		System.out.println("the factorial of "+n+" is "+fact);
	}
}
