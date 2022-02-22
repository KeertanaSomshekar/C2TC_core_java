
public class ThreadDemo2 {
	void validate(int income) {
		if(income > 5) {
			throw new ArithmeticException("NOT ELIGIBLE");
		}
		else {
			System.out.println("ELIGIBLE");
		}
	}
	
	public static void main(String[] args) {
		ThreadDemo2 td2=new ThreadDemo2();
		td2.validate(10);
		System.out.println("Welcome");
	}
}
