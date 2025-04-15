class Animal{
    public void Eating() {
        System.out.println("Eating...");
    }
}
class Dog extends Animal {
    public void Animalname() {
        System.out.println("Dog...");
    }
}

public class Main{
        public static void main(String[] args) {
          Dog D1=new Dog();
            D1.Eating();
            D1.Animalname();
        }
    }
