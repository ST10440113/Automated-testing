/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.automated_unit_testing;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author user
 */
public class unit_testingTest {
    
    public unit_testingTest() {
    }

    @org.junit.jupiter.api.Test
    public void testAdditionMethod() {
        //Create an instance of the class
        unit_testing ut = new  unit_testing();
        
        int expected = 0;
        int  actual = ut.addition(4,4);
                
        assertEquals(expected,actual);
    }

    @org.junit.jupiter.api.Test
    public void testSubtractionMethod() {
        //Create an instance of the class
     unit_testing ut = new  unit_testing();
     
     int expected = 0;
     int actual = ut.subtraction(10,2);
     
     assertEquals(expected,actual);
    }

    @org.junit.jupiter.api.Test
    public void testMessage() {
           //Create an instance of the class
     unit_testing ut = new  unit_testing();
     
     String expected = "Hello World!";
     String actual = ut.message();
     
     assertEquals(expected,actual);
     
    }
    
}
