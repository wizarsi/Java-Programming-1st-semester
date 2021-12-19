package prog;

import java.util.ArrayList;
import java.util.List;

public class Vase extends Thing {
    private int maxCount;
    private List<Flower> flowers = new ArrayList<Flower>();
    public Vase(int maxFlowers){
        this.maxCount = maxFlowers;
    }
    @Override
    public boolean addContent(Person person){
        if(flowers.size()!=maxCount) {
            Flower temp = Utils.getRandomFlower();
            flowers.add(temp);
            System.out.println(person.getName()+" добваила " + temp);
            return true;
        }else{
            System.out.println("Ваза полная");
            return false;
        }
    }

    @Override
    public String getType() {
        return "ваза";
    }


}
