package DecoratorPattern;
import DecoratorPattern.BasePizza;

public class ExtaMushroom extends ToppingDecorator{
    BasePizza pizza;
    public ExtaMushroom(BasePizza pizza){
        this.pizza=pizza;
    }

    @Override
    public int cost() {
        return pizza.cost()+20;
    }
}
