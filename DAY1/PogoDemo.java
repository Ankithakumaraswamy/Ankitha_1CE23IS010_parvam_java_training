class Car{
    String name;
    String model;
    int year;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Car{");
        sb.append("name=").append(name);
        sb.append(", model=").append(model);
        sb.append(", year=").append(year);
        sb.append('}');
        return sb.toString();
    }
}
public class PogoDemo{
    public static void main(String[] args) {
        Car[] cars = new Car[3];
        cars[0] = new Car();
        cars[0].setName("benz");
        cars[0].setModel("esc");
        cars[0].setYear(2020);

        cars[1] = new Car();
        cars[1].setName("audi");
        cars[1].setModel("q7");
        cars[1].setYear(2018);

        cars[2] = new Car();
        cars[2].setName("bmw");
        cars[2].setModel("x5");
        cars[2].setYear(2022);

        // Sort cars by year in ascending order using lambda
        java.util.Arrays.sort(cars, (c1, c2) -> Integer.compare(c1.getYear(), c2.getYear()));

        // Print sorted cars
        for (Car car : cars) {
            System.out.println(car);
        }
    }
}