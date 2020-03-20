package StrategyPattern;

public class JetFlying implements IFlyBehaviour {
    @Override
    public void fly() {
        System.out.println("Jet flying!");
    }
}
