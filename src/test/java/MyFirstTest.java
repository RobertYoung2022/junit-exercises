import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

public class MyFirstTest {

    // Create a test method that uses assertEquals or assertNotEquals to verify if the String Codeup is the same as CodeUp.
    @Test
    public void verifyString() {
        String verified = "Robert";
        String testInput = "Robert";

        assertEquals(verified, testInput);
    }

    // Create a test method that uses assertNotSame to verify that the following ArrayLists are not the same:
    @Test
    public void verifyLanguage() {
        List<String> languages = new ArrayList<>();
        List<String> moreLanguages = new ArrayList<>();

        languages.add("Spanish");
        languages.add("English");
        languages.add("Korean");

        moreLanguages.add("Italian");
        moreLanguages.add("Japanese");

        assertNotSame(languages, moreLanguages);
    }

    // Create a test method that uses assertArrayEquals to verify the following arrays are equal.
    @Test
    public void verifyArray() {
        int[] numbers = {1, 2, 3};
        int[] otherNumbers = new int[3];
        otherNumbers[0] = 1;
        otherNumbers[1] = 2;
        otherNumbers[2] = 3;

        assertArrayEquals(numbers, otherNumbers);
    }

    // Create a test method that uses both assertFalse and assertTrue to verify the following statements:
    @Test
    public void verifyStatement() {
        String language = "PHP"; // change to get different resolves
        language.contains("H"); // use assertTrue for this statement
        language.contains("J"); // use assertFalse for this statement

        assertTrue(language.contains("H"));
        assertFalse(language.contains("J"));
    }

    //


}
