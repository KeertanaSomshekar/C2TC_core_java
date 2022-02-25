package assignment;

public class Program05 {

	public static void main(String[] args) {
		try {
			System.out.println(4/2);
			System.out.println(4/0);
			System.out.println("end of try!!");
			System.out.println(4/0); //will not get printed
		}
		catch(ArithmeticException e) {
			System.out.println("can't divide by 0");
		}
	}
}
