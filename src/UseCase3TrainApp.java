import java.util.HashSet;

public class UseCase3TrainApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        HashSet<String> bogieIds = new HashSet<>();

        bogieIds.add("BG101");
        bogieIds.add("BG102");
        bogieIds.add("BG103");
        bogieIds.add("BG101");

        System.out.println("Unique Bogie IDs: " + bogieIds);
    }
}