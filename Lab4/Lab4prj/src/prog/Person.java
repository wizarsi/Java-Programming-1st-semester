package prog;
import java.util.Objects;

public class Person {
    private String name;
    private boolean isMale;
    private Location location;

    public Person(String name, boolean isMale, Location location){
        this.name = name;
        this.isMale = isMale;
        this.location = location;
    }

    private class SuperPower{
        private boolean isFly = false;
        public SuperPower(boolean isFly){
            this.isFly = isFly;
        }
        public boolean getIsFly() {
            return isFly;
        }
        public void printSuperPowerInfo() {
            if (getIsFly()) {
                System.out.println(getName() + " умеет летать");
            } else {
                System.out.println(getName() + " имеет скрытые способности");
            }
        }
    }

    public void creatSuperPower(boolean isFly){
        SuperPower power = new SuperPower(isFly);
        power.printSuperPowerInfo();
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public void wait(Person person){
        System.out.println(getName() + " ждал " + person.getName());
    }

    public void discuss(String about){
        System.out.println(getName() + " размышлял о " + about);
    }

    public void belive(String about){
        System.out.println(getName() + " поверил в то, что " + about);
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Location getLocation() {
        return location;
    }

    public void printLocation(){
        System.out.println(getName() + " находится в " + location);
    }

    public void angry(String about){
        System.out.println(getName()+" рассердился на себя за то, что "+about);
    }
    public void enjoy(String about){
        System.out.println(getName()+" радовался, потому что "+about);
    }

    public void setIsMale(boolean isMale) {
        this.isMale = isMale;
    }
    public String getGender() {
        if(isMale == true){
            return "мужчина";
        }else{
            return "женщина";
        }
    }

    public void embrace(Person who){
        System.out.println(getName() + " горячо обнял " + who.getName());
    }

    public void hesitate(){
        System.out.println(getName() + " замялся");
    }

    public void talk(Person who, Person whoNeed){
        System.out.println(getName() + " должен рассказать " + whoNeed.getName() +", что на день рождение он пригласил " + who.getName());
    }

    public void come(Person who){
        getLocation();
        System.out.println(getName() + " пришел к " + who.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getGender(), getLocation());
    }
    @Override
    public boolean equals(Object object){
        if (object == null || object.getClass() != getClass()) {
            return false;
        }
        else{
            Person temp = (Person) object;
            return Objects.equals(name, temp.name);
        }
    }
}
