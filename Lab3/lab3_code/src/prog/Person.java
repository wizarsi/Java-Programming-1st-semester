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
        System.out.println(getName() + " находится в " + location);
        return location;
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
