package CodeWars.StopGninnipSMySdrow;

import org.junit.Test;

import static org.junit.Assert.*;

public class SpinWordsTest {

    @Test
    public void spinWords() {
        assertEquals("emocleW", new SpinWords().spinWords("Welcome"));
        assertEquals("Hey wollef sroirraw", new SpinWords().spinWords("Hey fellow warriors"));

    }
}