package org.example.streams.Strings;

import java.util.Arrays;

class ReverseSTring{

    public static void main(String[] args) {
        String str="ZUBER";
        char [] charArr=str.toCharArray();
        for (int i=str.length()-1;i>=0;i--){
            System.out.println(charArr[i]);
        }
         for (int i=charArr.length - 1 ;i>=0 ;i--){
             System.out.print(charArr[i] + " ");
         }
        System.out.println();
        System.out.println("**********************************");

//         Arrays.stream(Arrays.stream(str.chars().toArray()).toArray()).mapToObj(c->(char)c)
//                 .forEach(p-> System.out.println(p));


    }
}