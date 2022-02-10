package basicProgramsTakingUserInput;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter two numbers");
		int n1=scan.nextInt();
		int n2=scan.nextInt();
		System.out.println("Enter an operator(+, -, *, /):");
		char op=scan.next().charAt(0);
		double res = 0;
		switch(op) {
		case '+': res=n1+n2;
		break;
		case '-': res=n2-n1;
		break;
		case '*': res=n1*n2;
		break;
		case '/': res=n1/n2;
		break;
		default: System.out.println("invalid");		
		}
		System.out.println(n1+" "+op+" "+n2+" = "+res);
	}
}
