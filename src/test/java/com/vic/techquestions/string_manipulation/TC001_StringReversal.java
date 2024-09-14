package com.vic.techquestions.string_manipulation;

import org.example.helpers.StringReversal;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TC001_StringReversal {
    private final String test_data = "Bubble";
    private final String expected = "elbbuB";

    @Test
    public void testReverseString(){
        StringReversal sR = new StringReversal(this.test_data);
        assertEquals(this.expected, sR.getReversedStr());
    }
}
