package com.kyledoherty.codekatas.kyu.six;

import org.junit.jupiter.api.Test;

import static com.kyledoherty.codekatas.kyu.six.CreatePhoneNumber.createPhoneNumber;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CreatePhoneNumberTest {

    @Test
    public void testCreatePhoneNumberTest() {
        assertEquals(createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}), "(123) 456-7890");
    }

}