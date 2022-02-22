
public class ThreadDemo3 {
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
		System.out.println("Exception Occured");
		}
	}		
	public static void main(String[] args) {
		ThreadDemo3 td3=new ThreadDemo3();
		td3.validate(10);
		System.out.println("Welcome");
	}
}
