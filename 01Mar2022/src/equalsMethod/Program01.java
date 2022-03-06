package equalsMethod;

public class Program01 {
	
	public static void main(String[] args) {
		int val1 = 7;
		int val2 = -3;
		int val3 = 7;
		
		if(val1 == val2) {
			System.out.println("val1 and val2 are equal");
		}else {
			System.out.println("val1 and val2 are not equal");
		}
		
		if(val3 == val2) {
			System.out.println("val2 and val 3 are equal");
		}else {
			System.out.println("val2 and val3 are not equal");
		}
	}
}
