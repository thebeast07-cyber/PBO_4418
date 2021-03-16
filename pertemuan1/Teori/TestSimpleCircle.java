//Nama 	: Nilun Najah
//elas 	: A11.4418
//NIM 	:  A11.2019.12212
public class TestSimpleCircle {
    /** Main method */
    public static void main(String[] args) {
            // Create a circle with radius 1
            SimpleCircle circle1 = new SimpleCircle();
            System.out.println("The area of the circle of radius "
            + circle1.radius + " is " + circle1.getArea());
            // Create a circle with radius 25
            SimpleCircle circle2 = new SimpleCircle(25);
            System.out.println("The area of the circle of radius "
            + circle2.radius + " is " + circle2.getArea());
            // Create a circle with radius 125
            SimpleCircle circle3 = new SimpleCircle(125);
            System.out.println("The area of the circle of radius "
            + circle3.radius + " is " + circle3.getArea());
            // Modify circle radius
            circle2.radius = 100; // or circle2.setRadius(100)
            System.out.println("The area of the circle of radius "
            + circle2.radius + " is " + circle2.getArea());
    }
}

class SimpleCircle {
    double radius;
    SimpleCircle() {
        radius = 1;
    }
    SimpleCircle(double newRadius) {
        radius = newRadius;
    }
    double getArea() {
        return radius * radius * Math.PI;
    }
    double getPerimeter() {
        return 2 * radius * Math.PI;
    }
    void setRadius(double newRadius) {
        radius = newRadius;
    }
}