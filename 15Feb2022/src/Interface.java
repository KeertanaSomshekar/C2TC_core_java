
public interface Interface {
	final int a=10;
	void display();
}

class Demo1 implements Interface {

	@Override
	public void display() {
		System.out.println("inside display method");
	}
	
	public static void main(String[] args) {
		Demo1 d1=new Demo1();
		d1.display();
		System.out.println(a);
	}
}
