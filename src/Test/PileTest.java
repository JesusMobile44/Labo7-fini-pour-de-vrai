package Test;

import Collection.Pile;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by BelSi1731422 on 2018-03-26.
 */
class PileTest {
    Pile pile;
    @BeforeEach
    void setUp() {
        pile = new Pile();
        pile.push("var0");
        pile.push("var1");
        pile.push("var2");
    }

    @Test
    void pop() {
        assertEquals("var2", pile.pop());
    }

    @Test
    void peek() {
        assertEquals("var2", pile.peek());
    }

    @Test
    void clear() {
        pile.clear();
        assertEquals(0,pile.size());
    }

    @Test
    void size() {
        assertEquals(3,pile.size());
    }

}