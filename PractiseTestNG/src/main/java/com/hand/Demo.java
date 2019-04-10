package com.hand;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Demo {
    @Test
    public void testcase2(){
        Assert.assertTrue(true);
        System.out.println("testcase2");
    }
    @BeforeClass
    public void testcase3(){
        Assert.assertTrue(true);
        System.out.println("testcase3");
    }
}
