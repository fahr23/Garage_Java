package objectoriented.designpatterns.strategy;

public class DuckSimulator {


    public static void main(String[] args) {
        Duck duck = new MallarDuck();
        duck.performFly();
        duck.performQuack();
        duck.setFlyBehavior(new FlyNoWay());
        duck.performFly();

    }


}
