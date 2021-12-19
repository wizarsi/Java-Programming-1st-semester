package m;
public class Main{
    public static void main(String[] args){
        Pokemon pokemon = Pokemon.create();
    }
}
class Pokemon{
    private Pokemon(){

    }
    static Pokemon create(){
        return new Pokemon();
    }
}
//Есть 2 класса покемон и Мэйн.Нужно из Мэйн получить доступ к приватному конструктору покемона