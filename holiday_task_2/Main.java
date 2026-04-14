import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        SearchEngine engine = new SearchEngine();
        engine.loadDocuments("data.txt");

        System.out.println("=== Advanced Mini Search Engine ===");

        while (true) {

            System.out.print("\nEnter search (or 'exit'): ");
            String input = sc.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Exiting...");
                break;
            }

            List<String> results = engine.search(input);

            if (results.isEmpty()) {
                System.out.println("No results found.");
            } else {
                System.out.println("Top Results:");
                for (String res : results) {
                    System.out.println("- " + res);
                }
            }
        }

        sc.close();
    }
}