
public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(10.0);
        Square square = new Square(15.0);

        // Test getArea() metoderne
        System.out.println("Areal af Circle 1: " + circle.getArea());
        System.out.println("Areal af firkant 1: " + square.getArea());

        ShapeBuilder shapeBuilder = new ShapeBuilder();
        shapeBuilder.addShape(circle);
        shapeBuilder.addShape(square);

        double totalArea = shapeBuilder.getTotalArea();
        System.out.println("Det samlede areal: " + totalArea);
    }
}