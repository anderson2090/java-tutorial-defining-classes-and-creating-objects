public class Main {
    public static void main(String[] args) {

        //Create a circle with radius 1
        Circle circle = new Circle();
        System.out.println("The are of circle of " + circle.radius + " is " + circle.getArea());

        // Create a circle with radius 25
        Circle circle2 = new Circle(25);
        System.out.println("The are of circle of " + circle2.radius + " is " + circle2.getArea());

        Circle circle3 = new Circle(125);
        System.out.println("The are of circle of " + circle3.radius + " is " + circle3.getArea());

        Circle circle4 = new Circle(100);
        System.out.println("The are of circle of " + circle4.radius + " is " + circle4.getArea());
    }
}