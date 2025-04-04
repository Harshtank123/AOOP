public class MyClass {

    static int count = 0;

    public MyClass() {
        count++;

    }

    static void printMessage() {
        System.out.println("Hey..!,hru?");
    }

    public static void main(String[] args) {
        MyClass.printMessage();
        MyClass M1 = new MyClass();
        MyClass M2 = new MyClass();
        System.out.println(M1.count);
    }
}
