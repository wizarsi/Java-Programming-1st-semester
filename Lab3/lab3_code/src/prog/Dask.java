package prog;
import java.util.ArrayList;
import java.util.List;
public class Dask {
    private List<Thing> things = new ArrayList<Thing>();
    private int maxCount;
    public Dask(int maxCount){
        this.maxCount = maxCount;
    }
    public boolean addThing(Person person,Thing thing){
        if(things.size()!=maxCount) {
            System.out.println(person.getName() + " добавила на стол " + thing.getType());
            things.add(thing);
            return true;
        }else{
            return false;
        }
    }
}
