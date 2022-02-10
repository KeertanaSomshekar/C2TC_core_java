package basicProgramsTakingUserInput;

import java.util.Scanner;

public class VowelsAndConsonants {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a character");
		char ch=scan.nextLine().charAt(0);
		char x=Character.toUpperCase(ch);
		
		if((x=='A' || x=='E' || x=='I' || x=='O' || x=='U')) {
			System.out.println(ch+" is vowel");
		}
		else {
			System.out.println(ch+" is consonant");
		}
	}
}
