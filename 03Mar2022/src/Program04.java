import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;

class Program04 {
	private String demo(final String key) {
		final Map<String, String> map = new HashMap<>();
		map.put("key1", "value1");
		map.put("key2", "value2");
		map.put("key3", "value3");
		map.put("key4", "value4");
		map.put("key5", "value5");
		map.put("key6", "value6");
		map.put("key7", "value7");
		
		return map.get(key);
	}
	
	@Test
	public void demo1() {
		final Program04 p04 = new Program04();
		assertNotSame(p04.demo("key1"), p04.demo("key2"));
	}
}
