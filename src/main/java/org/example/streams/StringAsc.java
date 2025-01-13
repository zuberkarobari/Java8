package org.example.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StringAsc {

      static void displayString(String str){
         String [] words=str.split(":");
         List<String> fourWords=new ArrayList<>();
//

          for (String word: words){
              if(word.length()==4){
                  fourWords.add(word);
              }
          }
          Collections.sort(fourWords);
          fourWords.stream().sorted()
                  .forEach(p-> System.out.println(p));
          for(String word : fourWords){
              System.out.println(word);
          }

     }

    public static void main(String[] args) {
        String input="JAVA : Code : KPMG : Test : India : Mumbai : Pune : Bangalore : USA : China";
        displayString(input);
        String [] words=input.split(" : ");
        List<String> fourWords=new ArrayList<>();
//

        for (String word: words){
            if(word.length()==4){
                fourWords.add(word);
            }
        }
        Collections.sort(fourWords);
        fourWords.stream().sorted()
                .forEach(p-> System.out.println(p));
//        for(String word : fourWords){
//            System.out.println(word);
//        }
    }
}
