import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class BogieUC9 {
    String name;
    int capacity;

    BogieUC9(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public String toString() {
        return name + " (" + capacity + ")";
    }
}

public class UseCase9TrainApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        List<BogieUC9> bogies = new ArrayList<>();

        bogies.add(new BogieUC9("Sleeper", 72));
        bogies.add(new BogieUC9("AC Chair", 54));
        bogies.add(new BogieUC9("Sleeper", 72));
        bogies.add(new BogieUC9("First Class", 24));
        bogies.add(new BogieUC9("AC Chair", 54));

        Map<String, List<BogieUC9>> grouped =
                bogies.stream()
                        .collect(Collectors.groupingBy(b -> b.name));

        System.out.println("Grouped Bogies:");

        for (String key : grouped.keySet()) {
            System.out.println(key + " -> " + grouped.get(key));
        }
    }
}