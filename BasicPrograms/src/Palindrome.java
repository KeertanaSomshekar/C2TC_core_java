import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a string");
		String str1=scan.nextLine();
		char arr1[]=str1.toCharArray();
		char arr2[]=new char[arr1.length];
		int j=arr2.length-1;
		for(int i=0;i<=arr1.length-1;i++) {
			arr2[j]=arr1[i];
			j--;
		}
		String str2=new String(arr2);
		if(str1.equals(str2)==true) {
			System.out.println("The given string is a Palindrome");
		}
		else {
			System.out.println("The given string is not a Palindrome");
		}
	}
}
