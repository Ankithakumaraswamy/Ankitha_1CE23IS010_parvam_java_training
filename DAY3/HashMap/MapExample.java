
import java.util.HashMap;
import java.util.Map;

public class MapExample {

    public static void main(String[] args) {
        Map<Integer, String> employees = new HashMap<>();
        employees.put(101, "Alice");
        employees.put(102, "Bob");
        employees.put(103, "Charlie");
        for (Map.Entry<Integer, String> entry : employees.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }
    }
}
