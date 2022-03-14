import org.junit.Test;
import static org.junit.Assert.*;

public class jUnitsTests {
    @Test
    public void testIfNameIsRobert() {
        String expected = "Robert";
        String actual = "Robert";

        // testing which the expected and actual variables are being tested against each other
        assertEquals(expected, actual); // only failed assertions will be displayed
    }

    @Test
    public void testIfChangeIsCorrect() {
        Double price = 10.0; // 10 - correct answer
        Double discount = 4.5;

        assertEquals(5.5, price-discount,0);

    }

    public static void main(String[] args) {

    }
}
