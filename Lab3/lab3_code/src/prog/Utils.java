package prog;

public class Utils {

    public static Flower getRandomFlower() {
        int random = 1 + (int) (Math.random() * 4);
       if(random == 1){
           return Flower.ROSE;
       }
       else if(random == 2){
           return Flower.CHAMOMILE;
       }
       else{
           return Flower.CHRYSANTEMUM;
       }
    }

}