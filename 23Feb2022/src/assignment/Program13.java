package assignment;

public class Program13 {

	public static void main(String[] args) {
		try {
			System.out.println(4/0);
		}finally {
			System.out.println("cleaning....!!");
		}
	}
}
