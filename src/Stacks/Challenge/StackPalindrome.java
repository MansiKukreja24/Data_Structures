package Stacks.Challenge;

import java.util.LinkedList;

public class StackPalindrome {
    public static void main(String[] args) {

        System.out.println(checkIfPalindrome("I did, did I."));
        System.out.println(checkIfPalindrome("Racecar"));
        System.out.println(checkIfPalindrome("Hello"));


    }

    private static boolean checkIfPalindrome(String s) {
        LinkedList<Character> stack = new LinkedList<Character>();
        StringBuilder sp = new StringBuilder(s.length());
        String st = s.toLowerCase();
        for (int i = 0; i < st.length(); i++) {
            char ch = st.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                sp.append(ch);
                stack.push(ch);
            }
        }
        StringBuilder reverseStr = new StringBuilder(stack.size());
        while (!stack.isEmpty()) {
            reverseStr.append(stack.pop());
        }
        return reverseStr.toString().equals(sp.toString());
    }
}


