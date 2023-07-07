package DecoratorPattern;

public class ExtraCheese extends ToppingDecorator{
    BasePizza pizza;
    public ExtraCheese(BasePizza pizza){
        this.pizza=pizza;
    }

    @Override
    public int cost() {
        return pizza.cost()+10;
    }
}
