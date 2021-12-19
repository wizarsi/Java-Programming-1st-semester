package prog;

public enum Flower{
    ROSE("роза"),CHAMOMILE("ромашка"),CHRYSANTEMUM("хризантема");
    private String translation;

    Flower(String translation){
        this.translation = translation;
    }

    @Override
    public String toString() {
        return translation;
    }
}
