package equalsMethod;

public class Program03 {

	public static void main(String[] args) {
		String str1 = new String("HELLO");
		String str2 = new String("hello");
		String str3 = null;
		String str4 = "HELLO";
		
		System.out.println("str1 and str2 are equal: "+(str1.equals(str2)));
		System.out.println("str2 and str3 are equal: "+(str2.equals(str3)));
		System.out.println("str3 and str4 are equal: "+(str3.equals(str4)));
		System.out.println("str1 and str4 are equal: "+(str1.equals(str4)));

	}
}
