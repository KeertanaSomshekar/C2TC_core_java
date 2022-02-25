package strings;

public class Program9 {
	public static void main(String[] args) {
		String s1="Rama";
		char[] arr2= {'r','a','m','a'};
		String s2=new String(arr2);
		if(s1.equals(s1)) {
			System.out.println("Strings are equal");
		}
		else {
			System.out.println("strings are not equal");
		}
		if(s1.equals(s2)) {
			System.out.println("Strings are equal");
		}
		else {
			System.out.println("strings are not equal");
		}
	}
}