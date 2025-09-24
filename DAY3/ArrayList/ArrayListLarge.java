import java.util.ArrayList;
import java.util.Collections;

public class ArrayListLarge {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        
        int max = Collections.max(numbers);
        int min = Collections.min(numbers);
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
    }
}
        
