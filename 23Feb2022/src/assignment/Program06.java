package assignment;

public class Program06 {

	public static void main(String[] args) {
		try {
			System.out.println(4/0);
		}
		catch(ArithmeticException e) {
			System.out.println("can't divide by 0");
		}

	}

}
