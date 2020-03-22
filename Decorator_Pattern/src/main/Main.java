package main;

public class Main {
    public static void main (String [] args) {
        ChristmasTree ct = new TreeTopper(new ChristmasTreeImpl());
        System.out.println(ct.decorate());

        ChristmasTree ct2 = new BubbleLights(new ChristmasTreeImpl());
        System.out.println(ct2.decorate());
    }
}
