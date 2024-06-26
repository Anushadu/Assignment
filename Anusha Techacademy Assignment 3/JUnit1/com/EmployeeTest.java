package com;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EmployeeTest {

    private Employee employee;

    @BeforeEach
    public void setUp() {
        // Initialize a new Employee object before each test
        employee = new Employee(1, "John Doe", 50000);
    }

    @Test
    public void testEmployeeInitialization() {
        assertEquals(1, employee.getId());
        assertEquals("John Doe", employee.getName());
        assertEquals(50000, employee.getSalary(), 0.001); // Using delta for double comparison
    }

    @Test
    public void testSetters() {
        employee.setId(2);
        employee.setName("Jane Smith");
        employee.setSalary(60000);

        assertEquals(2, employee.getId());
        assertEquals("Jane Smith", employee.getName());
        assertEquals(60000, employee.getSalary(), 0.001); // Using delta for double comparison
    }

    @Test
    public void testEqualsAndHashCode() {
        Employee sameEmployee = new Employee(1, "John Doe", 50000);
        Employee differentEmployee = new Employee(2, "Jane Smith", 60000);

        assertTrue(employee.equals(sameEmployee));
        assertFalse(employee.equals(differentEmployee));

        assertEquals(employee.hashCode(), sameEmployee.hashCode());
        assertNotEquals(employee.hashCode(), differentEmployee.hashCode());
    }

    @Test
    public void testToString() {
        String expectedToString = "Employee{id=1, name='John Doe', salary=50000.0}";
        assertEquals(expectedToString, employee.toString());
    }
}
