package `in`.januprasad.fontmaniautil

import android.content.Context
import android.graphics.Typeface
import android.support.v4.content.res.ResourcesCompat
import android.widget.TextView

fun Context.ROBOTO(vararg inputs: TextView) {
    inputs.forEach {
        it.typeface  = getRoboto(applicationContext, ROBOTO.REGULAR)
    }
}

fun Context.ROBOTO_BOLD(vararg inputs: TextView){
    inputs.forEach {
        it.typeface = getRoboto(applicationContext, ROBOTO.BOLD)
    }
}

fun getRoboto(applicationContext:Context , style:ROBOTO): Typeface? {
    return when (style) {
        ROBOTO.BLACK -> ResourcesCompat.getFont(applicationContext,R.font.roboto_black)!!
        ROBOTO.BOLD -> ResourcesCompat.getFont(applicationContext,R.font.roboto_bold)!!
        ROBOTO.LIGHT -> ResourcesCompat.getFont(applicationContext,R.font.roboto_light)!!
        ROBOTO.REGULAR -> ResourcesCompat.getFont(applicationContext,R.font.roboto_regular)!!
    }
}

