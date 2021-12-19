package prog;
public enum Location {
    LIVINGROOM("гостинная"), CHILDRENSROOM("детская");
    private String translation;

    Location(String translation){
        this.translation = translation;
    }

    @Override
    public String toString() {
        return translation;
    }


}
