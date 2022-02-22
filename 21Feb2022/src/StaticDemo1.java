
class Main {
	static void func(int a) throws Exception{
		System.out.println(10/a);
	}
}

public class StaticDemo1 {
	public static void main(String[] args) {
		try {
			Main.func(10);
			Main.func(0);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
