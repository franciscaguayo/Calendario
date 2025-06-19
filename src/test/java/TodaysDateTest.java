import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TodaysDateTest {
    @Test
    public void testPrintDateAndTimeExecution() {
        TodaysDate todaysDate = new TodaysDate();
        todaysDate.printDateAndTime();
        assertTrue(todaysDate.day > 0 && todaysDate.day <= 31);
    }
}