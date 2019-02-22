package in.januprasad.fontmaniautil;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        Font font = FontManager.ROBOTO.withType(FontType.BOLD);
        Font font2 = FontManager.ROBOTO.withType(FontType.REGULAR);
        System.out.println(font.getType());
        System.out.println(font2.getType());
    }
}