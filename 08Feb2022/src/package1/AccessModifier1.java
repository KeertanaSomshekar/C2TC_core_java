package package1;

public class AccessModifier1 {
	int nos;
	float hours;
	int noc;
	
	public void dispalyStudents() {
		System.out.println("Number of Students: AccessModifier1");
	}
	
	private void displayHours() {
		System.out.println("Number of hours: AccessModifier1");
	}
	
	protected void displayClass() {
		System.out.println("Number of classes: AccessModifier1");
	}
	
	public static void main(String[] args) {
		AccessModifier1 am1=new AccessModifier1();
		AccessModifier01 am01=new AccessModifier01();
		am1.dispalyStudents();
		am01.dispalyStudents();
		
		am1.displayHours();
		am01.displayHours();
		
		am1.displayClass();
		am01.displayClass();
	}
}
