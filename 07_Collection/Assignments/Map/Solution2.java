import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Solution2 {

    public static void main(String[] args) {

        HashMap<String, String> h1 = new HashMap<>();

        h1.put("key1", "value1");
        h1.put("key2", "value2");
        h1.put("key3", "value3");

        Solution2 obj = new Solution2();

        System.out.println("Key 'key2' exists: " + obj.keyExists(h1, "key2"));
        System.out.println("Value 'value4' exists: " + obj.valueExists(h1, "value4"));

        System.out.println("Iterating through the map:");
        obj.iterating(h1);
    }

    public boolean keyExists(HashMap<String, String> h1, String key) {
        return h1.containsKey(key);
    }

    public boolean valueExists(HashMap<String, String> h1, String value) {
        return h1.containsValue(value);
    }

    public void iterating(HashMap<String, String> h1) {

        Iterator<Map.Entry<String, String>> iterator = h1.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();

            System.out.println("Key: " + entry.getKey() +
                               ", Value: " + entry.getValue());
        }
    }
}