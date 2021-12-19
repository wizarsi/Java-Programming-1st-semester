import ru.ifmo.se.pokemon.*;
public class Hariyama extends Pokemon{
    public Hariyama(String name,int level){
        super(name, level);
        int h;
        if (Math.random()<=0.333)
            h = 2;
        else if (Math.random()<=0.666)
            h = 3;
        else if (Math.random()<=0.833)
            h = 4;
        else
            h =5;
        setType(Type.FIGHTING);
        setStats(144,120,60,40,60,60);
        setMove(new Swagger(),new DoubleTeam(),new ArmThrust(h), new StoneEdge());
    }
}