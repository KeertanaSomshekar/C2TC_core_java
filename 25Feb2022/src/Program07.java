import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Program07 {
	
	public static void main(String[] args) {
		
		List<Employee> emplist=new ArrayList<>();
		
		emplist.add(new Employee(1001,"martin",90000.00,"martin@gmail.com"));
		emplist.add(new Employee(1002,"sean",95000.00,"sean@gmail.com"));
		emplist.add(new Employee(1003,"joya",30000.00,"joya@gmail.com"));
		emplist.add(new Employee(1004,"harman",50000.00,"harman@gmail.com"));
		emplist.add(new Employee(1005,"sam",40000.00,"sam@gmail.com"));
		
		Iterator<Employee> iterator=emplist.iterator();
		while(iterator.hasNext()) {
			Employee emp=iterator.next();
			if(emp.getSalary()<=40000.00) {
				iterator.remove();
				System.out.println(emp);
			}
		}
		System.out.println("---------------------------");
		Iterator<Employee> iterator2=emplist.iterator();
		while(iterator2.hasNext()) {
			Employee emp=iterator2.next();
			System.out.println(emp);
		}
		System.out.println("----------------------------");
		Iterator<Employee> iterator3=emplist.iterator();
		iterator3.forEachRemaining(System.out::println);
	}
}
