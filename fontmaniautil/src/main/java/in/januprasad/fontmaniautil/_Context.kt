package `in`.januprasad.fontmaniautil

import android.content.Context
import android.graphics.Typeface
import android.support.v4.content.res.ResourcesCompat
import android.widget.TextView

fun Context.setFont(font: Font, vararg inputs: TextView) {

    val typeFace: Typeface = getTypeFace(applicationContext, font)!!
    inputs.forEach {
        it.typeface = typeFace
    }
}

fun getTypeFace(applicationContext: Context, font: Font): Typeface? {
    return when (font) {
        /**
         * ROBOTO
         */
        FontManager.ROBOTO -> getTypeFace(applicationContext, R.font.roboto_regular)
        FontManager.ROBOTO.withType(FontType.BOLD) -> getTypeFace(applicationContext, R.font.roboto_bold)
        FontManager.ROBOTO.withType(FontType.BLACK) -> getTypeFace(applicationContext, R.font.roboto_black)

        /**
         * BARLOW
         */
        FontManager.BARLOW.withType(FontType.BOLD) -> getTypeFace(applicationContext, R.font.barlow_bold)

        /**
         *
         * FIRA
         */
        FontManager.FIRA.withType(FontType.CONDENSED) -> getTypeFace(applicationContext, R.font.fira_sans_condensed)

        else -> ResourcesCompat.getFont(applicationContext, R.font.roboto_regular)!!
    }
}

fun getTypeFace(applicationContext: Context, resource: Int) = ResourcesCompat.getFont(applicationContext, resource)!!


