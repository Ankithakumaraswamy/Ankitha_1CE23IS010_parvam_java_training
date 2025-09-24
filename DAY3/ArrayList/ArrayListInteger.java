import java.util.ArrayList;

public class ArrayListInteger {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        System.out.println("Numbers List:");
        numbers.removeIf(n -> n % 2 == 0); // Remove even numbers)
        for (int number : numbers) {
            System.out.println(number);
        }
    } 
}
