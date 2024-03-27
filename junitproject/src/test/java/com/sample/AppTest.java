package com.sample;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

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
    public void test1(){
        int a=10;
        int b=20;
        int sum=a+b;
        assertEquals(sum,30);
    }

     @Test
    public void test2(){
        int a=40;
        int b=20;
        int sum=a-b;
        assertEquals(sum,20);
    }


}
