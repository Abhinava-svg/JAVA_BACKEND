package com.telusko.learning;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class ShapesTest {
   
   Shapes shape;

   @BeforeEach
   void init(){
      shape = new Shapes();
      System.out.println("Before test");
   }
    // @SuppressWarnings("deprecation")
    @Test
    void testcomputeSquareArea() {
       assertEquals(576, shape.computeSquareArea(24));
    }

    @Test
     void testcomputeCircleArea() {
        assertEquals(78.5, shape.computeCircleArea(5), "Area of circle calculation is wrong");
     }

   @AfterEach
   void destroy(){
      System.out.println("After test clean up");
   }
}
