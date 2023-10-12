import java.util.ArrayList;
class ShapeBuilder {
    private ArrayList<Shape> shapes = new ArrayList<>();


    public void addShape(Shape s) {
        shapes.add(s);
    }

    public double getTotalArea() {
        double totalArea = 0.0;
        for (Shape shape : shapes) {
            totalArea += shape.getArea();
        }
        return totalArea;
    }
}