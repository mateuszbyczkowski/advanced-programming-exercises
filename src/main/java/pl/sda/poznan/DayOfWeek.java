package pl.sda.poznan;

import java.util.Arrays;
import java.util.List;

public class DayOfWeek {
    public static void main(String[] args) {
        countDayOfWeek("Sob", 1200);
    }

    public static void countDayOfWeek(String currentDay, int numb) {
        List<String> daysOfWeek = Arrays.asList("Pon", "Wto", "Sro", "Czw", "Pia", "Sob", "Nie");

        //TODO add unit tests!
        daysOfWeek.forEach(day -> {
            if (day.equals(currentDay)) {
                int i = daysOfWeek.indexOf(day);
                System.out.println(daysOfWeek.get((numb + i) % 7));
            }
        });
    }
}
