import ru.ifmo.se.pokemon.*;
public class Main{
	public static void main(String[] args){
		Battle b = new Battle();
		b.addAlly(new OricorioPomPom("Леня", 1));
		b.addAlly(new Bounsweet("Алексей", 2));
		b.addAlly(new Steenee("Тимур", 1));
		b.addFoe(new Tsareena("Ваня",1));
		b.addFoe(new Hariyama("Наташа", 3));
		b.addFoe(new Makuhita("Петя",1));
		b.go();
	}
}