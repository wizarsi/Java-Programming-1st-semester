package prog;

public class LocationException extends Exception {
        public LocationException(){
            System.out.println("Нельзя поместить предметы на стол");
        }
        public void printInfo(Person person){
            System.out.println("Мама должна переместиться к " + person.getName() + " и гостям в " + person.getLocation());
        }
}

