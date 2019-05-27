package objectoriented.designpatterns.strategy;

/**
 * The key is that a Duck will now delegate its
 * flying and quacking behavior, instead of using
 * quacking and flying methods defined in the Duck class(or subclass)
 */
public abstract class Duck {


    //delagate to interfaces
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;


    public void performQuack() {
        quackBehavior.quack();
    }


    public void performFly() {
        flyBehavior.fly();
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
