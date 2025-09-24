import java.util.ArrayList;

 public class ArrayListExample {
 public static void main(String[] args) {
    ArrayList<String> fruits = new ArrayList<>();
    fruits.add("Apple");
    fruits.add("Banana");
    fruits.add("Orange");
    fruits.add("Mango");
    System.out.println("Fruits List:");

    fruits.remove("Banana");
    for (String fruit : fruits) {
    System.out.println(fruit);
 }
 }
 }