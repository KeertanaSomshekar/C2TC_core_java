
public class A {
	int a=2;
	int b=3;
	int c;
	
	void sum() {
		c=a+b;
		System.out.println("Result: "+c);
	}
	
	void mul(int a,double b) {
		System.out.println("Parent result of multiplication "+(a*b));
		System.out.println("HELLO CHILD");
	}
	
	void display() {
		System.out.println("hello child");
	}
	
	public static void main(String[] args) {
		A a=new A();
		a.mul(2, 5);
		B b=new B();
		b.display();
		a.display();
	}
}
