package prog;
public enum Time{
    MORNING("утро"), NOON("полдень");
    private String translation;

    Time(String translation){
        this.translation = translation;
    }

    @Override
    public String toString() {
        return translation;
    }
}
