import java.util.EnumMap;
import java.util.Map.Entry;
import java.util.Set;

public class Program10 {

	public static void main(String[] args) {
		EnumMap<Numbers, String> map=new EnumMap<Numbers, String>(Numbers.class);
		
		map.put(Numbers.ONE, "1");
		map.put(Numbers.TWO, "2");
		map.put(Numbers.THREE, "3");
		map.put(Numbers.FOUR, "4");
		map.put(Numbers.FIVE, "5");
		map.put(Numbers.SIX, "6");
		map.put(Numbers.SEVEN, "7");
		map.put(Numbers.EIGHT, "8");
		map.put(Numbers.NINE, "9");
		
		Set<Entry<Numbers, String>> entrySet=map.entrySet();
		for(Entry<Numbers, String> entry:entrySet) {
			System.out.println(entry.getKey()+"\t"+entry.getValue());
		}
	}
}
