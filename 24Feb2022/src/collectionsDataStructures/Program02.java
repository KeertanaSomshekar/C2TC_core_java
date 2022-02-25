package collectionsDataStructures;

import java.util.*;

public class Program02 {
	void Display(List<String> list) {
		Iterator<String> obj=list.iterator();
		while(obj.hasNext()) {
			System.out.println("Element is: "+obj.next());
		}
	}
	public static void main(String args[]) {
		List<String> obj1=new LinkedList<>();
		obj1.add("abc");
		obj1.add("def");
		obj1.add("ghi");
		obj1.add("jkl");
		obj1.add("mno");
		System.out.println("Element is: "+obj1);
		Program02 p2=new Program02();
		obj1.sort(null);
		p2.Display(obj1);
		System.out.println("###########################");
		Collections.reverse(obj1);
		p2.Display(obj1);
	}
}
