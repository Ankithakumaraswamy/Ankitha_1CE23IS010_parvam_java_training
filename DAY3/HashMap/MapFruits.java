package HashMap;
import java.util.HashMap;
import java.util.Map;

public class MapFruits {
    public static void main(String[] args) {
        Map<String, Integer> fruitPrices = new HashMap<>();
        fruitPrices.put("Apple", 100);
        fruitPrices.put("Banana", 50);
        fruitPrices.put("Orange", 80);
        fruitPrices.put("Mango", 150);
        for (Map.Entry<String, Integer> entry : fruitPrices.entrySet()) {
            System.out.println("Fruit: " + entry.getKey() + ", Price: " + entry.getValue());
        }
    }
}
