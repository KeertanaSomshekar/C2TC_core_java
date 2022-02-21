
public class multithread extends Thread{
	public void run() {
		System.out.println("current id is "+Thread.currentThread().getId());
	}
	
	public static void main(String[] args) {
		multithread mt=new multithread();
		mt.start();
	}
}
