package equalsMethod;

class Demo {
	private static String objName = null;

	public Demo(String objName) {
		super();
		this.objName = objName;
	}

	public String getObjName() {
		return objName;
	}

	public void setObjName(String objName) {
		this.objName = objName;
	}
	
	public boolean equals(Object ob) {
		if(ob instanceof Demo) {
			Demo d = (Demo)ob;
				if(d.getObjName().equals(this.getObjName())) {
					return true;
				}
		}
		return false;
	}
}

public class Program06 {

	public static void main(String[] args) {
		Demo d1 = new Demo("Car");
		Demo d2 = new Demo("Bicycle");
		Demo d3 = new Demo("Car");
		
		System.out.println("d1 and d2 are equal: "+(d1.equals(d2)));
		System.out.println("d2 and d3 are equal: "+(d2.equals(d3)));
		System.out.println("d1 and d3 are equal: "+(d1.equals(d3)));
	}
}
