package FactoryPattern;

public class ShapeFactory {
    Shape getShape(String shapeType)
    {
        return switch (shapeType) {
            case "CIRCLE" -> new Circle();
            case "SQUARE" -> new Square();
            default -> null;
        };
    }
}
