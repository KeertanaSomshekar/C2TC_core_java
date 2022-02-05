import java.util.Arrays;
import java.util.Scanner;

public class SortingStrings {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a string");
		String s=scan.nextLine();
		SortingStrings ss=new SortingStrings();
		String res=ss.sortstrings(s);
		System.out.println(res);
	}
	String sortstrings(String str) {
		char[] arr=str.toCharArray();
		Arrays.sort(arr);
		return new String(arr); 
		}
}
