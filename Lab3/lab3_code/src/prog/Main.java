package prog;
public class Main {
    public static void main(String[] args) {
        TimeManager manager = new TimeManager(Time.MORNING);
        Person child = new Person("Малыш", true, Location.LIVINGROOM);
        Person mom = new Person("Мама", false, Location.LIVINGROOM);
        Person guest1 = new Person("гость Лёня", true, Location.LIVINGROOM);
        Person guest2 = new Person("гость Маша", false, Location.LIVINGROOM);
        Person guest3 = new Person("гость Саша", true, Location.LIVINGROOM);
        They they = new They("Они",Location.LIVINGROOM);
        child.getLocation();
        System.out.println(manager.getTime());
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
        child.getLocation();
        System.out.println(manager.getTime());
        Dask dask = new Dask(4);
        Thing vase =new Vase(11);
        for (int i=0;i<12;i++) {
            vase.addContent(mom);
        }
        dask.addThing(mom,vase);
        for (int i=0;i<3;i++) {
            Thing temp = new Cup(Color.PINK);
            temp.addContent(mom);
            dask.addThing(mom,temp);
        }
    }
}