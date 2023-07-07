package FactoryPattern;

public class Main {
    public static void main(String args[]){
        ShapeFactory factory=new ShapeFactory();
        Shape shape1=factory.getShape("CIRCLE");
        Shape shape2=factory.getShape("SQUARE");
        shape1.draw();
        shape2.draw();


    }
}
