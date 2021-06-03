package ch.abbts.nds.swe.swdt.starter.Logic;

import ch.abbts.nds.swe.swdt.starter.logic.Employee;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


@Tag("erste_Tests")
public class EmployeeTest {

    @Test
    @DisplayName("zu Jung..?")
    void tooYoung() {
        Employee employee = new Employee("A", 16);
        assertFalse(employee.isOfAge(18), "False => wenn Mitarbeiter/inn zu jung ist");
    }

    @Test
    @DisplayName("gleich alt..?")
    void exactAge() {
        Employee employee = new Employee("A", 18);
//        assertTrue(employee.isOfAge(18), "True => wenn Mitarbeiter/inn gleiches alter");
    }

    @Test
    @DisplayName("Alt genug..?")
    void oldEnough() {
        Employee employee = new Employee("A",20);
        assertTrue(employee.isOfAge(18), "True => wenn Mitarbeiter/inn älter ist");
    }

}
