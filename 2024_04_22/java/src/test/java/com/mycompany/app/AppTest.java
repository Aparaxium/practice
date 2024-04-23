package com.mycompany.app;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AppTest 
{
    @Test
    public void test1()
    {
        double result = App.estimatePI(100000000, 1.0);
        assertEquals(3.141, result, 0.001);
    }
    @Test
    public void test2()
    {
        double result = App.estimatePI(100000000, 1.5);
        assertEquals(3.141, result, 0.001);
    }
    @Test
    public void test3()
    {
        double result = App.estimatePI(100000000, 0.1);
        assertEquals(3.141, result, 0.001);
    }
    @Test
    public void test4()
    {
        double result = App.estimatePI(100000000, 11.25);
        assertEquals(3.141, result, 0.001);
    }    
}

