package `in`.januprasad.fontmaniautil

import android.content.Context
import android.graphics.Typeface
import android.support.v4.content.res.ResourcesCompat
import android.widget.TextView
import android.widget.Toast

fun Context.setFont(font: Font, vararg inputs: TextView) {

    lateinit var typeFace: Typeface
    if (font == FontManager.ROBOTO) {
        Toast.makeText(applicationContext,"Roboto",Toast.LENGTH_LONG).show()
//        typeFace = getRoboto(applicationContext, font)!!
        inputs.forEach {
            it.typeface =  getRoboto(applicationContext, font)!!
        }
    } else  Toast.makeText(applicationContext,"Something else",Toast.LENGTH_LONG).show()
}

fun getRoboto(applicationContext: Context, font: Font): Typeface? {
    return when (font) {
        FontManager.ROBOTO.withType(FontType.REGULAR) -> ResourcesCompat.getFont(
            applicationContext,
            R.font.roboto_regular
        )!!
        FontManager.ROBOTO.withType(FontType.BOLD) -> ResourcesCompat.getFont(
            applicationContext,
            R.font.roboto_bold
        )!!
        else -> ResourcesCompat.getFont(applicationContext, R.font.roboto_regular)!!
    }
}

