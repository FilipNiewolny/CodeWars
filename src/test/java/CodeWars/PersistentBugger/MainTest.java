package CodeWars.PersistentBugger;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void persistence() {
        assertEquals(3, Main.persistence(39));
        assertEquals(0, Main.persistence(4));
        assertEquals(2, Main.persistence(25));
        assertEquals(4, Main.persistence(999));
    }

        @Test
        public void test1() {
            List<Integer> res = new ArrayList<Integer>(Arrays.asList(3, 2, 1, 1));
            for (int r : res) assertEquals(res, CodeWars.RectangleIntoSquares.Main.sqInRect(5, 3));
        }
        @Test
        public void test2() {
            assertEquals(null, CodeWars.RectangleIntoSquares.Main.sqInRect(5, 5));
        }
    }
