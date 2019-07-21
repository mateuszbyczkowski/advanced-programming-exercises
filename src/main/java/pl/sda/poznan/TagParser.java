package pl.sda.poznan;

public class TagParser {
    public static void main(String[] args) {
        String tags = "<html>Strona internetowa</html>";
        System.out.println(parseTag(tags));
    }

    public static String parseTag(String tags) {
        boolean isUpper = false;
        StringBuilder result = new StringBuilder();

        for (char character : tags.toCharArray()) {
            if (character == '<') {
                isUpper = true;
            } else if (character == '>') {
                isUpper = false;
            }

            if (isUpper) {
                result.append(String.valueOf(character).toUpperCase());
            } else {
                result.append(character);
            }
        }
        return result.toString();
    }


}
