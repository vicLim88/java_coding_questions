package com.vic.techquestions;

import org.junit.jupiter.api.Test;

import org.example.helpers.StringReversal;

import static org.junit.jupiter.api.Assertions.*;

public class TestCase001 {
    private final String test_data = "Bubble";
    private final String expected = "elbbuB";

    @Test
    public void testReverseString(){
        StringReversal sR = new StringReversal(this.test_data);
        assertEquals(this.expected, sR.getReversedStr());
    }
}
