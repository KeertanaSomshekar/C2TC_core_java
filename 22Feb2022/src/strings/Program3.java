package strings;

public class Program3 {
	public static void main(String[] args) {
		String s1="Rama";
		char[] arr2= {'r','a','m','a'};
		String s2=new String(arr2);
		if(s1==s2) {
			System.out.println("String references are equal");
		}
		else {
			System.out.println("strings references are not equal");
		}
	}
}