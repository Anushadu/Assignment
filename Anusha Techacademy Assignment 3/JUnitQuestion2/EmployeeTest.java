import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmployeeTest {

    private Employee employee;

    @BeforeEach
    public void setUp() {
        // Initialize a new Employee object before each test
        employee = new Employee(1, "John Doe", 50000);
    }

    @ParameterizedTest
    @ValueSource(doubles = {50000, 60000, 75000})
    public void testCalculateYearlyBonus(double salary) {
        employee.setSalary(salary);
        double expectedBonus = salary * 0.10; // Assuming 10% bonus

        assertEquals(expectedBonus, employee.calculateYearlyBonus(), 0.001);
    }
}
