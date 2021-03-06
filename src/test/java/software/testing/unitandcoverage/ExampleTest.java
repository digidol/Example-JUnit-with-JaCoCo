package software.testing.unitandcoverage;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ExampleTest {

    @Test
    public void shouldGetNumber() {

        Example example = new Example();
        int output = example.getValue(20);
        assertEquals(200, output);
    }

    @Test
    public void shouldGetZero() {
        Example example = new Example();
        assertEquals(0, example.getValue(0));
    }
    
    @Test
    public void shouldSayThankYouInChinese() {
        Example example = new Example();
        String thankYou = example.sayThankYou("CN");
        assertEquals("谢谢", thankYou);
    }
    
    @Test
    public void shouldSayThankYouInWelsh() {
        Example example = new Example();
        String thankYou = example.sayThankYou("CY");
        assertEquals("Diolch", thankYou);
    }
    
}












