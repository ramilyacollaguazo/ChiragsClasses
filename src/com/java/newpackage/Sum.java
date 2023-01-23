package com.java.newpackage;

public class Sum {

        // Sum all the digits in a String
        //Apple34jsk9fk2o3k9

        public static void main(String[] args) {
            String str = "Apple34jsk9fk2o3k9";
            int sum = 0;
            for (int i = 0; i < str.length(); i++) {

                Character temp = str.charAt(i);
                if (Character.isDigit(temp)){
                    sum+=Integer.valueOf(String.valueOf(temp));
                }
            }
            System.out.println(sum);
        }
    }
