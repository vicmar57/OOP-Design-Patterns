package StrategyPattern;

public class Main {
    public static void main (String[] args) {
        Duck simpleDuck = new Duck(new SimpleFlying(), new SimpleQuack());
        System.out.println("simple duck instance:");
        simpleDuck.fly();
        simpleDuck.quack();

        Duck hybridDuck = new Duck(new JetFlying(), new LoudQuack());
        System.out.println("\nhybrid duck instance:");
        hybridDuck.fly();
        hybridDuck.quack();
    }
}
