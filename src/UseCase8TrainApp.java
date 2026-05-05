import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class BogieUC8 {
    String name;
    int capacity;

    BogieUC8(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public String toString() {
        return name + " -> Capacity: " + capacity;
    }
}

public class UseCase8TrainApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        List<BogieUC8> bogies = new ArrayList<>();

        bogies.add(new BogieUC8("Sleeper", 72));
        bogies.add(new BogieUC8("AC Chair", 54));
        bogies.add(new BogieUC8("First Class", 24));

        List<BogieUC8> filtered = bogies.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());

        System.out.println("Filtered Bogies (capacity > 60):");

        for (BogieUC8 b : filtered) {
            System.out.println(b);
        }
    }
}