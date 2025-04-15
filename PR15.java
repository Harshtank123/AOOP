class A{
    public void h1()
    {
        System.out.println("this is A class");
    }
}
class B extends A{
    public void h2()
    {
        System.out.println("this is B class");
    }
}
class C extends B{
    public void h3()
    {
        System.out.println("this is C class");
    }
}
public class StudentAccount {
    public static void main(String[] args) {
        C obj=new C();
        obj.h1();
        obj.h2();
        obj.h3();
    }

}
