import ru.ifmo.se.pokemon.*;
public class OricorioPomPom extends Pokemon{
	public OricorioPomPom(String name,int level){
		super(name, level);
		setType(Type.ELECTRIC,Type.FLYING);
		setStats(75,70,70,98,70,93);
		setMove(new SwordsDance(),new FeatherDance(),new Hurricane(),new CalmMind());
	}
}