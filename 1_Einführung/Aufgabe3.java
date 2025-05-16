import java.util.List;
public class Aufgabe3 {
    public static int calculateTipPercentage(List<String> names) {
        if (names == null || names.isEmpty()) {
            return 0;
        } else if (names.size() > 5) {
            return 20;
        } else {
            return 10;
        }
    }

    public static void main(String[] args) {
        List<String> group1 = List.of(); // keine Gruppe
        List<String> group2 = List.of("Anna", "Ben"); // 2 Personen
        List<String> group3 = List.of("A", "B", "C", "D", "E", "F"); // 6 Personen

        System.out.println("Gruppe 1: " + calculateTipPercentage(group1) + "%");
        System.out.println("Gruppe 2: " + calculateTipPercentage(group2) + "%");
        System.out.println("Gruppe 3: " + calculateTipPercentage(group3) + "%");
    }

}
