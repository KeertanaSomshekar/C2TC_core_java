
public class Demo1 {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

class B extends Demo1 {
	public static void main(String[] args) {
		Demo1 d1=new Demo1();
		
		//accessing private variable and field from another class
		d1.setName("Java");
		System.out.println(d1.getName());
	}
}
