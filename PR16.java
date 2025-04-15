class A {
    public void f1(){
        System.out.println("this class A");
    }
}
class B extends A{
    public void f2(){
        System.out.println("this class B");
    }
}
class C extends A{
    public void f3(){
        System.out.println("this class C");
    }
}

public class Main{
    public static void main(String[] args) {
        B obj=new B();
        obj.f1();
        obj.f2();

        C obj2=new C();
        obj2.f1();
        obj2.f3();
    }
}
