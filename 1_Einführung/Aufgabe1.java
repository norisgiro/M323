public class Aufgabe1 {
    public static int calculateScore(String word) {
        int score = 0;
        for (char c : word.toCharArray()) {
            if (c != 'a' && c != 'A') {
                score++;
            }
        }
        return score;
    }

    public static int wordScore(String word) {
        return (int) word.chars()
                         .filter(c -> c != 'a' && c != 'A')
                         .count();
    }

    public static void main(String[] args) {
        System.out.println("Imperative:");
        System.out.println("calculateScore(\"imperative\") = " + calculateScore("imperative"));
        System.out.println("calculateScore(\"no\") = " + calculateScore("no"));

        System.out.println("\nDeklarative:");
        System.out.println("wordScore(\"declarative\") = " + wordScore("declarative"));
        System.out.println("wordScore(\"yes\") = " + wordScore("yes"));
    }
}
