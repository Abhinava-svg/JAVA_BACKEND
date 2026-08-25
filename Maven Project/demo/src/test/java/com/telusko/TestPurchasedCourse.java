package com.telusko;

import com.telusko.service.PurchasedCourse;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestPurchasedCourse {
    
    @Test
    void testProceedWithCourse() {
        PurchasedCourse pc = new PurchasedCourse();
        boolean status = pc.proceedWithCourse(new javaCourse());
        // assertTrue(status);
        assertFalse(status, "Its failed bcz unit is result in true");
    }
}
