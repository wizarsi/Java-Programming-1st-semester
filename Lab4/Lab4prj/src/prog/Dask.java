package prog;
import java.util.ArrayList;
import java.util.List;
public class Dask {
    private List<Thing> things = new ArrayList<Thing>();
    private int maxCount;
    public Dask(int maxCount){
        try{
            if (maxCount <= 0) throw new AmountException(maxCount);
            this.maxCount = maxCount;
        }catch (AmountException e){
            this.maxCount = e.getRound();
        }
    }
    public boolean addThing(Person person,Thing thing){
        if(things.size() < maxCount) {
            System.out.println(person.getName() + " добавила на стол " + thing.getType());
            things.add(thing);
            return true;
        }else{
            return false;
        }
    }
}
