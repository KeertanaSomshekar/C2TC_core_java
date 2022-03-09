import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class StreamAPIDemo2 {

	public static void main(String[] args) {
		List<Integer> values = Arrays.asList(1, 2, 3, 4, 5, 6);

		values.forEach(new Consumer<Integer>() {
			public void accept(Integer i) {
				System.out.println(i);
			}
		});
		values.forEach(i -> doubleIt(i));

	}

	public static void doubleIt(int i) {
		System.out.println(i * 2);
	}
}
