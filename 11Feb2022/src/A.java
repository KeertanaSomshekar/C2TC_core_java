import java.util.Scanner;

public interface A {
	public void mul();
	public void div();
	class Method1 implements A{
		public void mul() {
			int a=10;
			int b=20;
			int c=a*b;
			System.out.println(c);
		}
		public void div() {
			int a=10;
			int b=2;
			int c=a/b;
			System.out.println(c);
		}
	}
	class Method2 implements A{
		public void mul() {
			Scanner scan=new Scanner(System.in);
			System.out.println("enter 2 numbers");
			int a=scan.nextInt();
			int b=scan.nextInt();
			int c=a*b;
			System.out.println(c);
		}
		public void div() {
			Scanner scan=new Scanner(System.in);
			System.out.println("enter 2 numbers");
			int a=scan.nextInt();
			int b=scan.nextInt();
			int c=a/b;
			System.out.println(c);
		}
	}
	class Method3 implements A{
		public void mul() {
			Scanner scan=new Scanner(System.in);
			System.out.println("enter 2 numbers");
			int a=scan.nextInt();
			int b=scan.nextInt();
			if(a==0 || b==0) {
				System.out.println("multiplication isn't possible");
			}
			else {
				int c=a*b;
				System.out.println(c);
			}
		}
		public void div() {
			Scanner scan=new Scanner(System.in);
			System.out.println("enter 2 numbers");
			int a=scan.nextInt();
			int b=scan.nextInt();
			if(b==0) {
				System.out.println("division isn't possible");
			}
			else {
				int c=a/b;
				System.out.println(c);
			}
		}	
	}
	class Demo{
		public void permit(A ref) {
			ref.mul();
			ref.div();
		}
	}
	public static void main(String[] args) {
		Method1 m1=new Method1();
		Method2 m2=new Method2();
		Method3 m3=new Method3();
		Demo d=new Demo();
		d.permit(m1);
		d.permit(m2);
		d.permit(m3);
	}
}
