
abstract class Main {
	public String fname="Keertana";
	public int age=22;
	public abstract void study();
}

class Student extends Main {
	public int graduationYear = 2021;
	public void study() {
		System.out.println("Inside the study method");
	}
}

public class Demo {

	public static void main(String[] args) {
		Student s=new Student();
		System.out.println("Name: "+s.fname);
		System.out.println("Age: "+s.age);
		System.out.println("Graduation Year: "+s.graduationYear);
		s.study();
	}
}
