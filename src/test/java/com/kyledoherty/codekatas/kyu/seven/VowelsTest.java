package com.kyledoherty.codekatas.kyu.seven;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VowelsTest {
    @Test
    public void testCase1() {
        assertEquals("Nope!", 5, Vowels.getCount("abracadabra"));
    }

}