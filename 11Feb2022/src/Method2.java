import java.util.Scanner;

public class Method2 extends Vehicle{
	public void meth2(){
		Scanner scan=new Scanner(System.in);
		System.out.println("enter two numbers");
		int x=scan.nextInt();
		int y=scan.nextInt();
		int z=x+y;
		System.out.println(z);
	}
}
