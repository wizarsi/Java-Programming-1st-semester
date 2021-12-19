import ru.ifmo.se.pokemon.*;
public class Makuhita extends Pokemon{
    public Makuhita(String name,int level){
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
        setStats(72,60,30,20,30,25);
        setMove(new Swagger(),new DoubleTeam(),new ArmThrust(h));
    }
}