package com.tdd.model;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class CalculatorTest {
    Calculator calculator;
    @BeforeAll
    void setUp(){
        this.calculator=new Calculator();
    }
    @Test
    @DisplayName("Addition")
    public void addTest(){
        assertEquals(10,this.calculator.add(1,2,3,4));
    }
    @Test
    @DisplayName("Subtraction")
    public void subTest(){
        assertEquals(-10,this.calculator.sub(1,2,3,4));
    }
    @Test
    @DisplayName("Division")
    public void subDiv(){
        assertEquals(0,this.calculator.div(1,2,3,4));
        assertThrows(ArithmeticException.class,()->this.calculator.div(1,2,0,4));
    }
}
