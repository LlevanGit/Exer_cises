package com.company;

public class MainOne {

    public static void main(String[] args) {
        String check="abxcba";
        if(isPalindrome(check)){
            System.out.println("1");
        }else {
            System.out.println("0");
        }
        // write your code here
    }


    static boolean isPalindrome(String text) {
        int j = text.length() - 1;
        int i;
        int z = 0;
        for (i = 0; i < j; i++, j--) {
            if (text.charAt(i) == text.charAt(j)) {
                z = 100;
            } else {
                z = 0;
                break;
            }
        }
        if (z == 100) {
            return true;
        } else {
            return false;
        }

    }
}
