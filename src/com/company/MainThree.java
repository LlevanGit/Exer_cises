package com.company;

import java.util.Arrays;

public class MainThree {

    public static void main(String[] args) {
        int [] xxarray=new int[] {1,2,3,4,5,20,6,12,17};
        System.out.println(notContains(xxarray));
	// write your code here
    }

    static int notContains(int[] array){
        int z=0;
        Arrays.sort(array);
        for (int n:array) {
            z++;
            if(n!=z){
                break;
            }
        }
        return z;

    }
}
