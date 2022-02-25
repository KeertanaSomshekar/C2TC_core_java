package strings;

public class Program4 {
	public static void main(String[] args) {
		String s1=new String("Rama");
		String s2=new String("Rama");
		if(s1==s2) {
			System.out.println("String references are equal");
		}
		else {
			System.out.println("strings references are not equal");
		}
	}
}