package com.telusko;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AppTest {

    @Test
    public void testDivide() {
        App app = new App();

        assertEquals(5, app.divide(10, 2));
    }
}