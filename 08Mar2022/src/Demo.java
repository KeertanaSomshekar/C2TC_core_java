
public class Demo implements Runnable{

	@Override
	public void run() {
		try {
			int i = 0;
			while(i <= 10) {
				System.out.println(i);
				i++;
				Thread.sleep(5000);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
