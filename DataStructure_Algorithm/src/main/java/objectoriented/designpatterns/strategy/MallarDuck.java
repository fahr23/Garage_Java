package objectoriented.designpatterns.strategy;

public class MallarDuck extends Duck {


    public MallarDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();

    }

    public void quack() {
        quackBehavior.quack();
    }

    public void fly() {
        flyBehavior.fly();
    }


}
