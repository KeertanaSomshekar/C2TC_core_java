
public class Demo {
	protected void display() {
		System.out.println("I am inside display method");
	}
}

class A extends Demo{
	public static void main(String[] args) {
		Demo d=new Demo();
		
		//accessing protected method
		d.display();
	}
}
