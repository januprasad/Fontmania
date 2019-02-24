package `in`.januprasad.fontmaniautil

object FontUtil {
    fun getType(f: Font) = f.type
    fun getType(f: Font, type: FontType) = f.withType(type).type
}