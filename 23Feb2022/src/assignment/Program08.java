package assignment;

public class Program08 {

	public static void main(String[] args) throws ArithmeticException {
		try {
			System.out.println(4/0);
		}catch(Exception e) {
			System.out.println("can't divide by 0");
		}
	}
}
