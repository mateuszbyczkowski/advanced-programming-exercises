package pl.sda.poznan;

import java.util.List;

public class PoorCamelCase {

    public void TransformToCamelCase(List<String> wordsInBook) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < wordsInBook.size(); i++) {
            String word = wordsInBook.get(i);
            for (int k = 0; k < word.length(); k++) {
                if (k % 2 == 0) {
                    char c = word.charAt(k);
                    String character = String.valueOf(c).toUpperCase();
                    result.append(character);
                } else {
                    char c = word.charAt(k);
                    String character = String.valueOf(c).toLowerCase();
                    result.append(character);
                }
            }
            result.append(' ');
        }

        System.out.println(result);
    }
}
