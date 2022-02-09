package package2;

import package1.AccessModifier01;;

public class AccessModifier02 extends AccessModifier01{
	int nos;
	float hours;
	int noc;
	
	public static void main(String[] args) {
		AccessModifier02 am02=new AccessModifier02();
		am02.dispalyStudents();
		am02.displayHours();
		am02.displayClass();
	}
}
