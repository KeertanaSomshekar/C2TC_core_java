
public class ThreadDemo1 {
	void validate(int income) {
		if(income > 5) {
			System.out.println("NOT ELIGIBLE");
		}
		else {
			System.out.println("ELIGIBLE");
		}
	}
	
	public static void main(String[] args) {
		ThreadDemo1 td1=new ThreadDemo1();
		td1.validate(10);
		System.out.println("Welcome");
	}
}
