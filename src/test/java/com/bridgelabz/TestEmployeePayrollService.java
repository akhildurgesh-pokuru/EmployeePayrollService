package com.bridgelabz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class TestEmployeePayrollService {

    @Test
    public void testConstructor(){
        EmployeePayroll payroll = new EmployeePayroll(122,"akhil",24000);
        assertEquals(122,payroll.id);
        assertEquals("akhil",payroll.name);
        assertEquals(24000,payroll.salary);
    }

    @Test
    public void TestNull(){
        assertThrows(IllegalArgumentException.class, ()->
                    new EmployeePayroll(0," ",0.0));
    }

    @Test
    public void TestNegtive(){
        assertThrows(IllegalArgumentException.class, ()->
                new EmployeePayroll(-1,"akhil",54000));
    }

    @Test
    public void TestNullName(){
        assertThrows(IllegalArgumentException.class, ()->
                new EmployeePayroll(23,null,54000));
    }

    @Test
    public void TestEmptyName(){
        assertThrows(IllegalArgumentException.class, ()->
                new EmployeePayroll(45," ",54000));
    }

    @Test
    void shouldNotAcceptBlankEmployeeName() {
        assertThrows(IllegalArgumentException.class, () ->
                new EmployeePayroll(101, "   ", 35000));
    }

    @Test
    public void TestNegativeSalary(){
        assertThrows(IllegalArgumentException.class, ()->
                new EmployeePayroll(12,"akhil",-54000));
    }

    @Test
    public void TestZeroSalary(){
        assertThrows(IllegalArgumentException.class, ()->
                new EmployeePayroll(-1,"akhil",0.0));
    }

}