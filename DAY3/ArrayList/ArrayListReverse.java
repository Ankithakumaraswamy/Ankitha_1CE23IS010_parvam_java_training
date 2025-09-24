import java.util.ArrayList;
import java.util.Collections;

public class ArrayListReverse{
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        Collections.addAll(strings, "1", "2", "3", "4", "5");
        ArrayList<String> newStrings = new ArrayList<>();
        for (int i = strings.size()-1; i >= 0; i--) {
            newStrings.add(strings.get(i));
        }   
        for (String s : newStrings) {
            System.out.print(s+" ");
        }
    }
}