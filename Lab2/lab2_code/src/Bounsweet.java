import ru.ifmo.se.pokemon.*;
public class Bounsweet extends Pokemon{
    public Bounsweet(String name,int level){
        super(name, level);
        setType(Type.GRASS);
        setStats(42,30,38,30,38,32);
        setMove(new EnergyBall(),new SweetScent());
    }
}