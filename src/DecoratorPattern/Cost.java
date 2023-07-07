package DecoratorPattern;

public class Cost {
    public static void main(String args[]){
        BasePizza pizza=new MargarhitaPizza();
        System.out.println("cost is "+ pizza.cost());

        BasePizza pizzaWithToppings=new ExtraCheese(new ExtaMushroom(pizza));

        System.out.println("Cost is "+ pizzaWithToppings.cost());

    }
}
