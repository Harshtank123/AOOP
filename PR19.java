interface Type{
    public void typeofcar();
}
interface Sound{
    public void makeSound();
}
class CarModel implements Type,Sound{
    public void typeofcar(){
         System.out.println("Diesel..");
    }
    public void makeSound(){
        System.out.println("Bhum bhum....");
    }
}
public class main{
    public static void main(String[] args) {
        CarModel c1 =new CarModel();
        c1.typeofcar();
        c1.makeSound();
    }
}