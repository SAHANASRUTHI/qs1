package com.kgisl.qs1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalcTest {

    @BeforeClass
    public static void setUp() {
        System.out.println("BeforeClass");
    }

    @Before
    public void before() {
        System.out.println("    Before");
    }


    @Test
    public void test1(){
        System.out.println("        test one runs");

    }

    @Test
    public void test2(){
        System.out.println("        test two runs");

    }

    @AfterClass
    public static void tearDown() {
        System.out.println("AfterClass");
    }

    @After
    public void after() {
        System.out.println("    After");
    }
}
