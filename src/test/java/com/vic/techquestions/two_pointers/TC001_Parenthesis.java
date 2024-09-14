package com.vic.techquestions.two_pointers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.example.helpers.BalancedParenthesis.isBalanced;

public class TC001_Parenthesis {
    ///Single Bracket Pairs
    @Test
    public void parenthesis_is_balanced_001() {
        String test_data = "{}";
        boolean expected = true;
        assertEquals(expected, isBalanced(test_data));
    }

    @Test
    public void parenthesis_is_balanced_002() {
        String test_data = "()";
        boolean expected = true;
        assertEquals(expected, isBalanced(test_data));
    }

    @Test
    public void parenthesis_is_balanced_003() {
        String test_data = "[]";
        boolean expected = true;
        assertEquals(expected, isBalanced(test_data));
    }

    /// Nested Bracket Pairs
    @Test
    public void parenthesis_is_balanced_004() {
        String test_data = "(())";
        boolean expected = true;
        assertEquals(expected, isBalanced(test_data));
    }

    @Test
    public void parenthesis_is_balanced_005() {
        String test_data = "[[]]";
        boolean expected = true;
        assertEquals(expected, isBalanced(test_data));
    }

    @Test
    public void parenthesis_is_balanced_006() {
        String test_data = "{{}}";
        boolean expected = true;
        assertEquals(expected, isBalanced(test_data));
    }

    @Test
    public void parenthesis_is_balanced_007() {
        String test_data = "({})";
        boolean expected = true;
        assertEquals(expected, isBalanced(test_data));
    }

    @Test
    public void parenthesis_is_balanced_008() {
        String test_data = "([])";
        boolean expected = true;
        assertEquals(expected, isBalanced(test_data));
    }

    @Test
    public void parenthesis_is_balanced_009() {
        String test_data = "[()]";
        boolean expected = true;
        assertEquals(expected, isBalanced(test_data));
    }

    @Test
    public void parenthesis_is_balanced_010() {
        String test_data = "[{}]";
        boolean expected = true;
        assertEquals(expected, isBalanced(test_data));
    }

    @Test
    public void parenthesis_is_balanced_011() {
        String test_data = "{()}";
        boolean expected = true;
        assertEquals(expected, isBalanced(test_data));
    }

    @Test
    public void parenthesis_is_balanced_012() {
        String test_data = "{[]}";
        boolean expected = true;
        assertEquals(expected, isBalanced(test_data));
    }

    @Test
    public void parenthesis_is_balanced_013() {
        String test_data = "[{()}]";
        boolean expected = true;
        assertEquals(expected, isBalanced(test_data));
    }

    @Test
    public void parenthesis_is_balanced_014() {
        String test_data = "{([])}";
        boolean expected = true;
        assertEquals(expected, isBalanced(test_data));
    }

    @Test
    public void parenthesis_is_balanced_015() {
        String test_data = "{([])}";
        boolean expected = true;
        assertEquals(expected, isBalanced(test_data));
    }

    /// Mixed But Balanced
    @Test
    public void parenthesis_is_balanced_016() {
        String test_data = "[]{}()";
        boolean expected = true;
        assertEquals(expected, isBalanced(test_data));
    }

    @Test
    public void parenthesis_is_balanced_017() {
        String test_data = "{}()[]";
        boolean expected = true;
        assertEquals(expected, isBalanced(test_data));
    }

    @Test
    public void parenthesis_is_balanced_018() {
        String test_data = "()[]{}";
        boolean expected = true;
        assertEquals(expected, isBalanced(test_data));
    }

    @Test
    public void parenthesis_is_balanced_019() {
        String test_data = "[{}]()";
        boolean expected = true;
        assertEquals(expected, isBalanced(test_data));
    }

    @Test
    public void parenthesis_is_balanced_020() {
        String test_data = "()[{}]";
        boolean expected = true;
        assertEquals(expected, isBalanced(test_data));
    }

    /// Not Balanced
    @Test
    public void parenthesis_is_balanced_021() {
        String test_data = "(]";
        boolean expected = false;
        assertEquals(expected, isBalanced(test_data));
    }

}
