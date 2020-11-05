package exercises;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static java.util.Optional.ofNullable;
import static org.junit.Assert.*;


public class BetterArrayListTest {

    BetterArrayList<Integer> list = new BetterArrayList<Integer>();

    @Test
    public void testPopMethod() {
        list.clear();

        list.add(1);
        list.add(8);
        list.add(9);
        list.add(3);
        list.add(2);
        list.add(8);

        assertEquals((Integer) 8, list.pop());
        assertEquals((Integer) 2, list.pop());
        assertEquals((Integer) 3, list.pop());
        assertEquals((Integer) 9, list.pop());
        assertEquals((Integer) 8, list.pop());
        assertEquals((Integer) 1, list.pop());
        assertNull(list.pop());
    }

    @Test
    public void testPrintList() {
        list.clear();

        list.add(1);
        list.add(8);
        list.add(9);
        list.add(3);
        list.add(2);
        list.add(8);

        assertEquals("1\n" +
                "8\n" +
                "9\n" +
                "3\n" +
                "2\n" +
                "8\n", list.printList());
    }

    @Test
    public void testPrintingEmptyList() {
        list.clear();

        assertEquals("List is empty. There is nothing to print", list.printList());
    }
}
