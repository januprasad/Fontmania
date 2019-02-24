package `in`.januprasad.fontmaniautil

class Font(type: FontType) {

    var type: FontType? = null
        private set
    private val INSTANCE: Font

    init {
        this.type = type
        INSTANCE = this
    }

    fun withType(type: FontType): Font {
        INSTANCE.type = type
        return INSTANCE
    }

    override fun toString(): String {
        return type.toString()
    }

}