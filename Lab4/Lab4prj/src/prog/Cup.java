package prog;

public class Cup extends Thing  {
    private Color color;
    private boolean isFull;
    public Cup(Color color){
        this.color = color;
    }
    @Override
    public boolean addContent(Person person){
        if(!isFull) {
            System.out.println(person.getName() + " налила чай в кружку.");
            isFull = true;
            return true;
        }else{
            System.out.println(person.getName() + " не может налить чай в кружку, потому что она полная.");
            return false;
        }
    }
    @Override
    public String getType() {
        return color + " кружка";
    }
}
