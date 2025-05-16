import java.util.List;
public class Aufgabe2 {

    public static double getDiscountPercentage(List<String> items) {
        return items.stream()
                    .anyMatch(item -> item.toLowerCase().contains("book")) ? 5.0 : 0.0;
    }

    public static void main(String[] args) {
        List<String> cart1 = List.of("Laptop", "Book - Java");
        List<String> cart2 = List.of("Laptop", "Monitor");

        System.out.println("Warenkorb 1 Rabatt: " + getDiscountPercentage(cart1) + "%");
        System.out.println("Warenkorb 2 Rabatt: " + getDiscountPercentage(cart2) + "%");
    }
    
}
