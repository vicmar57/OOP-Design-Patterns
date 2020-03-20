package StrategyPattern;

public class LoudQuack implements IQuackBehaviour {
    @Override
    public void quack() {
        System.out.println("Loud quacking!");
    }
}
