package assignmentOnExceptionHandling;

import java.util.Scanner;

public class Program05 {
	void validWeight(int weight) throws Exception {
		if(weight>15) {
			throw new Exception();
		}
		else {
			System.out.println("you are ready to fly");
		}
	}
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Program05 p5=new Program05();
		for(int i=0;i<2;i++) {
			try {
				p5.validWeight(scan.nextInt());
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}
	}

}
