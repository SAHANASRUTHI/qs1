package com.kgisl.qs1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * CalculatorTest
 */
public class CalculatorTest {
    Calculator c = new Calculator();
    @Test
    public void addTest() {
        int actual=c.add(10, 20);
        int expected=30;
        assertEquals(expected, actual);
    }
    @Test
    public void subTest() {
        int actual=c.sub(10, 20);
        int expected=-10;
        assertEquals(expected, actual);
    }
    @Test
    public void mulTest() {
        int actual=c.mul(10, 20);
        int expected=200;
        assertEquals(expected, actual);
    }
    @Test
    public void divTest() {
        int actual=c.div(100, 20);
        int expected=5;
        assertEquals(expected, actual);
    }
 
}