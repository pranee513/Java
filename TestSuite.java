package com.jc;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Test suite
 */
@RunWith(Suite.class)

@Suite.SuiteClasses({
   CobolUtilUnitTest.class,
   CobolUtilReverseUnitTest.class
})
public class TestSuite {
    
    public TestSuite() {
    }
    
}
