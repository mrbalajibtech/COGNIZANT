import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setUp() {
        // Arrange - Setup before each test
        calculator = new Calculator();
        System.out.println("Setup completed.");
    }

    @After
    public void tearDown() {
        // Cleanup after each test
        calculator = null;
        System.out.println("Teardown completed.");
    }

    @Test
    public void testAddition() {
        // Act
        int result = calculator.add(2, 3);

        // Assert
        assertEquals(5, result);
    }
}
