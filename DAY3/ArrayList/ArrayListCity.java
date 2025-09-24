import java.util.ArrayList;

public class ArrayListCity {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Bangalore");
        cities.add("New Delhi");
        cities.add("Chicago");
        cities.add("Houston");
        System.out.println("Cities List:");

        cities.remove("Chicago");
        for (String city : cities) {
            System.out.println(city);
        }
    }
    
}
