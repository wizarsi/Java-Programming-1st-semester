package prog;

public enum Color{
    RED("красную"),PINK("розовую"),WHITE("белую");
    private String translation;

    Color(String translation){
        this.translation = translation;
    }

    @Override
    public String toString() {
        return translation;
    }
}
