package in.januprasad.fontmaniautil;

public class Font {

    private FontType type;

    public Font withType(FontType type) {
        this.type = type;
        return this;
    }

    public FontType getType() {
        return type;
    }

    public Font(FontType type) {

        this.type = type;
    }

}