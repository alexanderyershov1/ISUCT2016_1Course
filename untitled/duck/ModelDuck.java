package duck;

import duck.Duck;
import duck.FlyNoWay;

/**
 * Created by UI on 27.09.2017.
 */
public class ModelDuck extends Duck {
    public ModelDuck(){
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }
    public void display(){
        System.out.println("I'm a model duck");
    }
}
