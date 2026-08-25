package com.telusko;

import java.time.Duration;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class TestingPerformance {
    @Test
    void testSortingMethod_Performance()
    {
        sortingArray array = new sortingArray();
        int unsorted[] = {2, 4, 6};
        assertTimeout(Duration.ofMillis(10), () -> array.SortingArray(unsorted));
    }
}
