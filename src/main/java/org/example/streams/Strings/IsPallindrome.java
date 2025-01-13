package org.example.streams.Strings;

public class IsPallindrome {

    public static boolean isPallindrome(String str){
        int length=str.length();
        str= str.toLowerCase();
        for (int i=0;i<length/2;i++){
            if (str.charAt(i)!=str.charAt(length - i -1)){
                System.out.println("NOT a Pallindrome");
                return false;
            }
        }

        System.out.println("Is a Pallindrome");
        return true;
    }

    public static void main(String[] args) {
        String str = "Nitin";
        isPallindrome(str);
    }
}

