package com.telusko;

import java.util.Arrays;

public class sortingArray {
    public int[] SortingArray(int[] array)
    {
       for(int i=0; i< 100000; i++){
        Arrays.sort(array);
       }
        return array;
    }
}