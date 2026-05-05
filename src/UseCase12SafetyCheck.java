import java.util.ArrayList;
import java.util.List;

public class UseCase12SafetyCheck {

    // Separate class name to avoid duplicate conflicts
    static class GoodsBogie {
        String type;
        String cargo;

        GoodsBogie(String type, String cargo) {
            this.type = type;
            this.cargo = cargo;
        }

        @Override
        public String toString() {
            return type + " -> " + cargo;
        }
    }

    public static void main(String[] args) {

        System.out.println("=== Train Safety Compliance Check ===");

        // Create list of goods bogies
        List<GoodsBogie> bogies = new ArrayList<>();

        bogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        bogies.add(new GoodsBogie("Open", "Coal"));
        bogies.add(new GoodsBogie("Box", "Grain"));

        // ❌ Uncomment this to test failure case
        // bogies.add(new GoodsBogie("Cylindrical", "Coal"));

        // Display bogies
        System.out.println("Goods Bogies:");
        bogies.forEach(System.out::println);

        // Safety check using allMatch
        boolean isSafe = bogies.stream()
                .allMatch(b -> {
                    if (b.type.equalsIgnoreCase("Cylindrical")) {
                        return b.cargo.equalsIgnoreCase("Petroleum");
                    }
                    return true;
                });

        // Result
        if (isSafe) {
            System.out.println("\nTrain is SAFE for operation");
        } else {
            System.out.println("\nTrain is NOT SAFE (Invalid Cargo Detected)");
        }
    }
}