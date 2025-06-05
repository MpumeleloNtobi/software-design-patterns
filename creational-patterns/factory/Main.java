public class Main {
    public static void main(String args[]) {
        ShapeInstanceFactory factoryObj = new ShapeInstanceFactory();
        Shape square = factoryObj.getShapeInstance("Square");
        Shape circle = factoryObj.getShapeInstance("Circle");
        Shape rectangle = factoryObj.getShapeInstance("Rectangle");
        square.computeArea();
        circle.computeArea();
        rectangle.computeArea();
    }
}