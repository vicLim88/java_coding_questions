package org.example.helpers;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class BalancedParenthesis {
    private static final Map<Character, Character> bracketPairs = Map.of(
            '(',')',
            '[',']',
            '{','}'
    );

    public static boolean isBalanced(String strToCheck){
        Stack<Character> stack = new Stack<>();

        for(char bracket: strToCheck.toCharArray()){
            boolean isOpenBracket = bracketPairs.containsKey(bracket);
            boolean isCloseBracket = bracketPairs.containsValue(bracket);

            if(isOpenBracket) stack.push(bracket);
            else if (isCloseBracket){
                if(stack.isEmpty() ||  bracketPairs.get(stack.pop()) != bracket) return false;
            }
        }
        return stack.isEmpty();
    }

}
