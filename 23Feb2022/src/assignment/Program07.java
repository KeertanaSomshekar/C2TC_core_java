package assignment;

public class Program07 {

	public static void main(String[] args) {
		try {
			System.out.println(4/0);
		}
		//super class of arithmetic exception
		catch(Exception e) {
			System.out.println("can't divide by 0");
		}

	}

}
