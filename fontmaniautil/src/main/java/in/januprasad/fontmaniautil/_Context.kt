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
         * ROBOTO CONDENSED
         */
        FontManager.ROBOTO_CONDENSED -> getTypeFace(applicationContext, R.font.roboto_condensed_regular)
        FontManager.ROBOTO_CONDENSED.withType(FontType.BOLD) -> getTypeFace(applicationContext, R.font.roboto_condensed_bold)
        FontManager.ROBOTO_CONDENSED.withType(FontType.LIGHT) -> getTypeFace(applicationContext, R.font.roboto_condensed_light)


        /**
         * LAILA
         */
        FontManager.LAILA-> getTypeFace(applicationContext, R.font.laila_regular)
        FontManager.LAILA.withType(FontType.BOLD) -> getTypeFace(applicationContext, R.font.laila_bold)
        FontManager.LAILA.withType(FontType.LIGHT) -> getTypeFace(applicationContext, R.font.laila_light)


        /**
         * PLAYFAIR
         */
        FontManager.PLAYFAIR-> getTypeFace(applicationContext, R.font.playfair_display_regular)
        FontManager.PLAYFAIR.withType(FontType.BOLD) -> getTypeFace(applicationContext, R.font.playfair_display_bold)
        FontManager.PLAYFAIR.withType(FontType.BLACK) -> getTypeFace(applicationContext, R.font.playfair_display_black)


        /**
         * NOTO
         */
        FontManager.NOTO-> getTypeFace(applicationContext, R.font.noto_sans_regular)
        FontManager.NOTO.withType(FontType.BOLD) -> getTypeFace(applicationContext, R.font.noto_sans_bold)



        /**
         * BARLOW
         */
        FontManager.BARLOW.withType(FontType.BOLD) -> getTypeFace(applicationContext, R.font.barlow_bold)

        /**
         *
         * FIRA
         */
        FontManager.FIRA_SANS.withType(FontType.CONDENSED) -> getTypeFace(applicationContext, R.font.fira_sans_condensed)
        FontManager.FIRA_SANS.withType(FontType.REGULAR) -> getTypeFace(applicationContext, R.font.fira_sans_regular)
        FontManager.FIRA_SANS.withType(FontType.THIN) -> getTypeFace(applicationContext, R.font.fira_sans_thin)
        FontManager.FIRA_SANS.withType(FontType.LIGHT) -> getTypeFace(applicationContext, R.font.fira_sans_light)
        FontManager.FIRA_SANS.withType(FontType.MEDIUM) -> getTypeFace(applicationContext, R.font.fira_sans_medium)
        FontManager.FIRA_SANS.withType(FontType.BOLD) -> getTypeFace(applicationContext, R.font.fira_sans_bold)

        else -> ResourcesCompat.getFont(applicationContext, R.font.roboto_regular)!!
    }
}

fun getTypeFace(applicationContext: Context, resource: Int) = ResourcesCompat.getFont(applicationContext, resource)!!


