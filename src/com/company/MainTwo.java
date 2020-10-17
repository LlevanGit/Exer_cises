package com.company;

public class MainTwo {

    public static void main(String[] args) {
        System.out.println(minSplit(126));

    }

    static int minSplit(int amount){
        int count=0;
        int t;
        int [] cArray = new int[]{50,20,10,5,1};
        for (int i:cArray) {
            if (amount != 0) {
                t=amount/i;
                count=count+t;
                amount = amount-i*t;
            } else break;
        }
        return count;
    }
}
