package CodeWars.WriteNumberInExpandedForm;

import org.junit.Test;

import static org.junit.Assert.*;

public class AppTest {

    @Test
    public void expandedForm() {
        assertEquals("10 + 2" ,App.expandedForm(12));
        assertEquals("40 + 2" ,App.expandedForm(42));
        assertEquals("70000 + 300 + 4" ,App.expandedForm(70304));
    }
}