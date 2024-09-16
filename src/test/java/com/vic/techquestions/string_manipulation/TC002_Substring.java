package com.vic.techquestions.string_manipulation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TC002_Substring {

    @Test
    public void testSubstring(){
        String s = "Interview";
        String actual = s.substring(5,s.length()-1);
        String expected = "vie";
        assertEquals(expected, actual);
    }
}
