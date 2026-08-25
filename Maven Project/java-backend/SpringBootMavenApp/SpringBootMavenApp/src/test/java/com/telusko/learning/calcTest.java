package com.telusko.learning;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class calcTest {

    @Test
    void testDivide() {
       calc c = new calc();
       int actual = c.divide(10, 5);
       int expectedResult=2;
       assertEquals(expectedResult, actual);
    }
}
