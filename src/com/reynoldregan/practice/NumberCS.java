package com.reynoldregan.practice;

import java.util.Arrays;
import java.util.Comparator;

public class NumberCS {
    public String largestNumber(int[] A) {
        Integer[] x = new Integer[A.length];
        int i=0;
        for(int a :A){
            x[i]=a;
            i++;
        }
        Arrays.sort(x,new LargestNumberComparator<Integer>() );
        StringBuilder sb = new StringBuilder();
        for(int a: A){
            sb.append(a);
        }
        return sb.toString();
    }
}

class LargestNumberComparator<T> implements Comparator {
    @Override
    public int compare(Object a, Object b) {
        String s1 = ""+a+""+b;
        String s2 = ""+b+""+a;
        int n1 = Integer.parseInt(s1);
        int n2 = Integer.parseInt(s2);
        if(n1 < n2){
            return -1;
        }else if(n1 > n2){
            return 1;
        }else{
            return 0;
        }
    }
}
