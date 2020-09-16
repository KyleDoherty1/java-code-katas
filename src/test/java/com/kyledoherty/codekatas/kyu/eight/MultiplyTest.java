package com.kyledoherty.codekatas.kyu.eight;

import org.junit.jupiter.api.Test;

import static com.kyledoherty.codekatas.kyu.eight.Multiply.multiply;
import static org.junit.jupiter.api.Assertions.*;

class MultiplyTest {
    @Test
    public void testMultiply() {
        double answer = multiply(2.0,3.0);
        assertEquals(answer, 6.0);
    }
}