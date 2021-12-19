package prog;

public class They implements TheyInterface{
    private String they;
    private Location location;
    public They(String they, Location location){
        this.they=they;
        this.location = location;
    }

    public static class Consent{
        private boolean areAgree;
        public Consent(boolean areAgree){
            this.areAgree = areAgree;
        }
        public void printAreAgreeInfo(){
            if (areAgree) {
                System.out.println("Все с этим согласились");
            } else {
                System.out.println("Никто не обратил на это внимания");
            }
        }
    }

    public String getTranslation(){
        return they;
    }
    @Override
    public String toString(){
        return "Перевод на русский: " + they;
    }
    @Override
    public void singTo(Person person, String what) {
        System.out.println(getTranslation() + " спели " + person.getName() + " " + what);
    }
    public void setLocation(Location location) {
        this.location = location;
    }

    public Location getLocation() {
        System.out.println(getThey() + " находится в " + location);
        return location;
    }

    public String getThey() {
        return they;
    }
}
