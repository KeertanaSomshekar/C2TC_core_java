import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Program08 {
	
	public static void main(String[] args) {
		
		List<Employee> emplist=new ArrayList<>();
		
		emplist.add(new Employee(1001,"martin",90000.00,"martin@gmail.com"));
		emplist.add(new Employee(1002,"sean",95000.00,"sean@gmail.com"));
		emplist.add(new Employee(1003,"joya",30000.00,"joya@gmail.com"));
		emplist.add(new Employee(1004,"harman",50000.00,"harman@gmail.com"));
		emplist.add(new Employee(1005,"sam",40000.00,"sam@gmail.com"));
		
		iterateListUsingListIterator(emplist);
		addElementInListUsingListIterator(emplist);
		deleteElementInListUsingListIterator(emplist);
		replaceElementInListUsingListIterator(emplist);
		
	}
	
	private static void iterateListUsingListIterator(List<Employee> emplist) {
		
		ListIterator<Employee> listIterator=emplist.listIterator();
		System.out.println("FORWARD DIRECTION");
		while(listIterator.hasNext()) {
			Employee employee=listIterator.next();
			System.out.println(employee);
		}
		System.out.println("-------------------------------------------------------------------");
		System.out.println("BACKWARD DIRECTION");
		while(listIterator.hasPrevious()) {
			Employee employee=listIterator.previous();
			System.out.println(employee);
		}
		System.out.println("-------------------------------------------------------------------");
	}
	
	private static void addElementInListUsingListIterator(List<Employee> emplist) {
		
		ListIterator<Employee> listIterator=emplist.listIterator();
		while(listIterator.hasNext()) {
			Employee employee=listIterator.next();
			if(!employee.getName().equalsIgnoreCase("KK")) {
				listIterator.add(new Employee(1006,"KK",90000.00,"kk@gmail.com"));
				break;
			}
		}
		for(Employee employee:emplist) {
			System.out.println(employee);
		}
		System.out.println("-------------------------------------------------------------------");
	}
	
	private static void deleteElementInListUsingListIterator(List<Employee> emplist) {
	
		ListIterator<Employee> listIterator=emplist.listIterator();
		while(listIterator.hasNext()) {
			Employee employee=listIterator.next();
			if(employee.getName().equalsIgnoreCase("joya")) {
				listIterator.remove();
			}			
		}
		for(Employee employee:emplist) {
			System.out.println(employee);
		}
		System.out.println("-------------------------------------------------------------------");
	}
	
	private static void replaceElementInListUsingListIterator(List<Employee> emplist) {
		
		ListIterator<Employee> listIterator=emplist.listIterator();
		while(listIterator.hasNext()) {
			Employee employee=listIterator.next();
			if(employee.getName().equalsIgnoreCase("martin")) {
				employee.setName("martin richards");
				listIterator.set(employee);
			}
		}
		for(Employee employee:emplist) {
			System.out.println(employee);
		}
	}
}