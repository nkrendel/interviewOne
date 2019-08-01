package com.comcast.interviews;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SumOfSequenceTest {
    @Test
    public void testThatSumWorks() {
        int sum = SumOfSequence.sum(1, 100);
        assertEquals(5050, sum);
    }
}
