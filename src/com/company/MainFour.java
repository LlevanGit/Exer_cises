package com.company;

public class MainFour {

    public static void main(String[] args) {
        if(isProperly("()(())")){
            System.out.println("kiiio");
        } else System.out.println("araao");
	// write your code here
    }
    static boolean isProperly(String sequence){
        int kk=10;
        int z=0;
        int j=0;
        for(int i=0;i<sequence.length();i++){
            if(sequence.charAt(i)=='('){
                z++;
            }else {
                j++;
            }
            if(j>z){
                kk=200;
                break;
            }
        }
        System.out.println(j);
        System.out.println(z);
        return kk == 10 && j == z;
    }
}
