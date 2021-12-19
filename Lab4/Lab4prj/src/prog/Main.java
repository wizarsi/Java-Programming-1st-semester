package prog;
public class Main {
    public static void main(String[] args) {
        TimeManager manager = new TimeManager(Time.MORNING);
        Person child = new Person("Малыш", true, Location.LIVINGROOM);
        Person mom = new Person("Мама", false, Location.LIVINGROOM);
        Person guest1 = new Person("гость Лёня", true, Location.LIVINGROOM);
        Person guest2 = new Person("гость Маша", false, Location.LIVINGROOM);
        Person guest3 = new Person("гость Саша", true, Location.LIVINGROOM);
        Person guest4 = new Person("гость Карласон", true, Location.ROOF) {
            @Override
            public void come(Person who) {
                printLocation();
                setLocation(Location.CHILDRENSROOM);
                System.out.println(getName() + " прилетел к " + who.getName() + " на праздник");
                printLocation();
            }
        };

        System.out.println(manager.getTime());
        guest4.creatSuperPower(true);
        They they = new They("Они", Location.LIVINGROOM);
        child.printLocation();
        child.embrace(mom);
        They.Consent consent = new They.Consent(false);
        consent.printAreAgreeInfo();
        they.getLocation();
        they.singTo(child, "\"Многие лета\"");
        Gun gun = new Gun("пистолет");
        gun.shot(child);
        child.wait(guest1);
        child.wait(guest2);
        child.wait(guest3);
        child.discuss("словах папы, что подарки могут появиться и днем");
        child.belive("свершится чудо - ему подарят собаку");
        child.angry("размечтался");
        child.enjoy("не думал о собаке");
        child.setLocation(Location.CHILDRENSROOM);
        manager.setTime(Time.NOON);
        mom.setLocation(Location.CHILDRENSROOM);
        System.out.println(manager.getTime());
        child.printLocation();
        Vase vase = new Vase(11);
        Dask dask = new Dask(4);
        try {
            if (mom.getLocation() != child.getLocation()) throw new LocationException();
            for (int i = 0; i < vase.getMaxCount(); i++) {
                vase.addContent(mom);
            }
            dask.addThing(mom, vase);
            for (int i = 0; i < 3; i++) {
                Thing temp = new Cup(Color.PINK);
                temp.addContent(mom);
                dask.addThing(mom, temp);
            }
        }catch (LocationException e) {
            e.printInfo(child);
        }
        guest1.setLocation(Location.CHILDRENSROOM);
        guest3.setLocation(Location.CHILDRENSROOM);
        guest1.come(child);
        guest3.come(child);
        child.hesitate();
        child.talk(guest4, mom);
        guest4.come(child);
    }
}