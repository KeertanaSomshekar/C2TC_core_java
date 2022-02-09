
public class OverloadingPolymorphism {
	void addition(int a,int b,int c) {
		System.out.println("Result: "+(a+b));
	}
	
	void addition(int a,int b,double c) {
		System.out.println("Result: "+(a+b+c));
	}
	
	void addition(int a,int b,int c,int d) {
		System.out.println("Result: "+(a+b+c+d));
	}
	
	public static void main(String[] args) {
		OverloadingPolymorphism op=new OverloadingPolymorphism();
		op.addition(2, 5, 5);
		op.addition(2, 4, 4.5);
		op.addition(6, 3, 8, 1);
	}
}
