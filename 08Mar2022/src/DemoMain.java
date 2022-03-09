
public class DemoMain {

	public static void main(String[] args) {
		Demo d1 = new Demo();
		Demo d2 = new Demo();
		
		Thread t1 = new Thread(d1);
		Thread t2 = new Thread(d2);
		t1.start();
		t2.start();
	}
}
