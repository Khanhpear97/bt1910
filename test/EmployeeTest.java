import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {
    @Test
    public void testEmployees1() {
        String name = "John Doe";
        String id = "12345";
        int workingHour = 160;
        int basicSalaryPerHour = 10;
        int overtimeHour = 20;
        int overtimeSalaryPerHour = 15;
        Employee employee = new Employee(name,id,workingHour,
                basicSalaryPerHour,overtimeHour,overtimeSalaryPerHour);
        String expected = "Employee Information: \n"
                + "Name: John Doe\n"
                + "Id: 12345\n"
                + "Basic Salary: 1600\n"
                + "Overtime Salary: 300\n"
                + "Total Salary: 1900";
        String actual = employee.getInfo();
        assertEquals(expected, actual);
    }

    @Test
    public void testEmployees2(){
        String name = "Khanh";
        String id = "1904";
        int workingHour = 300;
        int basicSalaryPerHour = 30;
        int overtimeHour = 20;
        int overtimeSalaryPerHour = 40;
        Employee employee = new Employee(name,id,workingHour,
                basicSalaryPerHour,overtimeHour,overtimeSalaryPerHour);
        String expected = "Employee Information: \n"
                + "Name: Khanh\n"
                + "Id: 1904\n"
                + "Basic Salary: 9000\n"
                + "Overtime Salary: 800\n"
                + "Total Salary: 9800";
        String actual = employee.getInfo();
        assertEquals(expected, actual);
    }
}