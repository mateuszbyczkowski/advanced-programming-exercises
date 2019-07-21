package pl.sda.poznan;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple TagParser.
 */
public class TagParserTest {

    @Test
    public void shouldCorrectlyParseAndUpperCaseHMTML() {
        String htmlToParse = "<html>Cos tam cos tam</html>";

        String result = TagParser.parseTag(htmlToParse);

        assertEquals("<HTML>Cos tam cos tam</HTML>", result);
    }

    @Test
    public void shouldCorrectlyUpperCaseTagsWithSpaceAfterTag() {
        String htmlToParse = "< html>Cos tam cos tam< / html>";

        String result = TagParser.parseTag(htmlToParse);

        assertEquals("< HTML>Cos tam cos tam< / HTML>", result);
    }

    @Test
    public void shouldCorrectlyUpperCaseTagsWithAttributes() {
        String htmlToParse = "<html class=\"blank\">Witam serdecznie</html>";

        String result = TagParser.parseTag(htmlToParse);

        assertEquals("<HTML class=\"blank\">Witam serdecznie</HTML>", result);
    }
}
