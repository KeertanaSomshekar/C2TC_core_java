package assignment;

public class Program02 {

	public static void main(String[] args) throws ArithmeticException {
		try {
			int a=10;
			for(int i=3;i>=0;i--) {
				System.out.println(a/i);
			}
		}
		catch(ArithmeticException ae) {
			ae.printStackTrace();
		}
	}
}