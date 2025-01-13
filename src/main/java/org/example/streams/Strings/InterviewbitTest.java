package org.example.streams.Strings;

public class InterviewbitTest {
   private static int counter = 0;
   
   void InterviewbitTest() {
       counter = 20;
   }
   
   InterviewbitTest(int x){
       counter = x;
   }
   public static void main(String[] args) {
       InterviewbitTest interviewbitTest = new InterviewbitTest(2);
       System.out.println(counter);
   }
}
