package StrategyPattern;

public class Duck {
    private IFlyBehaviour fb;
    private IQuackBehaviour qb;

    public Duck (IFlyBehaviour fb, IQuackBehaviour qb) {
        this.fb = fb;
        this.qb = qb;
    }
    public void fly() {
        fb.fly();
    }

    public void quack() {
        qb.quack();
    }
}
