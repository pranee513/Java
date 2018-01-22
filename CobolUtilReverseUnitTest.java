package com.jc;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Unit test for Java to Cobol
 */
public class CobolUtilReverseUnitTest {

    public CobolUtilReverseUnitTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void test1() {

        String value = "23.33";

        String output = CobolUtil.getCobolType(value);
        assertEquals("Result", "99V99", output);
    }

    @Test
    public void test2() {

        String value = "4555";

        String output = CobolUtil.getCobolType(value);
        assertEquals("Result", "9999", output);
    }

    @Test
    public void test3() {

        String value = "-123.6";

        String output = CobolUtil.getCobolType(value);
        assertEquals("Result", "S999V9", output);
    }
}
