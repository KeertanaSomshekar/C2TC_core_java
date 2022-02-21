class C	{
	public int count;
	public void display() {
		System.out.println("I am inside display method ");
		System.out.println("count value is "+count);
	}
}
public class Demo2 {

	public static void main(String[] args) {
		C c=new C();
		
		//accessing public variable
		c.count = 4;
		
		//accessing public method
		c.display();
	}

}
