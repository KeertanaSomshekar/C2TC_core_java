
public class ThreadDemo4 {
	void validate(int income) {
		try {
		if(income > 5) {
			throw new ArithmeticException("NOT ELIGIBLE");
		}
		else {
			System.out.println("ELIGIBLE");
		}
	}
	catch(ArithmeticException ae) {
		ae.printStackTrace();
		}
	}		
	public static void main(String[] args) {
		ThreadDemo4 td4=new ThreadDemo4();
		td4.validate(10);
		System.out.println("Welcome");
	}
}
