
class Main1 {
	static void func(int a) throws Exception{
		System.out.println(10/a);
	}
}

public class StaticDemo2 extends Main1 {
	public static void main(String[] args) {
		try {
			func(10);
			func(0);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
