package com.telusko;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;
// import static org.junit.jupiter.api.Assertions.*;

public class TestException {
    
    @Test
    void testSortingArray_Exception(){
        // try{
        sortingArray array = new sortingArray();
        // int [] unsorted = {2, 4, 5};
        // int sortedArray[] = array.SortingArray(unsorted);
        // for(int elem:sortedArray)
        // {
        //     System.out.println(elem);
        // }
        // System.out.println("Statement below Exception");
        // fail();
        // }
        // catch(NullPointerException e){
        //     System.out.println("Exception generated");
        // }

        int unsorted[] = null;
        assertThrows(NullPointerException.class, () -> array.SortingArray(unsorted));
    }
}
