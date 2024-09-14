package org.example.helpers;

public class StringReversal {
    private final String strToReverse;

    public StringReversal(String strToReverse){
        this.strToReverse = strToReverse;
    }

    public String getReversedStr(){
        StringBuilder sb = new StringBuilder();
        for(int i = this.strToReverse.length()-1; i>=0; i--){
            sb.append(this.strToReverse.charAt(i));
        }
        return sb.toString();
    }
}
