package com.johnson.tao;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testGenerateOld() {
        final Calculator calculator = new Calculator();

        assertTrue(calculator.calculate(1, 3, 8) == 11 && calculator.calculate(2, 3, 1) == 2
                && calculator.calculate(3, 3, 2) == 6 && calculator.calculate(4, 15, 2) == 7
                && calculator.calculate(5, 6, 2) == 0);
    }

}
