package com.mycompany.app;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void test1()
    {
        int[] arr = {10, 15, 3, 7};
        assertTrue( App.test(arr, 17) );
    }

    public void test2()
    {
        int[] arr = {10, 15, 3, 7};
        assertTrue( App.test(arr, 10) );
    }

    public void test3()
    {
        int[] arr = {};
        assertFalse( App.test(arr, 10) );
    }

    public void test4()
    {
        int[] arr = {1};
        assertFalse( App.test(arr, 10) );
    }

    public void test5()
    {
        int[] arr = {1, 2, -100};
        assertFalse( App.test(arr, 10) );
    }
}

