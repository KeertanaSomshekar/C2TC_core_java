import java.util.Enumeration;
import java.util.Vector;

public class Program02 {

	public static void main(String[] args) {

		Vector<Integer> vector=new Vector<>();
		vector.add(1);
		vector.add(2);
		vector.add(3);
		vector.add(4);
		vector.add(5);
		Enumeration<Integer> elements=vector.elements();
		System.out.println(vector);
	}
}
