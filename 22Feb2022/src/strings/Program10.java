package strings;

public class Program10 {
	public static void main(String[] args) {
		String s1=new String("Rama");
		String s2=new String("Rama");
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