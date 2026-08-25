package com.telusko.learning;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ReverseStringTest {

    @Test
    void testReverseString( ) {

        ReverseString reverse = new ReverseString();

        String actual = reverse.reverseString("java");
        String expected = "avaj";

        assertEquals(expected, actual);

    }

    @Test
    void testReverseString_MultipleWords(){
        ReverseString reverse = new ReverseString();
        assertEquals("ysae si avaj", reverse.reverseString("java is easy"));
    }
} 
    

