package pl.sda.poznan;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PoorCamelCaseTest {

    @Test
    public void transformPanTadeuszToCamelCase() {
        File file = new File("C:\\Users\\MateuszByczkowski\\Documents\\SDA\\JVM\\gctests\\test.txt");

        List<String> wordsInBook = new ArrayList<>();

        try {
            String st;
            BufferedReader br = new BufferedReader(new FileReader(file));
            while ((st = br.readLine()) != null) {
                String[] wordsInLine = st
                        .trim()
                        .toLowerCase()
                        .replace(",", " ")
                        .replace("!", " ")
                        .replace(".", " ")
                        .split(" ");

                wordsInBook.addAll(Arrays.asList(wordsInLine));
            }
        } catch (IOException e) {
            System.out.println("Problem z odczytywaniem z pliku");
            e.printStackTrace();
        }

        PoorCamelCase poorCamelCase = new PoorCamelCase();

        poorCamelCase.TransformToCamelCase(wordsInBook);
    }

    @Test
    public void transformShortText() {
        PoorCamelCase poorCamelCase = new PoorCamelCase();

        List words = new ArrayList<>();
        words.add("test");
        words.add("programu");

        poorCamelCase.TransformToCamelCase(words);
    }
}
