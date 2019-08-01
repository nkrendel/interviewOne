package com.comcast.interviews;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Unit test for JaggedArray.
 */
public class JaggedArrayTest
{
    @Test
    public void maxShouldReturnCorrectResult() {
        Object[] jagged = {2, 4, 10, new Object[] {12, 4, new Object[] {100, 99}, 4}, new Object[] {3, 2, 103}, 0};
        assertEquals("Expected maximum value is incorrect.", 103, JaggedArray.max(jagged));
    }
}
