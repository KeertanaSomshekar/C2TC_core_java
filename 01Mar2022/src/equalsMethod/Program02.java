package equalsMethod;

public class Program02 {

	public static void main(String[] args) {
		String s1 = new String("HELLO");
		String s2 = new String("HELLO");
		
		System.out.println("s1 and s2 are equal: "+(s1 == s2));
		System.out.println("s1 and s2 are equal: "+(s1.equals(s2)));
		
		s1 = s2;
		System.out.println("s1and s2 are equal: "+(s1 == s2));
	}
}
