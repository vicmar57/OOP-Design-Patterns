package test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.BubbleLights;
import main.ChristmasTree;
import main.ChristmasTreeImpl;
import main.TreeTopper;

class DecoratorPatternTest {
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
