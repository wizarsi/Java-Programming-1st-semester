import ru.ifmo.se.pokemon.*;
public class Tsareena extends Pokemon{
    public Tsareena(String name,int level){
        super(name, level);
        setType(Type.GRASS);
        setStats(72,120,98,50,98,72);
        setMove(new EnergyBall(),new SweetScent(),new PlayNice(),new Stomp());
    }
}