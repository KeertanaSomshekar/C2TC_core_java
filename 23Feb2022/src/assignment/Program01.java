package assignment;

public class Program01 {

	public static void main(String[] args) throws ArithmeticException {
		try {
			System.out.println(5/0);
			System.out.println("End of Program");
		}
		catch(ArithmeticException ae) {
			ae.printStackTrace();
		}
	}
}
