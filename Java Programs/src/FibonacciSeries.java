import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=scan.nextInt();
		int n1=0,n2=1,sum=0;
		System.out.print(n1+" "+n2);
		for(int i=3;i<=n;i++) {
			sum=n1+n2;
			n1=n2;
			n2=sum;
			System.out.print(" "+sum);
		}
	}
}
