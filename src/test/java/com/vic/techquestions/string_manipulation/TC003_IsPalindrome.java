package com.vic.techquestions.string_manipulation;

import org.example.helpers.PalindromeChecker;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TC003_IsPalindrome {

    @Test
    public void isPalindrome_001(){
        String test = "abba";
        boolean expected = true;
        boolean actual = new PalindromeChecker(test).isPalindrome();
        assertEquals(expected, actual);
    }

    @Test
    public void isPalindrome_002(){
        String test = "saippuakivikauppias";
        boolean expected = true;
        boolean actual = new PalindromeChecker(test).isPalindrome();
        assertEquals(expected, actual);
    }

    @Test
    public void isNotPalindrome_001(){
        String test = "titus";
        boolean expected = false;
        boolean actual = new PalindromeChecker(test).isPalindrome();
        assertEquals(expected, actual);
    }
}
