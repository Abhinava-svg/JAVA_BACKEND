package com.telusko;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

public class ArrayTesting{
    @Test()
    void testArrays(){
        int [] expected = {2, 4, 6, 8};
        int [] actual = {4, 6, 8, 2};

        Arrays.sort(actual);//2, 4, 6, 8
        assertArrayEquals(expected, actual);
        // assertEquals(expected, actual);
    }
} 
