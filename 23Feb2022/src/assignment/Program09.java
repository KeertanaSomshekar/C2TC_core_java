package assignment;

public class Program09 {

	public static void main(String[] args) {
		try {
			System.out.println(4/0);
		}catch(ArithmeticException ae) {
			System.out.println("can't divide by 0");
		}catch(Exception e) {
			System.out.println("can't divide by 0");
		}
	}
}
