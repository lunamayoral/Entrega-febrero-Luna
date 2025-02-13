package es.uah.matcomp.mp.el1.eja.ejerciciosclases.e4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    void getId() {
        Employee employee = new Employee(5235, "Luna", "Mayoral", 600);
        assertEquals(5235, employee.getId());
    }

    @Test
    void getFirstName() {
        Employee employee = new Employee(5235, "Luna", "Mayoral", 600);
        assertEquals("Luna", employee.getFirstName());
    }

    @Test
    void getLastName() {
        Employee employee = new Employee(5235, "Luna", "Mayoral", 600);
        assertEquals("Mayoral", employee.getLastName());
    }

    @Test
    void getSalary() {
        Employee employee = new Employee(5235, "Luna", "Mayoral", 600);
        assertEquals(600, employee.getSalary());
    }

    @Test
    void setSalary() {
        Employee employee = new Employee(5235, "Luna", "Mayoral", 600);
        employee.setSalary(300);
        assertEquals(300, employee.getSalary());
    }

    @Test
    void getName() {
        Employee employee = new Employee(5235, "Luna", "Mayoral", 600);
        assertEquals("Luna Mayoral", employee.getName());
    }

    @Test
    void getAnnualSalary() {
        Employee employee = new Employee(5235, "Luna", "Mayoral", 600);
        assertEquals(7200, employee.getAnnualSalary()); // 12 * 600
    }

    @Test
    void raiseSalary() {
        Employee employee = new Employee(5235, "Luna", "Mayoral", 5000);
        employee.raiseSalary(10); // Aumentar el salario en un 10%
        assertEquals(5500, employee.getSalary()); // 5000 + 500
    }

    @Test
    void testToString() {
        Employee employee = new Employee(5235, "Luna", "Mayoral", 600);
        String expectedString = "Employee[id=5235,name=Luna Mayoral,salary=600]";
        assertEquals(expectedString, employee.toString());
    }
}