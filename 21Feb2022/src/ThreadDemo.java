
public class ThreadDemo {
	void validate(int income) {
		if(income > 5) {
			System.out.println("NOT ELIGIBLE");
		}
		else {
			System.out.println("ELIGIBLE");
		}
	}
	
	public static void main(String[] args) {
		ThreadDemo td=new ThreadDemo();
		td.validate(2);
		System.out.println("Welcome");
	}
}
