import java.util.*;
import java.io.*;

public class SearchEngine {
    private HashMap<String, Set<String>> index = new HashMap<>();    
    public void loadDocuments(String filePath) {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            String line;

            while ((line = br.readLine()) != null) {

                String[] words = line.toLowerCase().split(" ");

                for (String word : words) {
                    index.putIfAbsent(word, new HashSet<>());
                    index.get(word).add(line);
                }
            }

        } catch (IOException e) {
            System.out.println("Error reading file");
        }
    }    
    public List<String> search(String input) {

        String[] keywords = input.toLowerCase().split(" ");
        HashMap<String, Integer> rankMap = new HashMap<>();

        for (String word : keywords) {

            Set<String> docs = index.get(word);

            if (docs != null) {
                for (String doc : docs) {
                    rankMap.put(doc, rankMap.getOrDefault(doc, 0) + 1);
                }
            }
        }
        List<Map.Entry<String, Integer>> sortedList = new ArrayList<>(rankMap.entrySet());

        sortedList.sort((a, b) -> b.getValue() - a.getValue());
        List<String> results = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : sortedList) {
            results.add(entry.getKey());
        }
        return results;
    }
}