package org.example.helpers;

public class PalindromeChecker {
    private final String s;

    public PalindromeChecker(String s) {
        this.s = s;
    }

    public boolean isPalindrome() {
        int pointerLeft = 0;
        int pointerRight = this.s.length() - 1;

        while (pointerLeft < pointerRight) {
            if (s.charAt(pointerLeft) != s.charAt(pointerRight)) return false;
            pointerLeft++;
            pointerRight--;
        }
        return true;
    }
}