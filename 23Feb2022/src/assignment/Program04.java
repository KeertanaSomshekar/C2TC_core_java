package assignment;

public class Program04 {

	public static void main(String[] args) {
		int a=10;
		for (int i=3;i>=0;i--) {
			try {
				System.out.println(a/i);
			}
			//System.out.println("between try and catch");
			catch(Exception e) {
				System.out.println(e);
			}
		}
	}
}
