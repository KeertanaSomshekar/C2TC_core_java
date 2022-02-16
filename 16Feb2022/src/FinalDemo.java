
public final class FinalDemo extends A{
	
	void m2() {
		System.out.println("inside method 2");
	}
	public static void main(String[] args) {
		A a=new A();
		a.m1();
		a.m2();
		B b=new B();
		b.m3();
	}
}
