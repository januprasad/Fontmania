package `in`.januprasad.fontmania

import `in`.januprasad.fontmaniautil.FontManager
import `in`.januprasad.fontmaniautil.FontType
import `in`.januprasad.fontmaniautil.setFont
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        /**
         * Test Laila
         */
//        setFont(FontManager.LAILA.withType(FontType.BOLD), text1)
//        setFont(FontManager.LAILA.withType(FontType.LIGHT), text2)
//        setFont(FontManager.LAILA.withType(FontType.REGULAR), text3)


        /**
         * playfair
         */
                setFont(FontManager.PLAYFAIR.withType(FontType.BOLD), text1)
        setFont(FontManager.PLAYFAIR.withType(FontType.BLACK), text2)
        setFont(FontManager.PLAYFAIR.withType(FontType.REGULAR), text3)


        /**
         * Test FIRA SANS
         */
//        setFont(FontManager.FIRA_SANS.withType(FontType.BOLD), text1)
//        setFont(FontManager.FIRA_SANS.withType(FontType.LIGHT), text2)
//        setFont(FontManager.FIRA_SANS.withType(FontType.REGULAR), text3)
//        setFont(FontManager.FIRA_SANS.withType(FontType.THIN), text4)
//        setFont(FontManager.FIRA_SANS.withType(FontType.CONDENSED), text5)
//        setFont(FontManager.FIRA_SANS.withType(FontType.MEDIUM), text6)


        /**
         * Test BARLOW
////         */
//        setFont(FontManager.BARLOW.withType(FontType.BOLD), text1)
//        setFont(FontManager.BARLOW.withType(FontType.LIGHT), text2,button1)
//        setFont(FontManager.BARLOW.withType(FontType.REGULAR), text3)
//        setFont(FontManager.BARLOW.withType(FontType.BLACK), text4)
//        setFont(FontManager.BARLOW.withType(FontType.EXTRA_BOLD), text5)
//        setFont(FontManager.BARLOW.withType(FontType.MEDIUM), text6)

    }
}
