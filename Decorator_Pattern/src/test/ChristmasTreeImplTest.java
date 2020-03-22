package test;

import main.BubbleLights;
import main.ChristmasTree;
import main.ChristmasTreeImpl;
import main.TreeTopper;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ChristmasTreeImplTest {
    @Test
    public void givenDecoratorPattern_WhenDecoratorsInjectedAtRuntime_thenConfigSuccess() {
        ChristmasTree tree1 = new TreeTopper(new ChristmasTreeImpl());
        assertEquals(tree1.decorate(),
                "Decorating tree with Tree Topper");

        ChristmasTree tree2 = new BubbleLights(new ChristmasTreeImpl());
        assertEquals(tree2.decorate(),
                "Decorating tree with Bubble Lights");
    }
}