import ru.ifmo.se.pokemon.*;

class Hurricane extends SpecialMove{
    public Hurricane(){
        super(Type.FLYING,120,70);
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        if (Math.random() <= 0.3) Effect.confuse(p);
    }

    @Override
    protected String describe() {
        return " атакует, используя Hurricane, которая наносит урон и имеет 30% шанс сбить с толку";
    }
}

class SwordsDance extends  StatusMove{
    public SwordsDance(){
        super(Type.NORMAL,0,0);
    }

    @Override
    protected void applySelfEffects(Pokemon p){
        p.setMod(Stat.ATTACK,2);
    }

    @Override
    protected String describe() {
        return " атакует, используя Swords Dance, которая повышает Атаку пользователя на две ступени";
    }
}

class FeatherDance extends  StatusMove{
    public FeatherDance(){
        super(Type.FLYING,0,100);
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        p.setMod(Stat.ATTACK,-2);
    }

    @Override
    protected String describe() {
        return " атакует, используя Feather Dance, которая снижает атаку цели на два уровня";
    }
}

class CalmMind extends  StatusMove{
    public CalmMind(){
        super(Type.PSYCHIC,0,0);
    }

    @Override
    protected void applySelfEffects(Pokemon p){
        p.setMod(Stat.SPECIAL_ATTACK,1);
        p.setMod(Stat.SPECIAL_DEFENSE,1);
    }

    @Override
    protected String describe() {
        return " атакует, используя Calm Mind, которая повышает специальную атаку и особую защиту пользователя на один уровень каждый";
    }
}

class Swagger extends  StatusMove{
    public Swagger(){
        super(Type.NORMAL,0,90);
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        p.setMod(Stat.ATTACK,2);
        Effect.confuse(p);
    }

    @Override
    protected String describe() {
        return " атакует, используя Swagger, которая повышает атаку противника на две ступени и сбивает его с толку";
    }
}

class DoubleTeam extends  StatusMove{
    public DoubleTeam(){
        super(Type.NORMAL,0,0);
    }

    @Override
    protected void applySelfEffects(Pokemon p){
        p.setMod(Stat.EVASION,1);
    }

    @Override
    protected String describe() {
        return " атакует, используя Double Team, которая повышает уклонение пользователя на одну ступень";
    }
}

class ArmThrust extends PhysicalMove{
    public ArmThrust(int h){
        super(Type.FIGHTING,15,100,0,h);
    }

    @Override
    protected String describe() {
        return " атакует, используя Arm Thrust, которая срабатывает 2-5 раз. Она имеет 33.3% шанс ударить 2 раза, 33.3% шанс ударить 3 раза, 16.7% шанс ударить 4 раз, и 16.7% шанс ударить 5 раз";
    }
}

class StoneEdge extends PhysicalMove{
    public StoneEdge(){
        super(Type.ROCK,100,90);
    }

    @Override
    protected double calcCriticalHit(Pokemon att,Pokemon def){
        return 2*0.125;
    }

    @Override
    protected String describe() {
        return " атакует, используя Stone Edge, которая имеет повышенный (12.5%) шанс критического удара";
    }
}

class EnergyBall extends SpecialMove{
    public EnergyBall(){
        super(Type.GRASS,80,100);
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        if (Math.random()<=0.1) {
            p.setMod(Stat.SPECIAL_DEFENSE,-1);
        }
    }

    @Override
    protected String describe(){
        return " атакует, используя EnergyBall, которая имеет 10% шанс понизить Специальную защиту противника";
    }
}

class SweetScent extends  StatusMove{
    public SweetScent(){
        super(Type.NORMAL,0,100);
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        p.setMod(Stat.EVASION,-1);
    }

    @Override
    protected String describe() {
        return " атакует, используя Sweet Scent,которая снижает уклонение противника на одну ступень";
    }
}

class PlayNice extends  StatusMove{
    public PlayNice(){
        super(Type.NORMAL,0,0);
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        p.setMod(Stat.ATTACK,-1);
    }

    @Override
    protected String describe() {
        return " атакует, используя Play Nice,которая снижает атаку цели на один уровень";
    }
}

class Stomp extends PhysicalMove{
    public Stomp(){
        super(Type.NORMAL,65,100);
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        if (Math.random()<=0.3)
            Effect.flinch(p);
    }
    @Override
    protected String describe() {
        return " атакует, используя Stomp,которая имеет 30% шанс заставить противника отступить";
    }
}







