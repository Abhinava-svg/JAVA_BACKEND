package com.telusko;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestAsssertTrue{

    @Test
    void test(){
        // String str = "Junit";
        // assertTrue(str.equals("Junit"));

        assertFalse(false);

        String str = "Junit5";
        assertFalse(str.length()<5);
    }
}