import ru.ifmo.se.pokemon.*;
public class Steenee extends Pokemon{
    public Steenee(String name,int level){
        super(name, level);
        setType(Type.GRASS);
        setStats(52,40,48,40,48,62);
        setMove(new EnergyBall(),new SweetScent(),new PlayNice());
    }
}