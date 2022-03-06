package collectionsDataStructures;

import java.util.*;

public class Program01 {
	void Display(List<String> list) {
		Iterator<String> obj = list.iterator();
		while (obj.hasNext()) {
			System.out.println("Element is: " + obj.next());
		}
	}

	public static void main(String args[]) {
		List<String> obj1 = new LinkedList<>();
		obj1.add("abc");
		obj1.add("def");
		obj1.add("ghi");
		obj1.add("jkl");
		obj1.add("mno");
		System.out.println("Element is: " + obj1);
		Program01 p1 = new Program01();
		p1.Display(obj1);
	}
}
