package com.reynoldregan.practice;

public class LongestSubStringPalindromeString {

    static int lstart=-1;
    static int end = -1;
    public static void main(String[]args){

        String s = "itxabcddbcaerw";
        int i=0;
        int len = 1;
        int lstart=-1;
        int end = -1;
        for(i=0; i< s.length(); i++){
            int cen = i;
            int l = cen, r = cen;
            while(l >= 0 && r < s.length()){
                if(s.charAt(l) == s.charAt(r)){
                    l--;
                    r++;
                    if(len < r-l-1){
                        len = r-l-1;
                        lstart = l+1;
                        end = r;
                    }
                    len = Math.max(len, r-l-1);
                }else{
                    break;
                }
            }

        }
        System.out.println(len);
        System.out.println(s.substring(lstart, end));
    }

  /*  void expand(int l, int r, String s){
        while(l >= 0 && r < s.length()){
            if(s.charAt(l) == s.charAt(r)){
                l--;
                r++;
                if(len < r-l-1){
                    len = r-l-1;
                    lstart = l+1;
                    end = r;
                }
                len = Math.max(len, r-l-1);
            }else{
                break;
            }
        }

    }*/
}
