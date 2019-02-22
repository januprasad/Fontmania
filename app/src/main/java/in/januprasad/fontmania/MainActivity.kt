package `in`.januprasad.fontmania

import `in`.januprasad.fontmaniautil.ROBOTO
import `in`.januprasad.fontmaniautil.ROBOTO_BOLD
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
           ROBOTO(text, text2, text3)
           ROBOTO_BOLD(text4, text2)
    }
}
