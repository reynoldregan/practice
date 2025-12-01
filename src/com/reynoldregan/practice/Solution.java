package com.reynoldregan.practice;

public class Solution {
    public int findAthFibonacci(int A) {
        int a = -1;
        int b = 1;
        return getFib(A, a, b);

    }

   public int getFib(int A, int b, int c){
       if(A == 0) return c;
       int res = b +c;
       System.out.println(res);
       return  getFib(A-1, c, res );
   }

   public static void main(String[]args){
       Solution s = new Solution();
      System.out.println( s.findAthFibonacci(5));
   }
}