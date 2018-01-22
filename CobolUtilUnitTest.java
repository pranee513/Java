package com.jc;

import java.text.ParseException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Rule;
import org.junit.rules.ExpectedException;

/**
 * Unit test
 */
public class CobolUtilUnitTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    public CobolUtilUnitTest() {
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
    public void test1a() throws ParseException {

        String type = "S9(3)V9(2)";
        String value = "+23.1";

        String output = CobolUtil.convertToDecimal(value, type);
        assertEquals("Result", "+023.10", output);
    }
    
    @Test
    public void test1b() throws ParseException {

        String type = "S9(3)V9(2)";
        String value = "-3.1";

        String output = CobolUtil.convertToDecimal(value, type);
        assertEquals("Result", "-003.10", output);
    }

    @Test
    public void test2() throws ParseException {

        String type = "9(2)";
        String value = "1";

        String output = CobolUtil.convertToDecimal(value, type);
        assertEquals("Result", "01", output);
    }

    @Test
    public void test3() throws ParseException {

        String type = "99V9";
        String value = "5";

        String output = CobolUtil.convertToDecimal(value, type);
        assertEquals("Result", "00.5", output);
    }

    @Test
    public void test4() throws ParseException {

        String type = "P999.";
        String value = ".7";

        String output = CobolUtil.convertToDecimal(value, type);
        assertEquals("Result", ".700", output);
    }

    @Test
    public void test5() throws ParseException {

        String type = "Z(04)9.";
        String value = "002";

        String output = CobolUtil.convertToDecimal(value, type);
        assertEquals("Result", "2", output);
    }

    @Test
    public void test6() throws ParseException {

        String type = "Z(08)9.99.";
        String value = "0090";

        String output = CobolUtil.convertToDecimal(value, type);
        assertEquals("Result", "90.00", output);
    }

    @Test
    public void test7() throws ParseException {

        String type = "P9(3)";
        String value = ".10";

        String output = CobolUtil.convertToDecimal(value, type);
        assertEquals("Result", ".100", output);
    }
    
    @Test
    public void test8() throws ParseException {

        String type = "S99V99";
        String value = "2333";

        String output = CobolUtil.convertToDecimal(value, type);
        assertEquals("Result", "+23.33", output);
    }
}
