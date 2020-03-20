package StrategyPattern;

public class SimpleFlying implements IFlyBehaviour {
    @Override
    public void fly() {
        System.out.println("simple flying!");
    }
}
