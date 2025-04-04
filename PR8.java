public class Rectangle{
    double height;
    double weight;
    public Rectangle(double height , double weight){
        this.height = height;
        this.weight = weight;
    }
    public static void main(String[] args) {
        Rectangle R1 = new  Rectangle(66.48 , 48.73);
        System.out.println(R1.height);
        System.out.println(R1.weight);
    }
}
