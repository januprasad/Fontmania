package `in`.januprasad.fontmaniautil

import `in`.januprasad.fontmaniautil.FontManager.BARLOW
import `in`.januprasad.fontmaniautil.FontManager.FIRA_SANS
import `in`.januprasad.fontmaniautil.FontManager.LAILA
import `in`.januprasad.fontmaniautil.FontManager.NOTO
import `in`.januprasad.fontmaniautil.FontManager.PLAYFAIR
import `in`.januprasad.fontmaniautil.FontManager.ROBOTO
import `in`.januprasad.fontmaniautil.FontManager.ROBOTO_CONDENSED
import `in`.januprasad.fontmaniautil.FontUtil.getType
import `in`.januprasad.tools.Logger
import android.content.Context
import android.graphics.Typeface
import android.support.v4.content.res.ResourcesCompat
import android.view.View
import android.widget.Button
import android.widget.TextView

fun Context.setFont(font: Font, vararg inputs: View) {

    val typeFace: Typeface = getTypeFace(applicationContext, font)!!
    inputs.forEach {

        //        if (it is AppCompatButton) {
//            it.typeface = typeFace
//        }
//        else if (it is AppCompatTextView) {
//            it.typeface = typeFace
//        }

        if (it is Button) {
            it.typeface = typeFace
        } else if (it is TextView) {
            it.typeface = typeFace
        }


    }
}

fun Context.getFont(font: Font) = getTypeFace(applicationContext, font)!!

fun getTypeFace(applicationContext: Context, font: Font): Typeface? {
    return when (getType(font)) {
        /**
         * ROBOTO
         */
        getType(ROBOTO) -> getTypeFace(applicationContext, R.font.roboto_regular)
        getType(ROBOTO, FontType.BOLD) -> getTypeFace(applicationContext, R.font.roboto_bold)
        getType(ROBOTO, FontType.BLACK) -> getTypeFace(applicationContext, R.font.roboto_black)


        /**
         * ROBOTO CONDENSED
         */
        getType(ROBOTO_CONDENSED) -> getTypeFace(applicationContext, R.font.roboto_condensed_regular)
        getType(ROBOTO_CONDENSED, FontType.BOLD) -> getTypeFace(applicationContext, R.font.roboto_condensed_bold)
        getType(ROBOTO_CONDENSED, FontType.LIGHT) -> getTypeFace(applicationContext, R.font.roboto_condensed_light)


        /**
         * LAILA
         */
        getType(LAILA) -> getTypeFace(applicationContext, R.font.laila_regular)
        getType(LAILA, FontType.BOLD) -> getTypeFace(applicationContext, R.font.laila_bold)
        getType(LAILA, FontType.LIGHT) -> getTypeFace(applicationContext, R.font.laila_light)


        /**
         * PLAYFAIR
         */
        getType(PLAYFAIR) -> getTypeFace(applicationContext, R.font.playfair_display_regular)
        getType(PLAYFAIR, FontType.BOLD) -> getTypeFace(applicationContext, R.font.playfair_display_bold)
        getType(PLAYFAIR, FontType.BLACK) -> getTypeFace(applicationContext, R.font.playfair_display_black)


        /**
         * NOTO
         */
        getType(NOTO) -> getTypeFace(applicationContext, R.font.noto_sans_regular)
        getType(NOTO, FontType.BOLD) -> getTypeFace(applicationContext, R.font.noto_sans_bold)


        /**
         * BARLOW
         */
        getType(BARLOW, FontType.BOLD) -> getTypeFace(applicationContext, R.font.barlow_bold)
        getType(BARLOW, FontType.LIGHT) -> getTypeFace(applicationContext, R.font.barlow_bold)
        getType(BARLOW, FontType.BLACK) -> getTypeFace(applicationContext, R.font.barlow_black)
        getType(BARLOW, FontType.EXTRA_BOLD) -> getTypeFace(applicationContext, R.font.barlow_extra_bold)
        getType(BARLOW, FontType.MEDIUM) -> getTypeFace(applicationContext, R.font.barlow_medium)
        getType(BARLOW, FontType.SEMI_BOLD) -> getTypeFace(applicationContext, R.font.barlow_semi_bold)
        getType(BARLOW, FontType.REGULAR) -> getTypeFace(applicationContext, R.font.barlow_regular)

        /**
         *
         * FIRA
         */
        getType(FIRA_SANS, FontType.CONDENSED) -> getTypeFace(applicationContext, R.font.fira_sans_condensed)
        getType(FIRA_SANS,FontType.REGULAR) -> getTypeFace(applicationContext, R.font.fira_sans_regular)
        getType(FIRA_SANS,FontType.THIN) -> getTypeFace(applicationContext, R.font.fira_sans_thin)
        getType(FIRA_SANS,FontType.LIGHT) -> getTypeFace(applicationContext, R.font.fira_sans_light)
        getType(FIRA_SANS,FontType.MEDIUM) -> getTypeFace(applicationContext, R.font.fira_sans_medium)
        getType(FIRA_SANS,FontType.BOLD) -> getTypeFace(applicationContext, R.font.fira_sans_bold)

        else -> {
            Logger.v("Font Not Available")
            ResourcesCompat.getFont(applicationContext, R.font.roboto_regular)!!
        }
    }
}

fun getTypeFace(applicationContext: Context, resource: Int) = ResourcesCompat.getFont(applicationContext, resource)!!


