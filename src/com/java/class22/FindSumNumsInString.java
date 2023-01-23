package com.java.class22;

public class FindSumNumsInString {

    // sum all the digits in a String
    //Apple34lrlf9sj3f9 -3,4,9,3,9 =28;

    public static void main(String[] args) {
        String str = "Apple34lrlf9sj3f9";
        int sum =0;
        for(int i =0; i <str.length(); i++){
            Character temp =str.charAt(i);
            if(Character.isDigit(temp)){
                sum+=Integer.valueOf(String.valueOf(temp));
            }
        }

        System.out.println(sum);
    }
}
