package assignment;

public class Program03 {

	public static void main(String[] args) {
		int a=10;
		for (int i=3;i>=0;i--) {
			try {
				System.out.println(a/i);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}
