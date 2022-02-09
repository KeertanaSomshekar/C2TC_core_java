package package1;

public class AccessModifier01 {
	int nos;
	float hours;
	int noc;
	
	public void dispalyStudents() {
		System.out.println("Number of Students: AccessModifier01");
	}
	
	protected void displayHours() {
		System.out.println("Number of hours: AccessModifier01");
	}
	
	protected void displayClass() {
		System.out.println("Number of classes: AccessModifier01");
	}

	public static void main(String[] args) {
		AccessModifier1 am1=new AccessModifier1();
		AccessModifier01 am01=new AccessModifier01();
		
		am1.dispalyStudents();
		am01.dispalyStudents();
		
		am01.displayHours();
		
		am1.displayClass();
		am01.displayClass();
	}
}
