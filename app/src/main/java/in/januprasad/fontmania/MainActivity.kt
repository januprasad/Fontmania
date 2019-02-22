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
        setFont(FontManager.ROBOTO.withType(FontType.BOLD), text)
    }
}
