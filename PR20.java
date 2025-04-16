abstract class Shape {
    abstract void CalArea();
}

class Triangle extends Shape {
    double base, height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    void CalArea() {
        double area = 0.5 * base * height;
        System.out.println("Triangle are is :- " + area);
    }
}

class Rectangle extends Shape {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    void CalArea() {
        double area = length * width;
        System.out.println("Rectangle area is :- " + area);
    }
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    void CalArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Circle area is :- " + area);
    }
}

public class main {
    public static void main(String[] args) {
        Shape t = new Triangle(6, 8);
        Shape r = new Rectangle(2, 2);
        Shape c = new Circle(7);

        t.CalculateArea();
        r.CalculateArea();
        c.CalculateArea();
    }
}