package CodeWars.PersistentBugger;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void persistence() {
        assertEquals(3, Main.persistence(39));
        assertEquals(0, Main.persistence(4));
        assertEquals(2, Main.persistence(25));
        assertEquals(4, Main.persistence(999));
    }
}