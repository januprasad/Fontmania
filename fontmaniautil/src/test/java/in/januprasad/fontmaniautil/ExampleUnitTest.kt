package `in`.januprasad.fontmaniautil

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see [Testing documentation](http://d.android.com/tools/testing)
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        val font = FontManager.ROBOTO.withType(FontType.BOLD)
        println(font.type)
        val font1 = FontManager.ROBOTO.withType(FontType.CONDENSED)
        println(font1.type)
        val font2 = FontManager.ROBOTO.withType(FontType.REGULAR)
        println(font2.type)
    }
}