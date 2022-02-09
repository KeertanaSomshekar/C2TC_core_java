package package2;

public class AccessModifier2 {
	int nos;
	float hours;
	int noc;
	
	void dispalyStudents() {
		System.out.println("Number of Students: AccessModifier2");
	}
	
	void displayHours() {
		System.out.println("Number of hours: AccessModifier2");
	}
	
	void displayClass() {
		System.out.println("Number of classes: AccessModifier2");
	}

	public static void main(String[] args) {
		AccessModifier2 am2=new AccessModifier2();
		am2.dispalyStudents();
		am2.displayHours();
		am2.displayClass();
	}
}
