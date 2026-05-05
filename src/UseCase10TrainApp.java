import java.util.ArrayList;
import java.util.List;

class BogieUC10 {
    String name;
    int capacity;

    BogieUC10(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }
}

public class UseCase10TrainApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        List<BogieUC10> bogies = new ArrayList<>();

        bogies.add(new BogieUC10("Sleeper", 72));
        bogies.add(new BogieUC10("AC Chair", 54));
        bogies.add(new BogieUC10("First Class", 24));

        int totalSeats = bogies.stream()
                .map(b -> b.capacity)
                .reduce(0, Integer::sum);

        System.out.println("Total Seating Capacity: " + totalSeats);
    }
}