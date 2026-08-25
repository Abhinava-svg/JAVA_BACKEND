package com.telusko.learning;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseStringTest {
    @Test
    void testReverseString() {
        ReverseString reverse = new ReverseString();
        String expected = "avaj";
        assertEquals(expected, reverse.reverseString("java"));
    }
}
