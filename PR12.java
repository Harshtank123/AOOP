public class Shape{
    Shape(float radius){
        System.out.println("Area Circle is:- " + ((radius * radius) * 3.14));
    }
    Shape(float legnth , float width ){
        System.out.println("Area Rectangle is:- " + (legnth *width));
    }
    public static void main(String[] args) {
        Shape s1= new Shape(7.0f);
        Shape s2= new Shape(7.0f , 3.0f);
    }
}
