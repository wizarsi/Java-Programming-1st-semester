package prog;

public class Gun implements GunInterface {
    private String gun;
    public Gun(String gun){
        this.gun = gun;
    }

    public void setGun(String gun){
        this.gun = gun;
    }

    public String getGun() {
        return gun;
    }
    @Override
    public void shot(Person person){
        System.out.print(person.getName() + " выстрелил из " + getGun() + ", ");
        makeSound();
    }
    @Override
    public void makeSound() {
        System.out.println("c оглушительным треском");
    }

}
